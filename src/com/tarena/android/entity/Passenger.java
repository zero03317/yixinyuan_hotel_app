package com.tarena.android.entity;

import java.util.Date;

/**
 * �˿���
 * @author tangliang
 *
 */
public class Passenger implements java.io.Serializable{
	
	private static final long serialVersionUID=774590167123456L;
	
	/**
	 * �˿ͱ��
	 */
	private int id;
	
	/**
	 * �˿�����
	 */
	private String name;
	
	/**
	 * ֤������
	 */
	private String certificateType;
	
	/**
	 * ֤������
	 */
	private String certificateNumber;
	
	/**
	 * �绰����
	 */
	private String telephone;
	
	/**
	 * �ۼ����ѽ��
	 */
	private double totalCostingMoney;
	
	/**
	 * �ۼ����
	 */
	private int totalDistance;
	
	/**
	 * ��Ч���
	 */
	private int  availableMileage;
	
	/**
	 * �����ʧЧ���
	 */
	private int invalidationMileageAtEndOfYear;
	
	/**
	 * �ۼ����Ѵ���
	 */
	private int accuFrequency;
	
	/**
	 * ��һ�ζ�Ʊʱ��
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
