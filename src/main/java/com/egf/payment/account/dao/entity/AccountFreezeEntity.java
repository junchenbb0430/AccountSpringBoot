package com.egf.payment.account.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class AccountFreezeEntity {
    private String freezeId;

    private String accountNo;

    private String freezeType;

    private BigDecimal freezeAmount;

    private BigDecimal systemAmount;

    private Date createTime;

    private Date updateTime;

    public String getFreezeId() {
        return freezeId;
    }

    public void setFreezeId(String freezeId) {
        this.freezeId = freezeId == null ? null : freezeId.trim();
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    public String getFreezeType() {
        return freezeType;
    }

    public void setFreezeType(String freezeType) {
        this.freezeType = freezeType == null ? null : freezeType.trim();
    }

    public BigDecimal getFreezeAmount() {
        return freezeAmount;
    }

    public void setFreezeAmount(BigDecimal freezeAmount) {
        this.freezeAmount = freezeAmount;
    }

    public BigDecimal getSystemAmount() {
        return systemAmount;
    }

    public void setSystemAmount(BigDecimal systemAmount) {
        this.systemAmount = systemAmount;
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