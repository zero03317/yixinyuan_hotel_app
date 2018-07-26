package com.tarena.android.entity;

/**
 * 航线类
 * @author tangliang
 *
 */
public class Route implements java.io.Serializable{
	
	private static final long serialVersionUID=5083192766459713424L;
	
	/**
	 * 航线编号
	 */
	private int id;
	
	/**
	 * 出发机场
	 */
	private Airport fromAirport;
	
	/**
	 * 到达机场
	 */
	private Airport toAirport;
	
	/**
	 * 航程距离
	 */
	private int distance;
	
	/**
	 * 回程航线
	 */
	private Route reverseRoute;
	
	
	/**
	 * 基准票价
	 */
	private double baseTicketPrice;
	
	/**
	 * 该航线每周航班个数
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
