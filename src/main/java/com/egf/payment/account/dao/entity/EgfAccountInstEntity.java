package com.egf.payment.account.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class EgfAccountInstEntity {
    private String instAccountNo;

    private String accountType;

    private String currency;

    private BigDecimal balance;

    private String enabledStatus;

    private String aliasName;

    private String accountTitle;

    private String balanceDirection;

    private BigDecimal systemAmount;

    private String transRule;

    private BigDecimal previousBalance;

    private String lastTransDate;

    private String instChannelApi;

    private Date createTime;

    private Date updateTime;

    public String getInstAccountNo() {
        return instAccountNo;
    }

    public void setInstAccountNo(String instAccountNo) {
        this.instAccountNo = instAccountNo == null ? null : instAccountNo.trim();
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getEnabledStatus() {
        return enabledStatus;
    }

    public void setEnabledStatus(String enabledStatus) {
        this.enabledStatus = enabledStatus == null ? null : enabledStatus.trim();
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName == null ? null : aliasName.trim();
    }

    public String getAccountTitle() {
        return accountTitle;
    }

    public void setAccountTitle(String accountTitle) {
        this.accountTitle = accountTitle == null ? null : accountTitle.trim();
    }

    public String getBalanceDirection() {
        return balanceDirection;
    }

    public void setBalanceDirection(String balanceDirection) {
        this.balanceDirection = balanceDirection == null ? null : balanceDirection.trim();
    }

    public BigDecimal getSystemAmount() {
        return systemAmount;
    }

    public void setSystemAmount(BigDecimal systemAmount) {
        this.systemAmount = systemAmount;
    }

    public String getTransRule() {
        return transRule;
    }

    public void setTransRule(String transRule) {
        this.transRule = transRule == null ? null : transRule.trim();
    }

    public BigDecimal getPreviousBalance() {
        return previousBalance;
    }

    public void setPreviousBalance(BigDecimal previousBalance) {
        this.previousBalance = previousBalance;
    }

    public String getLastTransDate() {
        return lastTransDate;
    }

    public void setLastTransDate(String lastTransDate) {
        this.lastTransDate = lastTransDate == null ? null : lastTransDate.trim();
    }

    public String getInstChannelApi() {
        return instChannelApi;
    }

    public void setInstChannelApi(String instChannelApi) {
        this.instChannelApi = instChannelApi == null ? null : instChannelApi.trim();
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