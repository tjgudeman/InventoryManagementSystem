/**
 * Copyright (c) 1999-2016 Commerce Technologies Inc. All rights reserved.
 * Implementations of this interface including access to shared data must be
thread-safe.
 **/
public interface InventoryManagementSystem {
 /**
 * Deduct 'amountToPick' of the given 'productId' from inventory.
 * @param productId The ID of the product to pick
 * @param amountToPick The quantity of the product to pick
 * @return productId The ID of the product to pick, amountToPick The quantity of the product to pick, inventoryLevel The  inventory level currently available, successfullPick Boolean indicating if pick was legal
 */
 PickingResult pickProduct(String productId, int amountToPick);
 /**
 * Add 'amountToRestock' of the given productId to inventory.
 * @param productId The ID of the product to restock
 * @param amountToRestock The quantity of the product to restock
 * @return productId The ID of the product to restock, amountToPick The quantity of the product to restock, inventoryLevel The  inventory level currently available, successfullPick Boolean indicating if pick was legal
 */
 RestockingResult restockProduct(String productId, int amountToRestock);
}