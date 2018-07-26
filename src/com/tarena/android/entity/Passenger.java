package com.tarena.android.entity;

import java.util.Date;

/**
 * 乘客类
 * @author tangliang
 *
 */
public class Passenger implements java.io.Serializable{
	
	private static final long serialVersionUID=774590167123456L;
	
	/**
	 * 乘客编号
	 */
	private int id;
	
	/**
	 * 乘客姓名
	 */
	private String name;
	
	/**
	 * 证件类型
	 */
	private String certificateType;
	
	/**
	 * 证件号码
	 */
	private String certificateNumber;
	
	/**
	 * 电话号码
	 */
	private String telephone;
	
	/**
	 * 累计消费金额
	 */
	private double totalCostingMoney;
	
	/**
	 * 累计里程
	 */
	private int totalDistance;
	
	/**
	 * 有效里程
	 */
	private int  availableMileage;
	
	/**
	 * 到年底失效里程
	 */
	private int invalidationMileageAtEndOfYear;
	
	/**
	 * 累计消费次数
	 */
	private int accuFrequency;
	
	/**
	 * 第一次订票时间
	 */
	private Date firstOrderTime;
	
	public Passenger(){}
	
	
	public int getAccuFrequency() {
		return accuFrequency;
	}
	
	public void setAccuFrequency(int accuFrequency) {
		this.accuFrequency = accuFrequency;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public int getAvailableDistance() {
		return availableMileage;
	}


	public void setAvailableDistance(int availableDistance) {
		this.availableMileage = availableDistance;
	}


	public String getCertificateNumber() {
		return certificateNumber;
	}


	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}


	public String getCertificateType() {
		return certificateType;
	}


	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}


	public Date getFirstOrderTime() {
		return firstOrderTime;
	}


	public void setFirstOrderTime(Date firstOrderTime) {
		this.firstOrderTime = firstOrderTime;
	}


	public int getInvalidationDistanceAtEndOfYear() {
		return invalidationMileageAtEndOfYear;
	}


	public void setInvalidationDistanceAtEndOfYear(
			int invalidationDistanceAtEndOfYear) {
		this.invalidationMileageAtEndOfYear = invalidationDistanceAtEndOfYear;
	}


	public double getTotalCostingMoney() {
		return totalCostingMoney;
	}


	public void setTotalCostingMoney(double totalCostingMoney) {
		this.totalCostingMoney = totalCostingMoney;
	}


	public int getTotalDistance() {
		return totalDistance;
	}


	public void setTotalDistance(int totalDistance) {
		this.totalDistance = totalDistance;
	}
	
}
