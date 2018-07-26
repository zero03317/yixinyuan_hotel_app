package com.tarena.android.entity;

public class CabinClass implements java.io.Serializable{
	
	private static final long serialVersionUID = -927561432180919L;
	
	private int id;
	
	private String name;
	
	/**
	 * ��λ�ַ������������ò�λ��Ψһ��ʶ�ַ�
	 */
	private String classChar;
	
	
	/**
	 * ��λ���ͣ�������ʾ�ò�λ����λ��Ӧ�ɻ��ϵ�ͷ�Ȳ�('F')�������('C')�򾭼ò�('Y')��
	 */
	private String classType;
	
	
	/**
	 * �Ƿ�ɸ�ǩ(����)
	 */
	private boolean rescheduable;
	
	/**
	 * �Ƿ��ǩת
	 */
	private boolean transferable;
	
	/**
	 * �Ƿ����Ʊ
	 */
	private boolean refundable;
	
	
	/**
	 * �ò�λ����Ʊ�������ʡ�
	 */
	private double refundCharge;
	
	/**
	 * �ò�λ�Ļ�Ʊ�ۿ�
	 */
	private double cabinDiscount;
	
	/**
	 * �ò�λ�����ϵ��
	 */
	private double mileageFactor;
	
	

	public CabinClass() {
		super();
	}

	public double getCabinDiscount() {
		return cabinDiscount;
	}

	public void setCabinDiscount(double cabinDiscount) {
		this.cabinDiscount = cabinDiscount;
	}


	public String getClassChar() {
		return classChar;
	}

	public void setClassChar(String classChar) {
		this.classChar = classChar;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getRefundCharge() {
		return refundCharge;
	}

	public void setRefundCharge(double refundTicketCharge) {
		this.refundCharge = refundTicketCharge;
	}

	public boolean isRefundable() {
		return refundable;
	}

	public void setRefundable(boolean refundable) {
		this.refundable = refundable;
	}

	public boolean isRescheduable() {
		return rescheduable;
	}

	public void setRescheduable(boolean rescheduable) {
		this.rescheduable = rescheduable;
	}

	public boolean isTransferable() {
		return transferable;
	}

	public void setTransferable(boolean transferable) {
		this.transferable = transferable;
	}

	public double getMileageFactor() {
		return mileageFactor;
	}

	public void setMileageFactor(double mileageFactor) {
		this.mileageFactor = mileageFactor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
