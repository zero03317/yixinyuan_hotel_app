package com.tarena.android.entity;

import java.util.Date;

/**
 * ª·‘±∫Ω≥Ã
 * @author Administrator
 *
 */
public class MemberStage implements java.io.Serializable{
	
	private static final long serialVersionUID = 7018209211356674191L;
	
	private long stageId;
	
	private Membership member;
	
	private Airport fromAirport;
	
	private Airport toAirport;
	
	private int stageMileage;
	
	private String flihtNum;
	
	private String cabinClass;
	
	private Date stageDate;
	
	private int account_mileage;
	
	
	public MemberStage(){
		
	}
	

	public int getAccount_mileage() {
		return account_mileage;
	}

	public void setAccount_mileage(int account_mileage) {
		this.account_mileage = account_mileage;
	}

	public String getCabinClass() {
		return cabinClass;
	}

	public void setCabinClass(String cabinClass) {
		this.cabinClass = cabinClass;
	}

	public String getFlihtNum() {
		return flihtNum;
	}

	public void setFlihtNum(String flihtNum) {
		this.flihtNum = flihtNum;
	}

	public Airport getFromAirport() {
		return fromAirport;
	}

	public void setFromAirport(Airport fromAirport) {
		this.fromAirport = fromAirport;
	}

	public Membership getMember() {
		return member;
	}

	public void setMember(Membership member) {
		this.member = member;
	}

	public Date getStageDate() {
		return stageDate;
	}

	public void setStageDate(Date stageDate) {
		this.stageDate = stageDate;
	}

	public long getStageId() {
		return stageId;
	}

	public void setStageId(long stageId) {
		this.stageId = stageId;
	}

	public int getStageMileage() {
		return stageMileage;
	}

	public void setStageMileage(int stageMileage) {
		this.stageMileage = stageMileage;
	}

	public Airport getToAirport() {
		return toAirport;
	}

	public void setToAirport(Airport toAirport) {
		this.toAirport = toAirport;
	}

}
