package com.tarena.android.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * Ӫҵ������
 * @author tangliang
 *
 */
public class Branch implements java.io.Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3847190257860317664L;

	/**
	 * Ӫҵ������
	 */
	private int id;
	
	/**
	 * Ӫҵ��������
	 */
	private String name;

	/**
	 * Ӫҵ�����ַ
	 */
	private String address;
	
	/**
	 * Ӫҵ����绰
	 */
	private String telephone;
	
	/**
	 * ���㴫��
	 */
	private String fax;
	
	/**
	 * ���㾭��
	 */
	private User BranchManager;
	
	/**
	 * ����ʡ��
	 */
	private Province province;
	
	/**
	 * �������
	 */
	private City city;
	
	private char type;
	
	private char state;
	
	
	
	public Branch(){}
	
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	
	public City getCity() {
		return city;
	}


	public void setCity(City city) {
		this.city = city;
	}


	public Province getProvince() {
		return province;
	}


	public void setProvince(Province province) {
		this.province = province;
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
	
	
	public String getTelephone() {
		return telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public User getBranchManager() {
		return BranchManager;
	}

	public void setBranchManager(User branchManager) {
		BranchManager = branchManager;
	}


	public String getFax() {
		return fax;
	}


	public void setFax(String fax) {
		this.fax = fax;
	}


	public char getState() {
		return state;
	}


	public void setState(char state) {
		this.state = state;
	}


	public char getType() {
		return type;
	}


	public void setType(char type) {
		this.type = type;
	}


	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((name == null) ? 0 : name.hashCode());
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
		final Branch other = (Branch) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public Map<String,Object> transferToMap(){
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("�m�W", name);
		map.put("�a�}", address);
		map.put("�q��", telephone);
		map.put("�ǯu���X", fax);
		return map;
	}

}
