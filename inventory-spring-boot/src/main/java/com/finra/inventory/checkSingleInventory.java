package com.finra.inventory;
/**
 * 
 * @author manish
 * check inventory of single product
 */
public interface checkSingleInventory {
	
	   boolean CheckInventory(String productId, int qty) throws Exception;

}
