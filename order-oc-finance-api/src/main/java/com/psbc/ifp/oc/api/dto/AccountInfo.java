package com.psbc.ifp.oc.api.dto;

import java.io.Serializable;

public class AccountInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6311488584902510717L;
	/**
	 * 账户id
	 */
	private String accNoId ;

	public String getAccNoId() {
		return accNoId;
	}

	public void setAccNoId(String accNoId) {
		this.accNoId = accNoId;
	}
	
}
