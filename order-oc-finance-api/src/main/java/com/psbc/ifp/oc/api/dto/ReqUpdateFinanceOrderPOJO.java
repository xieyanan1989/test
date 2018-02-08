package com.psbc.ifp.oc.api.dto;

import java.math.BigDecimal;

import com.psbc.ifp.common.dto.PubRequest;

public class ReqUpdateFinanceOrderPOJO extends PubRequest{

	
	private static final long serialVersionUID = 1L;
	/** 订单号*/
	private long orderId;
	/** 用户id*/
	private String userId;
	/** 支付平台交易流水号*/
	private String outSysTxSerialNo;
	/** 商户号*/
	private String merCode;
	/** 商户名称*/
	private String merName;
	/** 交易状态*/
	private String txStatus;
	/** 交易类型*/
	private String txType;
	/** 渠道类型*/
	private String chnlType;
	/** 支付类型*/
	private String payType;
	/** 支付金额*/
	private BigDecimal payAmt;
	/** 付款账号*/
	private String accNo;
	/** 付款人姓名*/
	private String accName;
	/** 发卡机构标识码*/
	private String issCode;
	/** 账户ID*/
	private String accNoId;
	/** 账户类型*/
	private String acctType;
	/** 收款人姓名*/
	private String payeeName;
	/** 证件类型*/
	private String certType;
	/** 证件号码*/
	private String certNo;
	/** 卡类型属性*/
	private String cardAttr;
	/** 备注*/
	private String remark;
	/** 银行卡预留手机号码*/
	private String mobileNo;
	/** 认证状态*/
	private String verState;
	/** 二维码类型*/
	private String qrType;
	/** 提示信息*/
	private String promptInfo;
	/** 付款凭证号*/
	private String voucherNum;
	/** 设备标识*/
	private String deviceId;
	/** 设备类型*/
	private String deviceType;
	/** IP*/
	private String sourceIp;
	/** 设备 GPS 位置*/
	private String deviceLocation;
	/** 设备 SIM 卡号码*/
	private String fullDeviceNumber;
	/** 订单编号*/
	private String orderNo;
	/** 外系统交易流水号*/
	private String ifpTxSerialNo;
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getOutSysTxSerialNo() {
		return outSysTxSerialNo;
	}
	public void setOutSysTxSerialNo(String outSysTxSerialNo) {
		this.outSysTxSerialNo = outSysTxSerialNo;
	}
	public String getMerCode() {
		return merCode;
	}
	public void setMerCode(String merCode) {
		this.merCode = merCode;
	}
	public String getMerName() {
		return merName;
	}
	public void setMerName(String merName) {
		this.merName = merName;
	}
	public String getTxStatus() {
		return txStatus;
	}
	public void setTxStatus(String txStatus) {
		this.txStatus = txStatus;
	}
	public String getTxType() {
		return txType;
	}
	public void setTxType(String txType) {
		this.txType = txType;
	}
	public String getChnlType() {
		return chnlType;
	}
	public void setChnlType(String chnlType) {
		this.chnlType = chnlType;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public BigDecimal getPayAmt() {
		return payAmt;
	}
	public void setPayAmt(BigDecimal payAmt) {
		this.payAmt = payAmt;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getIssCode() {
		return issCode;
	}
	public void setIssCode(String issCode) {
		this.issCode = issCode;
	}
	public String getAccNoId() {
		return accNoId;
	}
	public void setAccNoId(String accNoId) {
		this.accNoId = accNoId;
	}
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	
	public String getCertType() {
		return certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertNo() {
		return certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCardAttr() {
		return cardAttr;
	}
	public void setCardAttr(String cardAttr) {
		this.cardAttr = cardAttr;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getVerState() {
		return verState;
	}
	public void setVerState(String verState) {
		this.verState = verState;
	}
	public String getQrType() {
		return qrType;
	}
	public void setQrType(String qrType) {
		this.qrType = qrType;
	}
	public String getPromptInfo() {
		return promptInfo;
	}
	public void setPromptInfo(String promptInfo) {
		this.promptInfo = promptInfo;
	}
	public String getVoucherNum() {
		return voucherNum;
	}
	public void setVoucherNum(String voucherNum) {
		this.voucherNum = voucherNum;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getSourceIp() {
		return sourceIp;
	}
	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
	}
	public String getDeviceLocation() {
		return deviceLocation;
	}
	public void setDeviceLocation(String deviceLocation) {
		this.deviceLocation = deviceLocation;
	}
	public String getFullDeviceNumber() {
		return fullDeviceNumber;
	}
	public void setFullDeviceNumber(String fullDeviceNumber) {
		this.fullDeviceNumber = fullDeviceNumber;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	
	public String getPayeeName() {
		return payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}
	
	public String getIfpTxSerialNo() {
		return ifpTxSerialNo;
	}
	public void setIfpTxSerialNo(String ifpTxSerialNo) {
		this.ifpTxSerialNo = ifpTxSerialNo;
	}
	@Override
	public String toString() {
		return "ReqUpdateFinanceOrderPOJO [orderId=" + orderId + ", userId=" + userId + ", outSysTxSerialNo="
				+ outSysTxSerialNo + ", merCode=" + merCode + ", merName=" + merName + ", txStatus=" + txStatus
				+ ", txType=" + txType + ", chnlType=" + chnlType + ", payType=" + payType + ", payAmt=" + payAmt
				+ ", accNo=" + accNo + ", accName=" + accName + ", issCode=" + issCode + ", accNoId=" + accNoId
				+ ", acctType=" + acctType + ", payeeName=" + payeeName + ", certType=" + certType + ", certNo="
				+ certNo + ", cardAttr=" + cardAttr + ", remark=" + remark + ", mobileNo=" + mobileNo + ", verState="
				+ verState + ", qrType=" + qrType + ", promptInfo=" + promptInfo + ", voucherNum=" + voucherNum
				+ ", deviceId=" + deviceId + ", deviceType=" + deviceType + ", sourceIp=" + sourceIp
				+ ", deviceLocation=" + deviceLocation + ", fullDeviceNumber=" + fullDeviceNumber + ", orderNo="
				+ orderNo + ", ifpTxSerialNo=" + ifpTxSerialNo + "]";
	}
	
}
