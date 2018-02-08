package com.psbc.ifp.oc.api;

import com.psbc.ifp.common.exception.IFException;
import com.psbc.ifp.oc.api.dto.ReqOrderInsertFinancePOJO;
import com.psbc.ifp.oc.api.dto.RespOrderInsertFinancePOJO;

/**
 * 功能描述：demo请求服务
 * 开发人员：demo
 * 开发版本： 1.0
 * 开发时间：2017年12月28日20:02:28
 * 注意事项：无
 */
public interface IOrderInsertFinanceService {

	/**
	 * 功能描述：测试正常反馈报文
	 * 开发人员：demo
	 * 开发时间：2017年12月28日20:11:12
	 * @param reqPOJO
	 * @return respPOJO
	 * @throws IFException
	 */
    public RespOrderInsertFinancePOJO orderInsertFinance(ReqOrderInsertFinancePOJO reqPOJO) throws IFException;
    
}
