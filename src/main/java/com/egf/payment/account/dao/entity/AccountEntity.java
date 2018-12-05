package com.egf.payment.account.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class AccountEntity {
    private String accountNo;

    private String accountType;

    private BigDecimal balance;

    private BigDecimal freezeAmount;

    private String status;

    private String cardId;

    private String aliasName;

    private String accountTitle;

    private String accountDirection;

    private BigDecimal depositAmount;

    private BigDecimal systemAmount;

    private String freezeModel;

    private BigDecimal previousBalance;

    private Date createTime;

    private Date updateTime;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getFreezeAmount() {
        return freezeAmount;
    }

    public void setFreezeAmount(BigDecimal freezeAmount) {
        this.freezeAmount = freezeAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
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

    public String getAccountDirection() {
        return accountDirection;
    }

    public void setAccountDirection(String accountDirection) {
        this.accountDirection = accountDirection == null ? null : accountDirection.trim();
    }

    public BigDecimal getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(BigDecimal depositAmount) {
        this.depositAmount = depositAmount;
    }

    public BigDecimal getSystemAmount() {
        return systemAmount;
    }

    public void setSystemAmount(BigDecimal systemAmount) {
        this.systemAmount = systemAmount;
    }

    public String getFreezeModel() {
        return freezeModel;
    }

    public void setFreezeModel(String freezeModel) {
        this.freezeModel = freezeModel == null ? null : freezeModel.trim();
    }

    public BigDecimal getPreviousBalance() {
        return previousBalance;
    }

    public void setPreviousBalance(BigDecimal previousBalance) {
        this.previousBalance = previousBalance;
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