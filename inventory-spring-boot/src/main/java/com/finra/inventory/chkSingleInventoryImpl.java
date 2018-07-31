package com.finra.inventory;

/**
 * 
 * @author manish
 * Implementation class of singleInventory
 */
public class chkSingleInventoryImpl implements checkSingleInventory {

	@Override
	public boolean CheckInventory(String productId, int qty) throws Exception {
		boolean isProductAvilable = false ;
		if(productId!=null && qty>0) {
			productPOJO prdObject = addProductUtil.getWarehouseProduct();
		 if(prdObject.getProductId().equals(productId)
			&& prdObject.getQunatity()>=qty) {
		 	 isProductAvilable=true; 
		 }			
		}
		
		return isProductAvilable;
	}
	
	
	

}
