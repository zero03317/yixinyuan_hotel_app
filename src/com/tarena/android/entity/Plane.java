package com.tarena.android.entity;


/**
 * �ɻ��࣬���������ú��չ�˾��һ�ܷɻ�
 * @author tangliang
 *
 */
public class Plane implements java.io.Serializable{
	
	private static final long serialVersionUID=330633073308991L;
	
	/**
	 * �ɻ����
	 */
	private int id;
	
	/**
	 * �ɻ��Ϻ�
	 */
	private String number;
	
	
	/**
	 * �ɻ��ͺ�
	 */
	private String model;
	
	/**
	 * ���쳧��
	 */
	private String manufacturer;
	
	
	/**
	 * ͷ�Ȳ���λ
	 */
	private int firstSeats;
	
	/**
	 * �������λ
	 */
	private int businessSeats;
	
	/**
	 * ���ò���λ
	 */
	private int economySeats;
	
	/**
	 * ��󺽳�
	 */
	private int maxDistance;
	
	
	/**
	 * �ɻ���λ����ͼƬ·��
	 */
	private String picPath;
	

	public Plane(){}
	
	
	
	public int getBusinessSeats() {
		return businessSeats;
	}
	
	public void setBusinessSeats(int businessSeats) {
		this.businessSeats = businessSeats;
	}
	
	
	public int getEconomySeats() {
		return economySeats;
	}
	
	public void setEconomySeats(int economySeats) {
		this.economySeats = economySeats;
	}
	
	public int getFirstSeats() {
		return firstSeats;
	}
	public void setFirstSeats(int firstSeats) {
		this.firstSeats = firstSeats;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public int getMaxDistance() {
		return maxDistance;
	}
	
	public void setMaxDistance(int maxDistance) {
		this.maxDistance = maxDistance;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String type) {
		this.model = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPicPath() {
		return picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
	
}
