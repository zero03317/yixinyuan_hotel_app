package com.tarena.android.entity;

import java.util.Date;

/**
 * Ӫҵ��¼
 * @author tangliang
 *
 */
public class BusinessRecord implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2017893546190083427L;

	/**
	 * Ӫҵ��¼���
	 */
	private long id;
	
	/**
	 * Ӫҵ��¼��������ʱ��
	 */
	private Date date;
	
	/**
	 * ������Ӫҵ����
	 */
	private Branch branch;
	
	/**
	 * ӪҵԱ
	 */
	private User sales;
	
	/**
	 * Ӫҵ���
	 */
	private double amount;
	
	/**
	 * ����״̬
	 * 0��δ����
	 * 1��һ��������
	 * 2��һ���ѽ���
	 * 3������������
	 * 4�������ѽ���
	 */
	private int settleState;
	
	/**
	 * Ӫҵ�����Ļ���IP
	 */
	private String IPAddress;

	public BusinessRecord(){}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIPAddress() {
		return IPAddress;
	}

	public void setIPAddress(String address) {
		IPAddress = address;
	}

	public User getSales() {
		return sales;
	}

	public void setSales(User sales) {
		this.sales = sales;
	}

	public int getSettleState() {
		return settleState;
	}

	public void setSettleState(int settleState) {
		this.settleState = settleState;
	}
}
