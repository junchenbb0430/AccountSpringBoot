package com.egf.payment.account.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class EgfAccountInstLogEntity {
    private String instAccountLogId;

    private String instAccountNo;

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

    private String instChannelApi;

    private String bankName;

    private String payBankName;

    private String bankId;

    private String payBankId;

    private String outOrderNo;

    private String actionType;

    private String beyondOrderNo;

    private Date createTime;

    public String getInstAccountLogId() {
        return instAccountLogId;
    }

    public void setInstAccountLogId(String instAccountLogId) {
        this.instAccountLogId = instAccountLogId == null ? null : instAccountLogId.trim();
    }

    public String getInstAccountNo() {
        return instAccountNo;
    }

    public void setInstAccountNo(String instAccountNo) {
        this.instAccountNo = instAccountNo == null ? null : instAccountNo.trim();
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

    public String getInstChannelApi() {
        return instChannelApi;
    }

    public void setInstChannelApi(String instChannelApi) {
        this.instChannelApi = instChannelApi == null ? null : instChannelApi.trim();
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

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType == null ? null : actionType.trim();
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
}