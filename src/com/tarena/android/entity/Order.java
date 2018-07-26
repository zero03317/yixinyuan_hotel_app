package com.tarena.android.entity;


/**
 * ¶©µ¥Àà
 * @author tangliang
 *
 */
public class Order implements java.io.Serializable{
	private static final long serialVersionUID=5083271409871749583L;
	/**
	 * ¶©µ¥±àºÅ
	 */
	private long id;
	
	private User user;
	
	private double orderMoney;
	
	private String items;
	
	private String orderDate;
	
	private String state;
	
	private String paymentRecord;
		
	
	
	public Order(){
		
	}

	public Order(long id,  double orderMoney, String items,
			String orderDate, String state, String paymentRecord) {
		this.id = id;
		this.orderMoney = orderMoney;
		this.items = items;
		this.orderDate = orderDate;
		this.state = state;
		this.paymentRecord = paymentRecord;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}


	public String getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}


	public double getOrderMoney() {
		return orderMoney;
	}


	public void setOrderMoney(double orderMoney) {
		this.orderMoney = orderMoney;
	}


	public String getPaymentRecord() {
		return paymentRecord;
	}


	public void setPaymentRecord(String paymentRecord) {
		this.paymentRecord = paymentRecord;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
}
