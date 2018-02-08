package com.psbc.ifp.oc.api.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ContractInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4447718605558605559L;
	/**合约Id*/
	private String id;
	/*** 合约编号 */
	private String contractNo;
	/*** 平台号 */
	private String platformNo;
	/*** 原系统合约号 */
	private String oldSysContractNo;
	/*** 用户ID*/
	private String userId;
	/** 模板编号*/
	private String tmplNo;
	/** 模板名称*/
	private String tmplName;
	/** 签订时间*/
	private String signTime;
	/** 撤销时间*/
	private String cancelTime;
	/** 合约状态*/
	private String contractStatus;
	/** 生效开始时间*/
	private Date effectBgnTime;
	/** 生效结束时间*/
	private Date effectEndTime;
	/** 证件号码*/
	private String certNo;
	/** 手机号码*/
	private String mobileNo;
	/** 客户名称*/
	private String custName;
	/** 证件类型*/
	private String certType;
	/** 最低保留金额*/
	private BigDecimal minRetAmt;
	/** 虚拟二类账号*/
	private String cardNo;
	/** 渠道号*/
	private String channelNo;
	/** 理财经理*/
	private String chremMgr;
	/** 备注*/
	private String remark;
	/** 创建时间*/
	private String createTime;
	/** 更新时间*/
	private String updateTime;
	/** 产品编码*/
	private String prodtNo;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContractNo() {
		return contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	public String getPlatformNo() {
		return platformNo;
	}
	public void setPlatformNo(String platformNo) {
		this.platformNo = platformNo;
	}
	public String getOldSysContractNo() {
		return oldSysContractNo;
	}
	public void setOldSysContractNo(String oldSysContractNo) {
		this.oldSysContractNo = oldSysContractNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTmplNo() {
		return tmplNo;
	}
	public void setTmplNo(String tmplNo) {
		this.tmplNo = tmplNo;
	}
	public String getTmplName() {
		return tmplName;
	}
	public void setTmplName(String tmplName) {
		this.tmplName = tmplName;
	}
	public String getSignTime() {
		return signTime;
	}
	public void setSignTime(String signTime) {
		this.signTime = signTime;
	}
	public String getCancelTime() {
		return cancelTime;
	}
	public void setCancelTime(String cancelTime) {
		this.cancelTime = cancelTime;
	}
	public String getContractStatus() {
		return contractStatus;
	}
	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}
	
	public Date getEffectBgnTime() {
		return effectBgnTime;
	}
	public void setEffectBgnTime(Date effectBgnTime) {
		this.effectBgnTime = effectBgnTime;
	}
	public Date getEffectEndTime() {
		return effectEndTime;
	}
	public void setEffectEndTime(Date effectEndTime) {
		this.effectEndTime = effectEndTime;
	}
	public String getCertNo() {
		return certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCertType() {
		return certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}
	
	public BigDecimal getMinRetAmt() {
		return minRetAmt;
	}
	public void setMinRetAmt(BigDecimal minRetAmt) {
		this.minRetAmt = minRetAmt;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getChannelNo() {
		return channelNo;
	}
	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
	}
	public String getChremMgr() {
		return chremMgr;
	}
	public void setChremMgr(String chremMgr) {
		this.chremMgr = chremMgr;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getProdtNo() {
		return prodtNo;
	}
	public void setProdtNo(String prodtNo) {
		this.prodtNo = prodtNo;
	}
	@Override
	public String toString() {
		return "ContractInfo [id=" + id + ", contractNo=" + contractNo + ", platformNo=" + platformNo
				+ ", oldSysContractNo=" + oldSysContractNo + ", userId=" + userId + ", tmplNo=" + tmplNo + ", tmplName="
				+ tmplName + ", signTime=" + signTime + ", cancelTime=" + cancelTime + ", contractStatus="
				+ contractStatus + ", effectBgnTime=" + effectBgnTime + ", effectEndTime=" + effectEndTime + ", certNo="
				+ certNo + ", mobileNo=" + mobileNo + ", custName=" + custName + ", certType=" + certType
				+ ", minRetAmt=" + minRetAmt + ", cardNo=" + cardNo + ", channelNo=" + channelNo + ", chremMgr="
				+ chremMgr + ", remark=" + remark + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", prodtNo=" + prodtNo + "]";
	}
	
	
	
}
