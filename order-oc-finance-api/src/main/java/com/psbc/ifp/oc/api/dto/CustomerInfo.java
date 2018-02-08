package com.psbc.ifp.oc.api.dto;

import java.io.Serializable;

public class CustomerInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 客户id
	 */
	private String userId ;
	/**
	 * 客户姓名
	 */
	private String userName ;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
