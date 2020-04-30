package com.ehomepay.reconciliation.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BcsScanpayrecordEntity {
    private BigDecimal pkid;

    private String info;

    private String trxdttm;

    private String appid;

    private String openid;

    private String merchid;

    private String submerchid;

    private String trxid;

    private String paymentseq;

    private String paytype;

    private String accounttype;

    private String bank;

    private BigDecimal settleamount;

    private BigDecimal transamount;

    private BigDecimal couponamount;

    private String feerate;

    private BigDecimal fee;

    private BigDecimal clearamount;

    private String tradetype;

    private String oritrxid;

    private String oripaymentseq;

    private BigDecimal summryId;

    private Date creattime;

    private Date updatetime;

    private String remark;

    private String status;

    private String bcsstatus;

    private String bodymsg;

    public BigDecimal getPkid() {
        return pkid;
    }

    public void setPkid(BigDecimal pkid) {
        this.pkid = pkid;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public String getTrxdttm() {
        return trxdttm;
    }

    public void setTrxdttm(String trxdttm) {
        this.trxdttm = trxdttm == null ? null : trxdttm.trim();
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getMerchid() {
        return merchid;
    }

    public void setMerchid(String merchid) {
        this.merchid = merchid == null ? null : merchid.trim();
    }

    public String getSubmerchid() {
        return submerchid;
    }

    public void setSubmerchid(String submerchid) {
        this.submerchid = submerchid == null ? null : submerchid.trim();
    }

    public String getTrxid() {
        return trxid;
    }

    public void setTrxid(String trxid) {
        this.trxid = trxid == null ? null : trxid.trim();
    }

    public String getPaymentseq() {
        return paymentseq;
    }

    public void setPaymentseq(String paymentseq) {
        this.paymentseq = paymentseq == null ? null : paymentseq.trim();
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }

    public String getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype == null ? null : accounttype.trim();
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public BigDecimal getSettleamount() {
        return settleamount;
    }

    public void setSettleamount(BigDecimal settleamount) {
        this.settleamount = settleamount;
    }

    public BigDecimal getTransamount() {
        return transamount;
    }

    public void setTransamount(BigDecimal transamount) {
        this.transamount = transamount;
    }

    public BigDecimal getCouponamount() {
        return couponamount;
    }

    public void setCouponamount(BigDecimal couponamount) {
        this.couponamount = couponamount;
    }

    public String getFeerate() {
        return feerate;
    }

    public void setFeerate(String feerate) {
        this.feerate = feerate == null ? null : feerate.trim();
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getClearamount() {
        return clearamount;
    }

    public void setClearamount(BigDecimal clearamount) {
        this.clearamount = clearamount;
    }

    public String getTradetype() {
        return tradetype;
    }

    public void setTradetype(String tradetype) {
        this.tradetype = tradetype == null ? null : tradetype.trim();
    }

    public String getOritrxid() {
        return oritrxid;
    }

    public void setOritrxid(String oritrxid) {
        this.oritrxid = oritrxid == null ? null : oritrxid.trim();
    }

    public String getOripaymentseq() {
        return oripaymentseq;
    }

    public void setOripaymentseq(String oripaymentseq) {
        this.oripaymentseq = oripaymentseq == null ? null : oripaymentseq.trim();
    }

    public BigDecimal getSummryId() {
        return summryId;
    }

    public void setSummryId(BigDecimal summryId) {
        this.summryId = summryId;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getBcsstatus() {
        return bcsstatus;
    }

    public void setBcsstatus(String bcsstatus) {
        this.bcsstatus = bcsstatus == null ? null : bcsstatus.trim();
    }

    public String getBodymsg() {
        return bodymsg;
    }

    public void setBodymsg(String bodymsg) {
        this.bodymsg = bodymsg == null ? null : bodymsg.trim();
    }
}