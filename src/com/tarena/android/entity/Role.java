package com.tarena.android.entity;

/**
 * 
 *
 */
public class Role implements java.io.Serializable{
	
	private static final long serialVersionUID=2290909022909090L;
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
	private int permissionCode;
	
	/**
	 * 
	 */
	private String describe;
	
	public Role(){}
	
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
	
	public int getPermissionCode() {
		return permissionCode;
	}
	
	public void setPermissionCode(int powCode) {
		this.permissionCode = powCode;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
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
		final Role other = (Role) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
}
