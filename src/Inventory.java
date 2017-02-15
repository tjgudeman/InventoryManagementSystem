/**  
 *Inventory.java - This class creates the data structure which will hold each products ID and inventory level
 * @author  Trevor Gudeman
 * @version 1.0 
 */
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Inventory implements InventoryManagementSystem
{
	private ConcurrentHashMap<String, Integer> ProductStorage = new ConcurrentHashMap<String, Integer>()
	{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
		}
	};

	/**
	 * Adds item to the hash map. Called from restockProuct function
	 * 
	 * @param productId
	 *            The ID to the product which will be added to the hash map.
	 */
	public void addItem(String productId)
	{
		ProductStorage.putIfAbsent(productId, 0); // Emphasize thread safe
													// adding
		System.out.println("Product: " + productId
				+ " has been added to the system.");
	}

	/**
	 * Restocks items if they meet requirements
	 * 
	 * @param productId
	 *            The ID to the product which is being restocked
	 * @param amount
	 *            The integer amount being restocked
	 */
	public RestockingResult restockProduct(String productId, int amount)
	{
		if (amount < 1)
			return new RestockingResult();

		if (!ProductStorage.containsKey(productId))
		{
			addItem(productId);
		}
		Integer newInventory = ProductStorage.get(productId);
		newInventory += amount;
		ProductStorage.put(productId, newInventory);
		return new RestockingResult(productId, amount, newInventory, true);
	}

	/**
	 * Reduces product inventory if request is valid
	 * 
	 * @param productId
	 *            The ID to the product which is being requested
	 * @param amountRequested
	 *            The integer amount being requested
	 */
	public PickingResult pickProduct(String productId, int amountRequested)
	{
		int availableInventory = ProductStorage.get(productId);
		if (ProductStorage.get(productId) == null)
		{
			return new PickingResult();
		}
		if (!legalPickTest(amountRequested, availableInventory, productId))
			return new PickingResult();
		availableInventory -= amountRequested;
		ProductStorage.put(productId, availableInventory);
		return new PickingResult(productId, amountRequested,
				availableInventory, true);
	}

	/**
	 * Check to see if request is legal
	 * 
	 * @param amount
	 *            The amount of product requested
	 * @param available
	 *            The amount of product available
	 * @param productId
	 *            The ID of the product being requested
	 * @return Boolean value depending on whether request is legal
	 */
	private boolean legalPickTest(int amount, int available, String productId)
	{
		if (amount > available || !ProductStorage.containsKey(productId))
			return false;
		return true;
	}

	/**
	 * For testing purposes, allows user to see all items in hash map
	 */
	public void seeAll()
	{
		for (Map.Entry entry : ProductStorage.entrySet())
		{
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}

	}
}
