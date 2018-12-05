package com.egf.payment.account.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class AccountLogEntity {
    private String accountLogId;

    private String accountNo;

    private String transDate;

    private String transCode;

    private String subTransCode;

    private BigDecimal transBalance;

    private BigDecimal transAmount;

    private BigDecimal balance;

    private String transCurrency;

    private String transAccount;

    private String otherAccount;

    private String transMemo;

    private String otherAccountLog;

    private String accountType;

    private String otherAccountType;

    private String instChannel;

    private String bankName;

    private String payBankName;

    private String bankId;

    private String payBankId;

    private String outOrderNo;

    private String transType;

    private String beyondOrderNo;

    private Date createTime;

    private Date updateTime;

    public String getAccountLogId() {
        return accountLogId;
    }

    public void setAccountLogId(String accountLogId) {
        this.accountLogId = accountLogId == null ? null : accountLogId.trim();
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate == null ? null : transDate.trim();
    }

    public String getTransCode() {
        return transCode;
    }

    public void setTransCode(String transCode) {
        this.transCode = transCode == null ? null : transCode.trim();
    }

    public String getSubTransCode() {
        return subTransCode;
    }

    public void setSubTransCode(String subTransCode) {
        this.subTransCode = subTransCode == null ? null : subTransCode.trim();
    }

    public BigDecimal getTransBalance() {
        return transBalance;
    }

    public void setTransBalance(BigDecimal transBalance) {
        this.transBalance = transBalance;
    }

    public BigDecimal getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(BigDecimal transAmount) {
        this.transAmount = transAmount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getTransCurrency() {
        return transCurrency;
    }

    public void setTransCurrency(String transCurrency) {
        this.transCurrency = transCurrency == null ? null : transCurrency.trim();
    }

    public String getTransAccount() {
        return transAccount;
    }

    public void setTransAccount(String transAccount) {
        this.transAccount = transAccount == null ? null : transAccount.trim();
    }

    public String getOtherAccount() {
        return otherAccount;
    }

    public void setOtherAccount(String otherAccount) {
        this.otherAccount = otherAccount == null ? null : otherAccount.trim();
    }

    public String getTransMemo() {
        return transMemo;
    }

    public void setTransMemo(String transMemo) {
        this.transMemo = transMemo == null ? null : transMemo.trim();
    }

    public String getOtherAccountLog() {
        return otherAccountLog;
    }

    public void setOtherAccountLog(String otherAccountLog) {
        this.otherAccountLog = otherAccountLog == null ? null : otherAccountLog.trim();
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    public String getOtherAccountType() {
        return otherAccountType;
    }

    public void setOtherAccountType(String otherAccountType) {
        this.otherAccountType = otherAccountType == null ? null : otherAccountType.trim();
    }

    public String getInstChannel() {
        return instChannel;
    }

    public void setInstChannel(String instChannel) {
        this.instChannel = instChannel == null ? null : instChannel.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getPayBankName() {
        return payBankName;
    }

    public void setPayBankName(String payBankName) {
        this.payBankName = payBankName == null ? null : payBankName.trim();
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId == null ? null : bankId.trim();
    }

    public String getPayBankId() {
        return payBankId;
    }

    public void setPayBankId(String payBankId) {
        this.payBankId = payBankId == null ? null : payBankId.trim();
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

    public String getBeyondOrderNo() {
        return beyondOrderNo;
    }

    public void setBeyondOrderNo(String beyondOrderNo) {
        this.beyondOrderNo = beyondOrderNo == null ? null : beyondOrderNo.trim();
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