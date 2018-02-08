package com.psbc.ifp.oc.api.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Prodt implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -8297818340298063821L;

	/** 产品名称 */
    private String prodtName;

    /** 产品价格 */
    private BigDecimal prodtPrice;
    /** 基金代码 */
    private String fundCode;
    /** 产品数量 */
    private BigDecimal prodtNum;

    /** 清算日期 */
    private Date clrDate;
    /** 分红方式 */
    private String dividMode;
    /** 理财经理 */
    private String chremMgr;
	public String getProdtName() {
		return prodtName;
	}
	public void setProdtName(String prodtName) {
		this.prodtName = prodtName;
	}
	public BigDecimal getProdtPrice() {
		return prodtPrice;
	}
	public void setProdtPrice(BigDecimal prodtPrice) {
		this.prodtPrice = prodtPrice;
	}
	public String getFundCode() {
		return fundCode;
	}
	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}
	public BigDecimal getProdtNum() {
		return prodtNum;
	}
	public void setProdtNum(BigDecimal prodtNum) {
		this.prodtNum = prodtNum;
	}
	public Date getClrDate() {
		return clrDate;
	}
	public void setClrDate(Date clrDate) {
		this.clrDate = clrDate;
	}
	public String getDividMode() {
		return dividMode;
	}
	public void setDividMode(String dividMode) {
		this.dividMode = dividMode;
	}
	public String getChremMgr() {
		return chremMgr;
	}
	public void setChremMgr(String chremMgr) {
		this.chremMgr = chremMgr;
	}
	@Override
	public String toString() {
		return "Prodt [prodtName=" + prodtName + ", prodtPrice=" + prodtPrice + ", fundCode=" + fundCode + ", prodtNum="
				+ prodtNum + ", clrDate=" + clrDate + ", dividMode=" + dividMode + ", chremMgr=" + chremMgr + "]";
	}
    
	
    
}