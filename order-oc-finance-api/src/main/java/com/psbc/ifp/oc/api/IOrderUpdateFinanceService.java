package com.psbc.ifp.oc.api;

import com.psbc.ifp.common.exception.IFException;
import com.psbc.ifp.oc.api.dto.ReqUpdateFinanceOrderPOJO;
import com.psbc.ifp.oc.api.dto.RespUpdateFinanceOrderPOJO;

public interface IOrderUpdateFinanceService {

	/**
	 * 功能描述：测试正常反馈报文
	 * 开发人员：demo
	 * 开发时间：2017年12月28日20:11:12
	 * @param reqPOJO
	 * @return respPOJO
	 * @throws IFException
	 */
    public RespUpdateFinanceOrderPOJO updateFinanceOrder(ReqUpdateFinanceOrderPOJO reqPOJO) throws IFException;
    
}
