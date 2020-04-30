package com.ehomepay.reconciliation.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CashLklPosEntity {
    private BigDecimal lpPkid;

    private String lpClaredate;

    private String lpMerchantnum;

    private String lpMerchantname;

    private String lpTerminalnum;

    private String lpTrandate;

    private String lpTrantime;

    private String lpTrantype;

    private String lpCardtype;

    private String lpCardnum;

    private BigDecimal lpTranamount;

    private BigDecimal lpFee;

    private BigDecimal lpClareamount;

    private String lpReferenceno;

    private String lpOrdernum;

    private String lpTrannum;

    private Date lpCreateTime;

    private String lpField1;

    private String lpField2;

    private String lpField3;

    private String lpField4;

    public BigDecimal getLpPkid() {
        return lpPkid;
    }

    public void setLpPkid(BigDecimal lpPkid) {
        this.lpPkid = lpPkid;
    }

    public String getLpClaredate() {
        return lpClaredate;
    }

    public void setLpClaredate(String lpClaredate) {
        this.lpClaredate = lpClaredate == null ? null : lpClaredate.trim();
    }

    public String getLpMerchantnum() {
        return lpMerchantnum;
    }

    public void setLpMerchantnum(String lpMerchantnum) {
        this.lpMerchantnum = lpMerchantnum == null ? null : lpMerchantnum.trim();
    }

    public String getLpMerchantname() {
        return lpMerchantname;
    }

    public void setLpMerchantname(String lpMerchantname) {
        this.lpMerchantname = lpMerchantname == null ? null : lpMerchantname.trim();
    }

    public String getLpTerminalnum() {
        return lpTerminalnum;
    }

    public void setLpTerminalnum(String lpTerminalnum) {
        this.lpTerminalnum = lpTerminalnum == null ? null : lpTerminalnum.trim();
    }

    public String getLpTrandate() {
        return lpTrandate;
    }

    public void setLpTrandate(String lpTrandate) {
        this.lpTrandate = lpTrandate == null ? null : lpTrandate.trim();
    }

    public String getLpTrantime() {
        return lpTrantime;
    }

    public void setLpTrantime(String lpTrantime) {
        this.lpTrantime = lpTrantime == null ? null : lpTrantime.trim();
    }

    public String getLpTrantype() {
        return lpTrantype;
    }

    public void setLpTrantype(String lpTrantype) {
        this.lpTrantype = lpTrantype == null ? null : lpTrantype.trim();
    }

    public String getLpCardtype() {
        return lpCardtype;
    }

    public void setLpCardtype(String lpCardtype) {
        this.lpCardtype = lpCardtype == null ? null : lpCardtype.trim();
    }

    public String getLpCardnum() {
        return lpCardnum;
    }

    public void setLpCardnum(String lpCardnum) {
        this.lpCardnum = lpCardnum == null ? null : lpCardnum.trim();
    }

    public BigDecimal getLpTranamount() {
        return lpTranamount;
    }

    public void setLpTranamount(BigDecimal lpTranamount) {
        this.lpTranamount = lpTranamount;
    }

    public BigDecimal getLpFee() {
        return lpFee;
    }

    public void setLpFee(BigDecimal lpFee) {
        this.lpFee = lpFee;
    }

    public BigDecimal getLpClareamount() {
        return lpClareamount;
    }

    public void setLpClareamount(BigDecimal lpClareamount) {
        this.lpClareamount = lpClareamount;
    }

    public String getLpReferenceno() {
        return lpReferenceno;
    }

    public void setLpReferenceno(String lpReferenceno) {
        this.lpReferenceno = lpReferenceno == null ? null : lpReferenceno.trim();
    }

    public String getLpOrdernum() {
        return lpOrdernum;
    }

    public void setLpOrdernum(String lpOrdernum) {
        this.lpOrdernum = lpOrdernum == null ? null : lpOrdernum.trim();
    }

    public String getLpTrannum() {
        return lpTrannum;
    }

    public void setLpTrannum(String lpTrannum) {
        this.lpTrannum = lpTrannum == null ? null : lpTrannum.trim();
    }

    public Date getLpCreateTime() {
        return lpCreateTime;
    }

    public void setLpCreateTime(Date lpCreateTime) {
        this.lpCreateTime = lpCreateTime;
    }

    public String getLpField1() {
        return lpField1;
    }

    public void setLpField1(String lpField1) {
        this.lpField1 = lpField1 == null ? null : lpField1.trim();
    }

    public String getLpField2() {
        return lpField2;
    }

    public void setLpField2(String lpField2) {
        this.lpField2 = lpField2 == null ? null : lpField2.trim();
    }

    public String getLpField3() {
        return lpField3;
    }

    public void setLpField3(String lpField3) {
        this.lpField3 = lpField3 == null ? null : lpField3.trim();
    }

    public String getLpField4() {
        return lpField4;
    }

    public void setLpField4(String lpField4) {
        this.lpField4 = lpField4 == null ? null : lpField4.trim();
    }
}