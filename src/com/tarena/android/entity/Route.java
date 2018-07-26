package com.tarena.android.entity;

/**
 * ������
 * @author tangliang
 *
 */
public class Route implements java.io.Serializable{
	
	private static final long serialVersionUID=5083192766459713424L;
	
	/**
	 * ���߱��
	 */
	private int id;
	
	/**
	 * ��������
	 */
	private Airport fromAirport;
	
	/**
	 * �������
	 */
	private Airport toAirport;
	
	/**
	 * ���̾���
	 */
	private int distance;
	
	/**
	 * �س̺���
	 */
	private Route reverseRoute;
	
	
	/**
	 * ��׼Ʊ��
	 */
	private double baseTicketPrice;
	
	/**
	 * �ú���ÿ�ܺ������
	 */
	private int flightNumPerWeek;

	public Route(){}
	
	public Route(Airport fromAirport, Airport toAirport, int distance,
			int flightNumPerWeek) {
		super();
		this.fromAirport = fromAirport;
		this.toAirport = toAirport;
		this.distance = distance;
		this.flightNumPerWeek = flightNumPerWeek;
	}
	public double getBaseTicketPrice() {
		return baseTicketPrice;
	}
	
	public void setBaseTicketPrice(double baseTicketPrice) {
		this.baseTicketPrice = baseTicketPrice;
	}
	
	public int getDistance() {
		return distance;
	}
	
	public void setDistance(int distanceAmount) {
		this.distance = distanceAmount;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Airport getFromAirport() {
		return fromAirport;
	}
	
	public void setFromAirport(Airport srcAirport) {
		this.fromAirport = srcAirport;
	}
	
	public Airport getToAirport() {
		return toAirport;
	}
	
	public void setToAirport(Airport tagAirport) {
		this.toAirport = tagAirport;
	}


	public Route getReverseRoute() {
		return reverseRoute;
	}


	public void setReverseRoute(Route reverseRoute) {
		this.reverseRoute = reverseRoute;
	}


	public int getFlightNumPerWeek() {
		return flightNumPerWeek;
	}


	public void setFlightNumPerWeek(int flightNumPerWeek) {
		this.flightNumPerWeek = flightNumPerWeek;
	}
	
	
	
}
