package com.tarena.android.entity;

import java.util.Date;

/**
 * ��Ա��
 * @author Administrator
 *
 */
public class Membership implements java.io.Serializable{
	
	private static final long serialVersionUID = -13452089130992L;
	/**
	 * ��Ա���
	 */
	private int mebID;
	
	/**
	 * ��Ա����
	 */
	private String mebCard;
	
	/**
	 * ��Ա����
	 */
	private String mebPassword;
	
	
	/**
	 * ��Ա����
	 */
	private String mebName;
	
	
	/**
	 * ��Ա�Ա�
	 */
	private String mebGender;
	
	
	/**
	 * ��Ա����
	 */
	private Date mebBirthday;
	
	
	/**
	 * ��Ա֤������
	 */
	private String mebCertificateType;
	
	
	/**
	 * ��Ա֤������
	 */
	private String mebCertificateNumber;
	
	
	/**
	 * ��Ա�绰1
	 */
	private String mebTelNum1;
	
	
	/**
	 * ��Ա�绰2
	 */
	private String mebTelNum2;
	
	
	/**
	 * ��Ա����ʡ��
	 */
	private String mebProvince;
	
	/**
	 * ��Ա���ڳ���
	 */
	private String mebCity;
	
	
	/**
	 * ��Աͨ�ŵ�ַ
	 */
	private String mebAddress;
	
	/**
	 * ��������
	 */
	private String mebPostZip;
	

	public Membership() {
		super();
	}

	public String getMebAddress() {
		return mebAddress;
	}

	public void setMebAddress(String mebAddress) {
		this.mebAddress = mebAddress;
	}

	public Date getMebBirthday() {
		return mebBirthday;
	}

	public void setMebBirthday(Date mebBirthday) {
		this.mebBirthday = mebBirthday;
	}

	public String getMebCard() {
		return mebCard;
	}

	public void setMebCard(String mebCard) {
		this.mebCard = mebCard;
	}

	public String getMebCertificateNumber() {
		return mebCertificateNumber;
	}

	public void setMebCertificateNumber(String mebCertificateNumber) {
		this.mebCertificateNumber = mebCertificateNumber;
	}

	public String getMebCertificateType() {
		return mebCertificateType;
	}

	public void setMebCertificateType(String mebCertificateType) {
		this.mebCertificateType = mebCertificateType;
	}

	public String getMebCity() {
		return mebCity;
	}

	public void setMebCity(String mebCity) {
		this.mebCity = mebCity;
	}

	public String getMebGender() {
		return mebGender;
	}

	public void setMebGender(String mebGender) {
		this.mebGender = mebGender;
	}

	public int getMebID() {
		return mebID;
	}

	public void setMebID(int mebID) {
		this.mebID = mebID;
	}

	public String getMebName() {
		return mebName;
	}

	public void setMebName(String mebName) {
		this.mebName = mebName;
	}

	public String getMebPassword() {
		return mebPassword;
	}

	public void setMebPassword(String mebPassword) {
		this.mebPassword = mebPassword;
	}

	public String getMebPostZip() {
		return mebPostZip;
	}

	public void setMebPostZip(String mebPostZip) {
		this.mebPostZip = mebPostZip;
	}

	public String getMebProvince() {
		return mebProvince;
	}

	public void setMebProvince(String mebProvince) {
		this.mebProvince = mebProvince;
	}

	public String getMebTelNum1() {
		return mebTelNum1;
	}

	public void setMebTelNum1(String mebTelNum1) {
		this.mebTelNum1 = mebTelNum1;
	}

	public String getMebTelNum2() {
		return mebTelNum2;
	}

	public void setMebTelNum2(String mebTelNum2) {
		this.mebTelNum2 = mebTelNum2;
	}


}
