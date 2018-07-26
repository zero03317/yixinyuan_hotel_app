package com.tarena.android.entity;

/**
 * 鏉冮檺绫? * @author soft01
 *
 */
public class Permission implements java.io.Serializable{
	
	private static final long serialVersionUID=771459981020473132L;
	
	/**
	 * 基本用户账户权限 1 ，包括登录，登出，修改个人资料，修改个人密码等操作
	 */
	public static final int BASE_USER_PERM=1;
	
	
	/**
	 * 基本会员账户权限 2，包括会员登录，会员查询里程，会员里程详情查询等。
	 */
	public static final int BASE_MEMBER_PERM=1<<1;
	
	
	/**
	 * 查询航班权限 4
	 */
	public static final int SEARCH_FLIGHT_PERM=1<<2;
	
	
	/**
	 * 订票权限 8，包括订票，查询个人订单等操作
	 */
	public static final int ORDER_PERM=1<<3;
	
	
	/**
	 * 支付权限 16
	 */
	public static final int PAYMENT_PERM=1<<4;
	
	
	/**
	 * 删除订单权限 32
	 */
	public static final int DELETE_ORDER_PERM=1<<5;
	
	
	/**
	 * 修改个人用户账户权限 64
	 */
	public static final int MODIFY_USER_PERM=1<<6;
	

	/**
	 * 查询网点权限 128
	 */
	public static final int FIND_BRANCH_PERM=1<<7;
	
	
	
//	public static final int MODIFY_ORDER_PERM=1<<4;
//	
//	public static final int MODIFY_ORDER_PERM=1<<4;
//	
//	public static final int MODIFY_ORDER_PERM=1<<4;
	
	
	

	
	private int id;
	
	/**
	 * 
	 */
	private int code;
	
	/**
	 * 
	 */
	private String name;
	
	private String describe;

	public Permission(){}
	
	public Permission(int code,String name){
		this.code=code;
		this.name=name;
	}
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + code;
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
		final Permission other = (Permission) obj;
		if (code != other.code)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


}
