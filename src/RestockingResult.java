/**  
*RestockingResult.java - a simple class defining the Restock object  
* @author  Trevor Gudeman
* @version 1.0 
*/ 

public class RestockingResult
{

		private String productId;
		private int amonutToRestock;
		private int inventoryLevel;
		private boolean successfullRestock;
		
		/**
		 * Creates RestockingResult object
		 * @param prodId ID of the product
		 * @param amountRestock The quantity of the product to restock
		 * @param inventoryLvl The level the inventory is at after input
		 * @param successPick Indicated whether restock was successful
		 */
		public RestockingResult(String prodId, int amountRestock, int inventoryLvl, boolean successPick){
			productId = prodId;
			amonutToRestock = amountRestock;
			inventoryLevel = inventoryLvl;
			successfullRestock = successPick;
		}
		
		/**
		 * Creates a default object which by definition is not legal
		 */
		public RestockingResult(){
			productId = "-1";
			amonutToRestock = -1;
			inventoryLevel = -1;
			successfullRestock = false;
		}
		
		
		/**
		 * Gets product ID
		 * @return ProductId
		 */
		public String getProductId(){
			return productId;
		}
		
		/**
		 * Gets amount to restock
		 * @return amount to restock
		 */
		public int getAmonutToRestock(){
			return amonutToRestock;
		}
		
		/**
		 * Gets level of inventory
		 * @return Inventory level
		 */
		public int getInventoryLevel(){
			return inventoryLevel;
		}
		
		/**
		 * Gets result of restock
		 * @return The result of the restock
		 */
		public boolean getSuccessfullRestock(){
			return successfullRestock;
		}
		
		/**
		 * Sets productId
		 * @param prodId The ID
		 */
		public void setProductId(String prodId){
			productId = prodId; 
		}
		
		/**
		 * Sets amount to pick
		 * @param amountPick The amount asked to pick
		 */
		public void setAmountToRestock(int amountPick){
			amonutToRestock = amountPick;
		}
		
		/**
		 * Sets level of inventory
		 * @param inventorylvl The current level of inventory
		 */
		public void setInventoryLevel(int inventorylvl){
			inventoryLevel = inventorylvl; 
		}
		
		/**
		 * Success of the pick
		 * @param successPick Whether pick was success
		 */
		public void setSuccessfullRestock(boolean successPick){
			successfullRestock = successPick;
		}
}

// IN main. note that haven't unit test'