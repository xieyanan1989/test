package com.psbc.ifp.oc.api.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class Coupon implements Serializable{

	/** */
	private static final long serialVersionUID = 1L;
	/** 奖品编码*/
	private String prizeCode;
	/** 奖品名称*/
	private String prizeName;
	/** 优惠金额*/
	private BigDecimal offsetAmt;
	/** 奖品类型*/
	private String prizeType;
	public Coupon(){
	}
	
	public String getPrizeCode() {
		return prizeCode;
	}

	public void setPrizeCode(String prizeCode) {
		this.prizeCode = prizeCode;
	}

	public String getPrizeName() {
		return prizeName;
	}

	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public String getPrizeType() {
		return prizeType;
	}

	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}

	public BigDecimal getOffsetAmt() {
		return offsetAmt;
	}
	public void setOffsetAmt(BigDecimal offsetAmt) {
		this.offsetAmt = offsetAmt;
	}

	@Override
	public String toString() {
		return "Coupon [prizeCode=" + prizeCode + ", prizeName=" + prizeName + ", offsetAmt=" + offsetAmt
				+ ", prizeType=" + prizeType + "]";
	}
	
}
