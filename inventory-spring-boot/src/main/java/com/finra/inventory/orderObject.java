package com.finra.inventory;

/**
 * 
 * @author manish
 * Domain object for Order
 */
public class orderObject {

	 public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getQunatity() {
		return qunatity;
	}
	public void setQunatity(int qunatity) {
		this.qunatity = qunatity;
	}
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	private String productId;
	 private int qunatity;
	 private String creditCardNumber;
	 private double amount;
	 
	
	 
	 
}
