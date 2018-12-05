package com.egf.payment.account.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class AccountFreezeLogEntity {
    private String freezeIdLog;

    private String accountNo;

    private String outOrderNo;

    private String transType;

    private BigDecimal amount;

    private String freezeType;

    private BigDecimal totalFreezeAmount;

    private BigDecimal typeFreezeAmount;

    private String freezeMemo;

    private String beyondOrderNo;

    private Date transTime;

    private Date createTime;

    private Date updateTime;

    public String getFreezeIdLog() {
        return freezeIdLog;
    }

    public void setFreezeIdLog(String freezeIdLog) {
        this.freezeIdLog = freezeIdLog == null ? null : freezeIdLog.trim();
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo == null ? null : outOrderNo.trim();
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType == null ? null : transType.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getFreezeType() {
        return freezeType;
    }

    public void setFreezeType(String freezeType) {
        this.freezeType = freezeType == null ? null : freezeType.trim();
    }

    public BigDecimal getTotalFreezeAmount() {
        return totalFreezeAmount;
    }

    public void setTotalFreezeAmount(BigDecimal totalFreezeAmount) {
        this.totalFreezeAmount = totalFreezeAmount;
    }

    public BigDecimal getTypeFreezeAmount() {
        return typeFreezeAmount;
    }

    public void setTypeFreezeAmount(BigDecimal typeFreezeAmount) {
        this.typeFreezeAmount = typeFreezeAmount;
    }

    public String getFreezeMemo() {
        return freezeMemo;
    }

    public void setFreezeMemo(String freezeMemo) {
        this.freezeMemo = freezeMemo == null ? null : freezeMemo.trim();
    }

    public String getBeyondOrderNo() {
        return beyondOrderNo;
    }

    public void setBeyondOrderNo(String beyondOrderNo) {
        this.beyondOrderNo = beyondOrderNo == null ? null : beyondOrderNo.trim();
    }

    public Date getTransTime() {
        return transTime;
    }

    public void setTransTime(Date transTime) {
        this.transTime = transTime;
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
}