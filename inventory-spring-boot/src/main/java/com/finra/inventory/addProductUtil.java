package com.finra.inventory;

/**
 * 
 * @author manish
 * This class is util class to add product in warehouse 
 */
public  class addProductUtil {
	
	static productPOJO prd=null;
	static orderObject ordObj = null;
	static void addProduct(String productId,int quantity) {
	if (quantity>0) {
		prd = new productPOJO();
			prd.setQunatity(quantity);
			prd.setId(Math.random());
			prd.setDescription("Launch date is 2017");
			prd.setProductId(productId);
			prd.setReview("20000");
			
	}
	setWarehouseProduct(prd);
			
	}		
	
	private static void setWarehouseProduct(productPOJO prdObj) {
		
		prd = prdObj;
	}
	static productPOJO getWarehouseProduct() {
		
		return prd;
	}
	

	static orderObject  placeOrder(String productId,int quantity,String creditCardNumber,double amount) {

		ordObj = new orderObject();
		ordObj.setAmount(amount);
		ordObj.setCreditCardNumber(creditCardNumber);
		ordObj.setProductId(productId);
		ordObj.setQunatity(quantity);
		return ordObj;
		
		
     }	
	
	
	
}	
	