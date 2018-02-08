package com.psbc.ifp.oc.api.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderInfo implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 订单ID */
    private String orderId;

    /** 订单编号 */
    private String orderNo;
    
    /** 交易代码  1.手机充值2.理财类3.主扫4.被扫*/
    private String transCode;
    /** 交易类型*/
    private String txType;

    /** 微服务编号 */
    private String serviceCode;
    
    /** 外系统类型 */
    private String outSysType;
    
    /** 客户真实姓名 */
    private String custName;

    /** 用户ID */
    private String userId;
    
    /** 创建时间 */
    private Date createTime;

    /** 更新时间 */
    private Date updateTime;

    /** 订单状态 */
    private String orderStatus;

    /** 付款状态 */
    private String payStatus;

    /** 配送状态 */
    private String shipStatus;

    /** 配送方式名称 */
    private String shipModeName;

    /** 支付方式名称 */
    private String payModeName;

    /** 总商品价格 */
    private BigDecimal totalPrice;

    /** 配送费用 */
    private BigDecimal shipAmt;

    /** 支付金额 */
    private BigDecimal payAmt;
    
    /** 订单总额 */
    private BigDecimal orderAmt;

    /** 优惠金额 */
    private BigDecimal offsetAmt;

    /** 已付金额 */
    private BigDecimal payedAmt;

    /** 总商品重量 */
    private BigDecimal totalGoodsWeight;

    /** 总商品数量 */
    private BigDecimal totalGoodsNum;

    /** 拆单状态 */
    private String splitStatus;

    /** 供应商处理状态 */
    private String handleStatus;

    /** 是否评论 */
    private String isComment;

    /** 交易币种代码 */
    private String currCode;

    /** 账户ID */
    private String accNoId;

    /** 操作员代码 */
    private String operatorCode;

    /** 操作员操作时间 */
    private Date operateTime;

    /** 是否显示订单 */
    private String showStatus;

    /** 手机号码 */
    private String mobileNo;

    /** 外围系统产品编号 */
    private String outSysProdtCode;

    /** 外围系统产品名称 */
    private String outSysProdtName;

    /** 外围系统产品类型 */
    private String outSysProdtType;

    /** 外系统交易流水号 */
    private String outSysTxSerialNo;
    
    /** 请求外系统交易流水号 */
    private String ifpTxSerialNo;
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}


	public String getOutSysType() {
		return outSysType;
	}

	public void setOutSysType(String outSysType) {
		this.outSysType = outSysType;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getShipStatus() {
		return shipStatus;
	}

	public void setShipStatus(String shipStatus) {
		this.shipStatus = shipStatus;
	}

	public String getShipModeName() {
		return shipModeName;
	}

	public void setShipModeName(String shipModeName) {
		this.shipModeName = shipModeName;
	}

	public String getPayModeName() {
		return payModeName;
	}

	public void setPayModeName(String payModeName) {
		this.payModeName = payModeName;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public BigDecimal getShipAmt() {
		return shipAmt;
	}

	public void setShipAmt(BigDecimal shipAmt) {
		this.shipAmt = shipAmt;
	}

	public BigDecimal getPayAmt() {
		return payAmt;
	}

	public void setPayAmt(BigDecimal payAmt) {
		this.payAmt = payAmt;
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

	public BigDecimal getPayedAmt() {
		return payedAmt;
	}

	public void setPayedAmt(BigDecimal payedAmt) {
		this.payedAmt = payedAmt;
	}

	public BigDecimal getTotalGoodsWeight() {
		return totalGoodsWeight;
	}

	public void setTotalGoodsWeight(BigDecimal totalGoodsWeight) {
		this.totalGoodsWeight = totalGoodsWeight;
	}

	public BigDecimal getTotalGoodsNum() {
		return totalGoodsNum;
	}

	public void setTotalGoodsNum(BigDecimal totalGoodsNum) {
		this.totalGoodsNum = totalGoodsNum;
	}

	public String getSplitStatus() {
		return splitStatus;
	}

	public void setSplitStatus(String splitStatus) {
		this.splitStatus = splitStatus;
	}

	public String getHandleStatus() {
		return handleStatus;
	}

	public void setHandleStatus(String handleStatus) {
		this.handleStatus = handleStatus;
	}

	public String getIsComment() {
		return isComment;
	}

	public void setIsComment(String isComment) {
		this.isComment = isComment;
	}

	public String getCurrCode() {
		return currCode;
	}

	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}

	public String getAccNoId() {
		return accNoId;
	}

	public void setAccNoId(String accNoId) {
		this.accNoId = accNoId;
	}

	public String getOperatorCode() {
		return operatorCode;
	}

	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}

	public Date getOperateTime() {
		return operateTime;
	}

	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	public String getShowStatus() {
		return showStatus;
	}

	public void setShowStatus(String showStatus) {
		this.showStatus = showStatus;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getOutSysProdtCode() {
		return outSysProdtCode;
	}

	public void setOutSysProdtCode(String outSysProdtCode) {
		this.outSysProdtCode = outSysProdtCode;
	}

	public String getOutSysProdtName() {
		return outSysProdtName;
	}

	public void setOutSysProdtName(String outSysProdtName) {
		this.outSysProdtName = outSysProdtName;
	}

	public String getOutSysProdtType() {
		return outSysProdtType;
	}

	public void setOutSysProdtType(String outSysProdtType) {
		this.outSysProdtType = outSysProdtType;
	}

	public String getOutSysTxSerialNo() {
		return outSysTxSerialNo;
	}

	public void setOutSysTxSerialNo(String outSysTxSerialNo) {
		this.outSysTxSerialNo = outSysTxSerialNo;
	}

	public String getTransCode() {
		return transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public String getTxType() {
		return txType;
	}

	public void setTxType(String txType) {
		this.txType = txType;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getIfpTxSerialNo() {
		return ifpTxSerialNo;
	}

	public void setIfpTxSerialNo(String ifpTxSerialNo) {
		this.ifpTxSerialNo = ifpTxSerialNo;
	}

	@Override
	public String toString() {
		return "OrderInfo [orderId=" + orderId + ", orderNo=" + orderNo + ", transCode=" + transCode + ", txType="
				+ txType + ", serviceCode=" + serviceCode + ", outSysType=" + outSysType + ", custName=" + custName
				+ ", userId=" + userId + ", createTime=" + createTime + ", updateTime=" + updateTime + ", orderStatus="
				+ orderStatus + ", payStatus=" + payStatus + ", shipStatus=" + shipStatus + ", shipModeName="
				+ shipModeName + ", payModeName=" + payModeName + ", totalPrice=" + totalPrice + ", shipAmt=" + shipAmt
				+ ", payAmt=" + payAmt + ", orderAmt=" + orderAmt + ", offsetAmt=" + offsetAmt + ", payedAmt="
				+ payedAmt + ", totalGoodsWeight=" + totalGoodsWeight + ", totalGoodsNum=" + totalGoodsNum
				+ ", splitStatus=" + splitStatus + ", handleStatus=" + handleStatus + ", isComment=" + isComment
				+ ", currCode=" + currCode + ", accNoId=" + accNoId + ", operatorCode=" + operatorCode
				+ ", operateTime=" + operateTime + ", showStatus=" + showStatus + ", mobileNo=" + mobileNo
				+ ", outSysProdtCode=" + outSysProdtCode + ", outSysProdtName=" + outSysProdtName + ", outSysProdtType="
				+ outSysProdtType + ", outSysTxSerialNo=" + outSysTxSerialNo + ", ifpTxSerialNo=" + ifpTxSerialNo + "]";
	}
}