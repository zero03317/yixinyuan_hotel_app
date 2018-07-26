package com.tarena.android.entity;


import java.util.List;


/**
 * 航班计划
 * @author tangliang
 *
 */
public class FlightPlan implements java.io.Serializable{
	
	private static final long serialVersionUID=7543901827149176L;
	
	
	/**
	 * 航班计划编号，与业务无关的唯一号码，如:17254
	 */
	private String id;
	
	/**
	 * 航班号，例如：TL1202
	 */
	private String no;
	
	/**
	 * 航班计划开始日期
	 */
	private String startString;
	
	/**
	 * 航班计划结束日期
	 */
	private String endString;
	
	/**
	 * 出发地机场
	 */
	private Airport fromAirport;
	
	/**
	 * 到达地机场
	 */
	private Airport toAirport;
	
	/**
	 * 出发时间
	 */
	private String leaveTime;
	
	/**
	 * 到达时间
	 */
	private String arriveTime;
	
	/**
	 * 航班班期
	 */
	private int schedule;
	
	/**
	 * 基准票价
	 */
	private int baseTicketPrice;
	

	public FlightPlan(){}
	
	/**
	 * 得到该航班计划下的所有航班
	 * @return
	 */
	public List<Flight> getAllFlights(){
		//?????
		return null;
	}
	
	
	/**
	 * 得到指定日期间的该航班计划下的所有航班
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
