package com.tarena.android.entity;

/**
 * Airport������������һ������
 *  @author tangliang
 *
 */
public class Airport implements java.io.Serializable{
	
	private static final long serialVersionUID=-1897643021784617L;
	
	/**
	 * �������
	 */
	private int id;
	
	/**
	 * ��������
	 */
	private String name;
	
	/**
	 * ��������ʡ��
	 */
	private Province province;
	
	/**
	 * ������������
	 */
	private City city;
	
	/**
	 * �������к���ƴ��
	 */
	private String citySpell;
	
	
	/**
	 * ����������
	 */
	private String code;
	
	/**
	 * �����ȼ�
	 */
	private String grand;
	
	
	/**
	 * ���ۺ�������
	 */
	private int departureRoutesNumber;
	
	/**
	 * ���ۺ�������
	 */
	private int arrivalRoutesNumber;
	
	private int departureFlightNumPerWeek;
	
	private int arrivalFlightNumPerWeek;
	
	public Airport(){}
	
	public int getArrivalRoutesNumber() {
		return arrivalRoutesNumber;
	}
	
	public void setArrivalRoutesNumber(int arriveLinesNumber) {
		this.arrivalRoutesNumber = arriveLinesNumber;
	}
	
	public int getDepartureRoutesNumber() {
		return departureRoutesNumber;
	}
	
	public void setDepartureRoutesNumber(int leaveLinesNumber) {
		this.departureRoutesNumber = leaveLinesNumber;
	}
	
	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getCitySpell() {
		return citySpell;
	}
	
	public void setCitySpell(String cityAlpha) {
		this.citySpell = cityAlpha;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Province getProvince() {
		return province;
	}


	public void setProvince(Province province) {
		this.province = province;
	}

	public int getArrivalFlightNumPerWeek() {
		return arrivalFlightNumPerWeek;
	}

	public void setArrivalFlightNumPerWeek(int arrivalFlightNumPerWeek) {
		this.arrivalFlightNumPerWeek = arrivalFlightNumPerWeek;
	}

	public int getDepartureFlightNumPerWeek() {
		return departureFlightNumPerWeek;
	}

	public void setDepartureFlightNumPerWeek(int departureFlightNumPerWeek) {
		this.departureFlightNumPerWeek = departureFlightNumPerWeek;
	}

	public String getGrand() {
		return grand;
	}

	public void setGrand(String grand) {
		this.grand = grand;
	}
	
	public String toString(){
		return city+"-"+name+"("+code+")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airport other = (Airport) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
