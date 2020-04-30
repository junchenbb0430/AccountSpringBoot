package com.ehomepay.reconciliation.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CashBocPosEntity {
    private Integer bpPkid;

    private String bpClaredate;

    private String bpMerchantnum;

    private String bpMerchantname;

    private String bpTerminalnum;

    private String bpTrandate;

    private String bpTrantime;

    private String bpTrantype;

    private String bpPaytype;

    private String bpCardtype;

    private String bpOutcard;

    private String bpCardnum;

    private BigDecimal bpTranamount;

    private BigDecimal bpFee;

    private BigDecimal bpClareamount;

    private String bpReferenceno;

    private String bpOrdernum;

    private String bpTrannum;

    private Date bpCreateTime;

    private String bpField1;

    private String bpField2;

    private String bpField3;

    private String bpField4;

     

    public Integer getBpPkid() {
		return bpPkid;
	}

	public void setBpPkid(Integer bpPkid) {
		this.bpPkid = bpPkid;
	}

	public String getBpClaredate() {
        return bpClaredate;
    }

    public void setBpClaredate(String bpClaredate) {
        this.bpClaredate = bpClaredate == null ? null : bpClaredate.trim();
    }

    public String getBpMerchantnum() {
        return bpMerchantnum;
    }

    public void setBpMerchantnum(String bpMerchantnum) {
        this.bpMerchantnum = bpMerchantnum == null ? null : bpMerchantnum.trim();
    }

    public String getBpMerchantname() {
        return bpMerchantname;
    }

    public void setBpMerchantname(String bpMerchantname) {
        this.bpMerchantname = bpMerchantname == null ? null : bpMerchantname.trim();
    }

    public String getBpTerminalnum() {
        return bpTerminalnum;
    }

    public void setBpTerminalnum(String bpTerminalnum) {
        this.bpTerminalnum = bpTerminalnum == null ? null : bpTerminalnum.trim();
    }

    public String getBpTrandate() {
        return bpTrandate;
    }

    public void setBpTrandate(String bpTrandate) {
        this.bpTrandate = bpTrandate == null ? null : bpTrandate.trim();
    }

    public String getBpTrantime() {
        return bpTrantime;
    }

    public void setBpTrantime(String bpTrantime) {
        this.bpTrantime = bpTrantime == null ? null : bpTrantime.trim();
    }

    public String getBpTrantype() {
        return bpTrantype;
    }

    public void setBpTrantype(String bpTrantype) {
        this.bpTrantype = bpTrantype == null ? null : bpTrantype.trim();
    }

    public String getBpPaytype() {
        return bpPaytype;
    }

    public void setBpPaytype(String bpPaytype) {
        this.bpPaytype = bpPaytype == null ? null : bpPaytype.trim();
    }

    public String getBpCardtype() {
        return bpCardtype;
    }

    public void setBpCardtype(String bpCardtype) {
        this.bpCardtype = bpCardtype == null ? null : bpCardtype.trim();
    }

    public String getBpOutcard() {
        return bpOutcard;
    }

    public void setBpOutcard(String bpOutcard) {
        this.bpOutcard = bpOutcard == null ? null : bpOutcard.trim();
    }

    public String getBpCardnum() {
        return bpCardnum;
    }

    public void setBpCardnum(String bpCardnum) {
        this.bpCardnum = bpCardnum == null ? null : bpCardnum.trim();
    }

    public BigDecimal getBpTranamount() {
        return bpTranamount;
    }

    public void setBpTranamount(BigDecimal bpTranamount) {
        this.bpTranamount = bpTranamount;
    }

    public BigDecimal getBpFee() {
        return bpFee;
    }

    public void setBpFee(BigDecimal bpFee) {
        this.bpFee = bpFee;
    }

    public BigDecimal getBpClareamount() {
        return bpClareamount;
    }

    public void setBpClareamount(BigDecimal bpClareamount) {
        this.bpClareamount = bpClareamount;
    }

    public String getBpReferenceno() {
        return bpReferenceno;
    }

    public void setBpReferenceno(String bpReferenceno) {
        this.bpReferenceno = bpReferenceno == null ? null : bpReferenceno.trim();
    }

    public String getBpOrdernum() {
        return bpOrdernum;
    }

    public void setBpOrdernum(String bpOrdernum) {
        this.bpOrdernum = bpOrdernum == null ? null : bpOrdernum.trim();
    }

    public String getBpTrannum() {
        return bpTrannum;
    }

    public void setBpTrannum(String bpTrannum) {
        this.bpTrannum = bpTrannum == null ? null : bpTrannum.trim();
    }

    public Date getBpCreateTime() {
        return bpCreateTime;
    }

    public void setBpCreateTime(Date bpCreateTime) {
        this.bpCreateTime = bpCreateTime;
    }

    public String getBpField1() {
        return bpField1;
    }

    public void setBpField1(String bpField1) {
        this.bpField1 = bpField1 == null ? null : bpField1.trim();
    }

    public String getBpField2() {
        return bpField2;
    }

    public void setBpField2(String bpField2) {
        this.bpField2 = bpField2 == null ? null : bpField2.trim();
    }

    public String getBpField3() {
        return bpField3;
    }

    public void setBpField3(String bpField3) {
        this.bpField3 = bpField3 == null ? null : bpField3.trim();
    }

    public String getBpField4() {
        return bpField4;
    }

    public void setBpField4(String bpField4) {
        this.bpField4 = bpField4 == null ? null : bpField4.trim();
    }
}