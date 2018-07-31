package com.finra.inventory;

/**
 * 
 * @author manish
 * product domain object
 */
public class productPOJO {

	private int id;
	
	private int qunatity;
	public int getQunatity() {
		return qunatity;
	}
	public void setQunatity(int qunatity) {
		this.qunatity = qunatity;
	}

	private String productId;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getId() {
		return id;
	}
	public void setId(double d) {
		this.id = (int) d;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	
	private String description;
	private String review;
	
	
	
}
