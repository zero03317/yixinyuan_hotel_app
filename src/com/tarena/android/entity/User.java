package com.tarena.android.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 用户类
 * @author tangliang
 *
 */
public class User implements Serializable{
	private static final long serialVersionUID=-371560756421779L;
	
	/**
	 * 
	 */
	private int id;
	
	/**
	 * 
	 */
	private String name;	
	
	/**
	 * 
	 */
	private String loginName;
	
	/**
	 * 
	 */
	private String password;
	
	/**
	 * 
	 */
	private String telephone;
	
	/**
	 * 
	 */
	private String email;
	
	/**
	 * 
	 */
	private Branch branch;
	
	/**
	 * 
	 */
	private Role role;
	
	/**
	 * 
	 */
	private int permissionCode;
	
	/**
	 * 
	 */
	private String state;
	
	/**
	 * 
	 */
	private Date registeTime;
	
	/**
	 * 
	 */
	private Date lastLoginTime;
	
	/**
	 * 最后一次提交请求时间
	 */
	private Date lastActionTime;
	
	
	private String type;
	
	/**
	 * 相关乘客
	 */
	private List<Passenger> relativePassengers=new ArrayList<Passenger>();
	

	
	public User(){}
	
	public User(String loginName){
		this.loginName=loginName;
	}
	
	public User(String loginName,String password){
		this.loginName=loginName;
		this.password=password;
	}
	
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((loginName == null) ? 0 : loginName.hashCode());
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
		final User other = (User) obj;
		if (loginName == null) {
			if (other.loginName != null)
				return false;
		} else if (!loginName.equals(other.loginName))
			return false;
		return true;
	}
	

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	
	public String getLoginName() {
		return loginName;
	}
	
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	

	
	public Role getRole() {
		return role;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public int getPermissionCode() {
		return permissionCode;
	}

	public void setPermissionCode(int permissionCode) {
		this.permissionCode = permissionCode;
	}

	public Date getRegisteTime() {
		return registeTime;
	}

	public void setRegisteTime(Date registeTime) {
		this.registeTime = registeTime;
	}

	public Branch getBranch() {
		return branch;
	}
	
	public void setBranch(Branch web) {
		this.branch = web;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getLastActionTime() {
		return lastActionTime;
	}

	public void setLastActionTime(Date lastActionTime) {
		this.lastActionTime = lastActionTime;
	}

	public List<Passenger> getRelativePassengers() {
		return relativePassengers;
	}

	public void setRelativePassengers(List<Passenger> relativePassengers) {
		this.relativePassengers = relativePassengers;
	}
	
	public void addPassenger(Passenger pass){
		relativePassengers.add(pass);
	}

	
}
