package com.psbc.ifp.oc.api.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Prodt implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -8297818340298063821L;

	/** ��Ʒ���� */
    private String prodtName;

    /** ��Ʒ�۸� */
    private BigDecimal prodtPrice;
    /** ������� */
    private String fundCode;
    /** ��Ʒ���� */
    private BigDecimal prodtNum;

    /** �������� */
    private Date clrDate;
    /** �ֺ췽ʽ */
    private String dividMode;
    /** ��ƾ��� */
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