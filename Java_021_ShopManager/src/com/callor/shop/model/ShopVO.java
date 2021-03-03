package com.callor.shop.model;

public class ShopVO {

	// 정보 은닉
	private String userName;
	private String productName;
	private int qty;
	private int price;
	private int total;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "ShopVO [userName=" + userName + ", productName=" + productName + ", qty=" + qty + ", price=" + price
				+ ", total=" + total + "]";
	}
	
}
