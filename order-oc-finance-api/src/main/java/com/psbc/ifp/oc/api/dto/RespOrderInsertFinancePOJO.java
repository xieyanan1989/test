package com.psbc.ifp.oc.api.dto;

import com.psbc.ifp.common.dto.PubResponse;

/**
 * 功能描述： demo响应参数
 * 开发人员：demo
 * 开发版本： 1.0
 * 开发时间：2017年12月28日20:00:31
 * 注意事项：无
 */
public class RespOrderInsertFinancePOJO extends PubResponse{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private OrderInfo orderInfo ;
	
	public OrderInfo getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(OrderInfo orderInfo) {
		this.orderInfo = orderInfo;
	}

	@Override
	public String toString() {
		return "RespOrderInsertFinancePOJO [orderInfo=" + orderInfo.toString() + "]";
	}

	
}
