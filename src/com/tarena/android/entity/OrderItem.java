package com.tarena.android.entity;

/**
 * ¶©µ¥Ïî
 * @author tangliang
 *
 */
public class OrderItem implements java.io.Serializable{
	private static final long serialVersionUID=171891243145667L;
	
	private long id;
	
	private Flight flight;
	
	private Passenger passenger;
	
	private CabinClass cabinClass;
	
	private int seatsOrder;
	
	private double ticketPrice;
	
	private double tax1Price;
	
	private double tax2Price;
	
	private double totalPrice;
	

	public OrderItem() {
		super();
	}

	public CabinClass getCabinClass() {
		return cabinClass;
	}

	public void setCabinClass(CabinClass cabinClass) {
		this.cabinClass = cabinClass;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public double getTax1Price() {
		return tax1Price;
	}

	public void setTax1Price(double tax1Price) {
		this.tax1Price = tax1Price;
	}

	public double getTax2Price() {
		return tax2Price;
	}

	public void setTax2Price(double tax2Price) {
		this.tax2Price = tax2Price;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getSeatsOrder() {
		return seatsOrder;
	}

	public void setSeatsOrder(int seatsOrder) {
		this.seatsOrder = seatsOrder;
	}
	

}
