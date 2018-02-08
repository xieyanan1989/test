package com.psbc.ifp.oc.api.dto;

import com.psbc.ifp.common.dto.PubResponse;

public class RespUpdateFinanceOrderPOJO extends PubResponse{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private OrderInfo ocOrderInfo;
	
	public OrderInfo getOcOrderInfo() {
		return ocOrderInfo;
	}

	public void setOcOrderInfo(OrderInfo ocOrderInfo) {
		this.ocOrderInfo = ocOrderInfo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "RespUpdateFinanceOrderPOJO [ocOrderInfo=" + ocOrderInfo.toString() + "]";
	}

}
