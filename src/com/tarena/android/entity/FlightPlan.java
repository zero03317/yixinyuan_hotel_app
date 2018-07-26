package com.tarena.android.entity;


import java.util.List;


/**
 * ����ƻ�
 * @author tangliang
 *
 */
public class FlightPlan implements java.io.Serializable{
	
	private static final long serialVersionUID=7543901827149176L;
	
	
	/**
	 * ����ƻ���ţ���ҵ���޹ص�Ψһ���룬��:17254
	 */
	private String id;
	
	/**
	 * ����ţ����磺TL1202
	 */
	private String no;
	
	/**
	 * ����ƻ���ʼ����
	 */
	private String startString;
	
	/**
	 * ����ƻ���������
	 */
	private String endString;
	
	/**
	 * �����ػ���
	 */
	private Airport fromAirport;
	
	/**
	 * ����ػ���
	 */
	private Airport toAirport;
	
	/**
	 * ����ʱ��
	 */
	private String leaveTime;
	
	/**
	 * ����ʱ��
	 */
	private String arriveTime;
	
	/**
	 * �������
	 */
	private int schedule;
	
	/**
	 * ��׼Ʊ��
	 */
	private int baseTicketPrice;
	

	public FlightPlan(){}
	
	/**
	 * �õ��ú���ƻ��µ����к���
	 * @return
	 */
	public List<Flight> getAllFlights(){
		//?????
		return null;
	}
	
	
	/**
	 * �õ�ָ�����ڼ�ĸú���ƻ��µ����к���
	 * @param from
	 * @param to
	 * @return
	 */
	public List<Flight> getAllFlights(String from,String to){
		//????
		return null;
	}


	public String getArriveTime() {
		return arriveTime;
	}


	public void setArriveTime(String arriveTime) {
		this.arriveTime = arriveTime;
	}


	public String getEndString() {
		return endString;
	}


	public void setEndString(String endString) {
		this.endString = endString;
	}


	public Airport getFromAirport() {
		return fromAirport;
	}


	public void setFromAirport(Airport fromAirport) {
		this.fromAirport = fromAirport;
	}


	public String getId() {
		return id;
	}


	public void setString(String id) {
		this.id = id;
	}


	public String getLeaveTime() {
		return leaveTime;
	}


	public void setLeaveTime(String leaveTime) {
		this.leaveTime = leaveTime;
	}


	public String getNo() {
		return no;
	}


	public void setNo(String no) {
		this.no = no;
	}


	public int getSchedule() {
		return schedule;
	}


	public void setSchedule(int schedule) {
		this.schedule = schedule;
	}


	public String getStartString() {
		return startString;
	}


	public void setStartString(String startString) {
		this.startString = startString;
	}


	public int getBaseTicketPrice() {
		return baseTicketPrice;
	}


	public void setBaseTicketPrice(int ticketPrice) {
		this.baseTicketPrice = ticketPrice;
	}


	public Airport getToAirport() {
		return toAirport;
	}


	public void setToAirport(Airport toAirport) {
		this.toAirport = toAirport;
	}

}
