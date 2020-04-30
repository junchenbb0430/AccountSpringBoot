package com.ehomepay.reconciliation.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ClearComfirmEntity {
    private BigDecimal pkid;

    private BigDecimal transId;

    private String trxid;

    private String channelid;

    private String paymentseq;

    private String channelflow;

    private Date systemdate;

    private Date finishdate;

    private String trxdirection;

    private BigDecimal trxamount;

    private String payerAccounttype;

    private String payerAccountnum;

    private String payerAccountname;

    private Date createTime;

    private Date updateTime;

    private String remark;

    private String spbilldate;

    private String spbillstatus;

    private String payerBankname;

    private String attenSpbill;

    private Date orderTime;

    private String trxStatus;

    private Date transBeginDate;

    private String transType;

    private String systemType;

    private String clearMode;

    private String innerAcctNo;

    private String bizType;

    private String orderNo;

    private Date clearDate;

    private Date coreAcctTime;

    private String coreAcctFlow;

    private String parentAcctNo;

    private String merchantAcctName;

    private String ehpTpIdNo;

    private String bizCode;

    private String transCode;

    private String merchantCode;

    private String bankCode;

    public BigDecimal getPkid() {
        return pkid;
    }

    public void setPkid(BigDecimal pkid) {
        this.pkid = pkid;
    }

    public BigDecimal getTransId() {
        return transId;
    }

    public void setTransId(BigDecimal transId) {
        this.transId = transId;
    }

    public String getTrxid() {
        return trxid;
    }

    public void setTrxid(String trxid) {
        this.trxid = trxid == null ? null : trxid.trim();
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public String getPaymentseq() {
        return paymentseq;
    }

    public void setPaymentseq(String paymentseq) {
        this.paymentseq = paymentseq == null ? null : paymentseq.trim();
    }

    public String getChannelflow() {
        return channelflow;
    }

    public void setChannelflow(String channelflow) {
        this.channelflow = channelflow == null ? null : channelflow.trim();
    }

    public Date getSystemdate() {
        return systemdate;
    }

    public void setSystemdate(Date systemdate) {
        this.systemdate = systemdate;
    }

    public Date getFinishdate() {
        return finishdate;
    }

    public void setFinishdate(Date finishdate) {
        this.finishdate = finishdate;
    }

    public String getTrxdirection() {
        return trxdirection;
    }

    public void setTrxdirection(String trxdirection) {
        this.trxdirection = trxdirection == null ? null : trxdirection.trim();
    }

    public BigDecimal getTrxamount() {
        return trxamount;
    }

    public void setTrxamount(BigDecimal trxamount) {
        this.trxamount = trxamount;
    }

    public String getPayerAccounttype() {
        return payerAccounttype;
    }

    public void setPayerAccounttype(String payerAccounttype) {
        this.payerAccounttype = payerAccounttype == null ? null : payerAccounttype.trim();
    }

    public String getPayerAccountnum() {
        return payerAccountnum;
    }

    public void setPayerAccountnum(String payerAccountnum) {
        this.payerAccountnum = payerAccountnum == null ? null : payerAccountnum.trim();
    }

    public String getPayerAccountname() {
        return payerAccountname;
    }

    public void setPayerAccountname(String payerAccountname) {
        this.payerAccountname = payerAccountname == null ? null : payerAccountname.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getSpbilldate() {
        return spbilldate;
    }

    public void setSpbilldate(String spbilldate) {
        this.spbilldate = spbilldate == null ? null : spbilldate.trim();
    }

    public String getSpbillstatus() {
        return spbillstatus;
    }

    public void setSpbillstatus(String spbillstatus) {
        this.spbillstatus = spbillstatus == null ? null : spbillstatus.trim();
    }

    public String getPayerBankname() {
        return payerBankname;
    }

    public void setPayerBankname(String payerBankname) {
        this.payerBankname = payerBankname == null ? null : payerBankname.trim();
    }

    public String getAttenSpbill() {
        return attenSpbill;
    }

    public void setAttenSpbill(String attenSpbill) {
        this.attenSpbill = attenSpbill == null ? null : attenSpbill.trim();
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getTrxStatus() {
        return trxStatus;
    }

    public void setTrxStatus(String trxStatus) {
        this.trxStatus = trxStatus == null ? null : trxStatus.trim();
    }

    public Date getTransBeginDate() {
        return transBeginDate;
    }

    public void setTransBeginDate(Date transBeginDate) {
        this.transBeginDate = transBeginDate;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType == null ? null : transType.trim();
    }

    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType == null ? null : systemType.trim();
    }

    public String getClearMode() {
        return clearMode;
    }

    public void setClearMode(String clearMode) {
        this.clearMode = clearMode == null ? null : clearMode.trim();
    }

    public String getInnerAcctNo() {
        return innerAcctNo;
    }

    public void setInnerAcctNo(String innerAcctNo) {
        this.innerAcctNo = innerAcctNo == null ? null : innerAcctNo.trim();
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType == null ? null : bizType.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Date getClearDate() {
        return clearDate;
    }

    public void setClearDate(Date clearDate) {
        this.clearDate = clearDate;
    }

    public Date getCoreAcctTime() {
        return coreAcctTime;
    }

    public void setCoreAcctTime(Date coreAcctTime) {
        this.coreAcctTime = coreAcctTime;
    }

    public String getCoreAcctFlow() {
        return coreAcctFlow;
    }

    public void setCoreAcctFlow(String coreAcctFlow) {
        this.coreAcctFlow = coreAcctFlow == null ? null : coreAcctFlow.trim();
    }

    public String getParentAcctNo() {
        return parentAcctNo;
    }

    public void setParentAcctNo(String parentAcctNo) {
        this.parentAcctNo = parentAcctNo == null ? null : parentAcctNo.trim();
    }

    public String getMerchantAcctName() {
        return merchantAcctName;
    }

    public void setMerchantAcctName(String merchantAcctName) {
        this.merchantAcctName = merchantAcctName == null ? null : merchantAcctName.trim();
    }

    public String getEhpTpIdNo() {
        return ehpTpIdNo;
    }

    public void setEhpTpIdNo(String ehpTpIdNo) {
        this.ehpTpIdNo = ehpTpIdNo == null ? null : ehpTpIdNo.trim();
    }

    public String getBizCode() {
        return bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode == null ? null : bizCode.trim();
    }

    public String getTransCode() {
        return transCode;
    }

    public void setTransCode(String transCode) {
        this.transCode = transCode == null ? null : transCode.trim();
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode == null ? null : merchantCode.trim();
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }
}