package com.psbc.ifp.oc.api.dto;

import java.math.BigDecimal;
import java.util.List;

import com.psbc.ifp.common.dto.PubRequest;


/**
 * 功能描述：demo请求参数
 * 开发人员：demo
 * 开发版本： 1.0
 * 开发时间：2017年12月28日20:00:31
 * 注意事项：无
 */
public class ReqOrderInsertFinancePOJO extends PubRequest{
	
	
	private static final long serialVersionUID = 1L;
	/**
	 * 用户Id
	 */
	private String userId;
	/**
	 * 用户姓名
	 */
	private String custName;
	/**
	 * 订单总额
	 */
	private BigDecimal orderAmt;
	/**
	 * 优惠金额
	 */
	private BigDecimal offsetAmt;
	/**
	 * 支付金额
	 */
	private BigDecimal payAmt;
	/**
	 * 虚拟二类账户
	 */
	private String cardNo;
	/**
	 * 账户余额
	 */
	private BigDecimal accBal;
	/**
	 * 理财类型
	 */
	private String chremType;
	/**
	 * 交易货币代码
	 */
	private String currCode;
	/**
	 * 优惠券信息列表
	 */
	private List<Coupon>  couponList; 
	/**
	 * 产品信息列表
	 */
	private List<Prodt>  prodtList;
	/**
	 * 合约信息
	 */
	private ContractInfo contractInfo;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public BigDecimal getOrderAmt() {
		return orderAmt;
	}
	public void setOrderAmt(BigDecimal orderAmt) {
		this.orderAmt = orderAmt;
	}
	public BigDecimal getOffsetAmt() {
		return offsetAmt;
	}
	public void setOffsetAmt(BigDecimal offsetAmt) {
		this.offsetAmt = offsetAmt;
	}
	
	public BigDecimal getPayAmt() {
		return payAmt;
	}
	public void setPayAmt(BigDecimal payAmt) {
		this.payAmt = payAmt;
	}
	public List<Coupon> getCouponList() {
		return couponList;
	}
	public void setCouponList(List<Coupon> couponList) {
		this.couponList = couponList;
	}
	
	public List<Prodt> getProdtList() {
		return prodtList;
	}
	public void setProdtList(List<Prodt> prodtList) {
		this.prodtList = prodtList;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public ContractInfo getContractInfo() {
		return contractInfo;
	}
	public void setContractInfo(ContractInfo contractInfo) {
		this.contractInfo = contractInfo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public BigDecimal getAccBal() {
		return accBal;
	}
	public void setAccBal(BigDecimal accBal) {
		this.accBal = accBal;
	}
	
	public String getChremType() {
		return chremType;
	}
	public void setChremType(String chremType) {
		this.chremType = chremType;
	}
	
	public String getCurrCode() {
		return currCode;
	}
	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}
	@Override
	public String toString() {
		return "ReqOrderInsertFinancePOJO [userId=" + userId + ", custName=" + custName + ", orderAmt=" + orderAmt
				+ ", offsetAmt=" + offsetAmt + ", payAmt=" + payAmt + ", cardNo=" + cardNo + ", accBal=" + accBal
				+ ", chremType=" + chremType + ", currCode=" + currCode + ", couponList=" + couponList + ", prodtList="
				+ prodtList + ", contractInfo=" + contractInfo + "]";
	}
	
	
}
