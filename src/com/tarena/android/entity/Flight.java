package com.tarena.android.entity;

import java.util.Date;
import java.util.List;

/**
 * ������
 * @author tangliang
 *
 */
public class Flight implements java.io.Serializable{
	
	private static final long serialVersionUID=4083251978045713037L;
	
	/**
	 * ������
	 */
	private String flightId;
	
	/**
	 * �����
	 */
	private String flightNum;
	
	/**
	 * ִ�к���
	 */
	private Route route;

	
	/**
	 * ��������
	 */
	private Date depDate;
	
	/**
	 * ��������
	 */
	private Date arrDate;
	
	
	/**
	 * ʣ��ͷ�Ȳ���λ��
	 */
	private int F_seates_remian;
	
	/**
	 * ʣ�๫�����λ��
	 */
	private int C_seats_remain;
	
	/**
	 * ʣ�ྭ�ò���λ��
	 */
	private int Y_seats_remain;
	
	/**
	 * ��ѡ��λ�б�
	 */
	private List<CabinClass> selectableClass;
	
	/**
	 * �����׼�۸�
	 */
	private double fullBasePrice;
	
	/**
	 * ��ǰ��λ��ͼ۸�
	 */
	private double minTicketPrice;
	
	/**
	 * ���������
	 */
	private double tax1;
	
	
	/**
	 * ȼ��˰
	 */
	private double tax2;
	
	
	/**
	 * ִ�зɻ�
	 */
	private Plane plane;
	
	
	/**
	 * ����״̬
	 */
	private char state;
	
	/**
	 * ��ǰ�������
	 */
	private int currentOrder;

	public Flight(){}
	public Flight(String flightNum, Date depDate, Date arrDate,
			Plane plane,int f_seates_remian, int c_seats_remain, int y_seats_remain,
			double fullBasePrice, double minTicketPrice, double tax1,
			double tax2 ) {
		super();
		this.flightNum = flightNum;
		this.depDate = depDate;
		this.arrDate = arrDate;
		F_seates_remian = f_seates_remian;
		C_seats_remain = c_seats_remain;
		Y_seats_remain = y_seats_remain;
		this.fullBasePrice = fullBasePrice;
		this.minTicketPrice = minTicketPrice;
		this.tax1 = tax1;
		this.tax2 = tax2;
		this.plane = plane;
		
	}

	

	public String getFlightId() {
		return flightId;
	}


	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}




	public double getMinTicketPrice() {
		return minTicketPrice;
	}
	
	public void setMinTicketPrice(double minTicketPrice) {
		this.minTicketPrice = minTicketPrice;
	}


	public int getC_seats_remain() {
		return C_seats_remain;
	}


	public void setC_seats_remain(int c_seats_remain) {
		C_seats_remain = c_seats_remain;
	}


	public int getF_seates_remian() {
		return F_seates_remian;
	}


	public void setF_seates_remian(int f_seates_remian) {
		F_seates_remian = f_seates_remian;
	}


	public String getFlightNum() {
		return flightNum;
	}


	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}


	public double getFullBasePrice() {
		return fullBasePrice;
	}


	public void setFullBasePrice(double fullBasePrice) {
		this.fullBasePrice = fullBasePrice;
	}


	public Plane getPlane() {
		return plane;
	}


	public void setPlane(Plane plane) {
		this.plane = plane;
	}


	public List<CabinClass> getSelectableClass() {
		return selectableClass;
	}


	public void setSelectableClass(List<CabinClass> selectableClass) {
		this.selectableClass = selectableClass;
	}


	public char getState() {
		return state;
	}


	public void setState(char state) {
		this.state = state;
	}


	public int getY_seats_remain() {
		return Y_seats_remain;
	}


	public void setY_seats_remain(int y_seats_remain) {
		Y_seats_remain = y_seats_remain;
	}


	public int getCurrentOrder() {
		return currentOrder;
	}


	public void setCurrentOrder(int currentOrder) {
		this.currentOrder = currentOrder;
	}


	public Date getArrDate() {
		return arrDate;
	}


	public void setArrDate(Date arrDate) {
		this.arrDate = arrDate;
	}


	public Date getDepDate() {
		return depDate;
	}


	public void setDepDate(Date depDate) {
		this.depDate = depDate;
	}


	public Route getRoute() {
		return route;
	}


	public void setRoute(Route route) {
		this.route = route;
	}


	public double getTax1() {
		return tax1;
	}


	public void setTax1(double tax1) {
		this.tax1 = tax1;
	}


	public double getTax2() {
		return tax2;
	}


	public void setTax2(double tax2) {
		this.tax2 = tax2;
	}
	
	
	
}
