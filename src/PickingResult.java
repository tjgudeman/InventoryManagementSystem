/**  
*PickingResult.java - a simple class defining the PickingResult object  
* @author  Trevor Gudeman
* @version 1.0 
*/ 
public class PickingResult
{
	private String productId;
	private int amonutToPick;
	private int inventoryLevel;
	private boolean successfullPick;
	  
	/**
	 * Creates PickingResult object
	 * @param prodId ID of the product
	 * @param amountPick The quantity of the product to pick
	 * @param inventoryLvl The level the inventory is at after the with drawl
	 * @param successPick Indicated whether pick was successful
	 */
	public PickingResult(String prodId, int amountPick, int inventoryLvl, boolean successPick){
		productId = prodId;
		amonutToPick = amountPick;
		inventoryLevel = inventoryLvl;
		successfullPick = successPick;
	}
	
	/**
	 * Creates a default object which by definition is not legal
	 */
	public PickingResult(){
		productId = "-1";
		amonutToPick = -1;
		inventoryLevel = -1;
		successfullPick = false;
	}
	
	
	/**
	 * Gets product ID
	 * @return The productId
	 */
	public String getProductId(){
		return productId;
	}
	
	/**
	 * Amount to pick
	 * @return Amount to pick from Inventory
	 */
	public int getAmonutToPick(){
		return amonutToPick;
	}
	
	/**
	 * Get current level of inventory
	 * @return Inventory Level
	 */
	public int getInventoryLevel(){
		return inventoryLevel;
	}
	
	/**
	 * Successful Pick
	 * @return Whether pick was successful or not
	 */
	public boolean getSuccessfulPick(){
		return successfullPick;
	}
	
	/**
	 * Sets Product ID
	 * @param prodId The ID of the product
	 */
	public void setProductId(String prodId){
		productId = prodId; 
	}
	
	/**
	 * Sets amount to pick
	 * @param amountPick The amonut requested
	 */
	public void setAmountToPick(int amountPick){
		amonutToPick = amountPick;
	}
	
	/**
	 * Sets inventory level
	 * @param inventorylvl The current inventory level
	 */
	public void setInventoryLevel(int inventorylvl){
		inventoryLevel = inventorylvl; 
	}
	
	/**
	 * Sets whether pick was successful
	 * @param successPick Success of the pick
	 */
	public void setSuccessfullPick(boolean successPick){
		successfullPick = successPick;
	}
	
}
