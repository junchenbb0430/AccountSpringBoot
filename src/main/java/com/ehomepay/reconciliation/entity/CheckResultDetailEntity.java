package com.ehomepay.reconciliation.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CheckResultDetailEntity {
    private Short pkid;

    private String spbillBatchId;

    private Date spbillTime;

    private Date transTime;

    private String checkResult;

    private String bankSeq;

    private BigDecimal transAmount;

    private String channelId;

    private String transType;

    private String bizType;

    private String transStatus;

    private String transCty;

    private String oppositeBank;

    private String oppositeCardNo;

    private String oppositeName;

    private String cardType;

    private BigDecimal feeAmount;

    private String customerName;

    private Date liftTransStartTime;

    private Date liftTransSucTime;

    private String coreFlow;

    private String failureReason;

    private String accountType;

    private String accountNo;

    private String matchId;

    private String dealPkid;

    private String remark;

    private Date createTime;

    private Date updateTime;

    private String operateTeller;

    private String operateName;

    private String errorFlag;

    private String channelBankName;

    private String channelCardNo;

    private String respbillMsg;

    private String spbillResultType;

    private Date spbillClearTime;

    private String errorType;

    private String orderNo;

    private Date clearDate;

    private String posMerchantCode;

    private String transBankSeq;

    private String paymentSeq;

    public Short getPkid() {
        return pkid;
    }

    public void setPkid(Short pkid) {
        this.pkid = pkid;
    }

    public String getSpbillBatchId() {
        return spbillBatchId;
    }

    public void setSpbillBatchId(String spbillBatchId) {
        this.spbillBatchId = spbillBatchId == null ? null : spbillBatchId.trim();
    }

    public Date getSpbillTime() {
        return spbillTime;
    }

    public void setSpbillTime(Date spbillTime) {
        this.spbillTime = spbillTime;
    }

    public Date getTransTime() {
        return transTime;
    }

    public void setTransTime(Date transTime) {
        this.transTime = transTime;
    }

    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult == null ? null : checkResult.trim();
    }

    public String getBankSeq() {
        return bankSeq;
    }

    public void setBankSeq(String bankSeq) {
        this.bankSeq = bankSeq == null ? null : bankSeq.trim();
    }

    public BigDecimal getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(BigDecimal transAmount) {
        this.transAmount = transAmount;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType == null ? null : transType.trim();
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType == null ? null : bizType.trim();
    }

    public String getTransStatus() {
        return transStatus;
    }

    public void setTransStatus(String transStatus) {
        this.transStatus = transStatus == null ? null : transStatus.trim();
    }

    public String getTransCty() {
        return transCty;
    }

    public void setTransCty(String transCty) {
        this.transCty = transCty == null ? null : transCty.trim();
    }

    public String getOppositeBank() {
        return oppositeBank;
    }

    public void setOppositeBank(String oppositeBank) {
        this.oppositeBank = oppositeBank == null ? null : oppositeBank.trim();
    }

    public String getOppositeCardNo() {
        return oppositeCardNo;
    }

    public void setOppositeCardNo(String oppositeCardNo) {
        this.oppositeCardNo = oppositeCardNo == null ? null : oppositeCardNo.trim();
    }

    public String getOppositeName() {
        return oppositeName;
    }

    public void setOppositeName(String oppositeName) {
        this.oppositeName = oppositeName == null ? null : oppositeName.trim();
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public Date getLiftTransStartTime() {
        return liftTransStartTime;
    }

    public void setLiftTransStartTime(Date liftTransStartTime) {
        this.liftTransStartTime = liftTransStartTime;
    }

    public Date getLiftTransSucTime() {
        return liftTransSucTime;
    }

    public void setLiftTransSucTime(Date liftTransSucTime) {
        this.liftTransSucTime = liftTransSucTime;
    }

    public String getCoreFlow() {
        return coreFlow;
    }

    public void setCoreFlow(String coreFlow) {
        this.coreFlow = coreFlow == null ? null : coreFlow.trim();
    }

    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason == null ? null : failureReason.trim();
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId == null ? null : matchId.trim();
    }

    public String getDealPkid() {
        return dealPkid;
    }

    public void setDealPkid(String dealPkid) {
        this.dealPkid = dealPkid == null ? null : dealPkid.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public String getOperateTeller() {
        return operateTeller;
    }

    public void setOperateTeller(String operateTeller) {
        this.operateTeller = operateTeller == null ? null : operateTeller.trim();
    }

    public String getOperateName() {
        return operateName;
    }

    public void setOperateName(String operateName) {
        this.operateName = operateName == null ? null : operateName.trim();
    }

    public String getErrorFlag() {
        return errorFlag;
    }

    public void setErrorFlag(String errorFlag) {
        this.errorFlag = errorFlag == null ? null : errorFlag.trim();
    }

    public String getChannelBankName() {
        return channelBankName;
    }

    public void setChannelBankName(String channelBankName) {
        this.channelBankName = channelBankName == null ? null : channelBankName.trim();
    }

    public String getChannelCardNo() {
        return channelCardNo;
    }

    public void setChannelCardNo(String channelCardNo) {
        this.channelCardNo = channelCardNo == null ? null : channelCardNo.trim();
    }

    public String getRespbillMsg() {
        return respbillMsg;
    }

    public void setRespbillMsg(String respbillMsg) {
        this.respbillMsg = respbillMsg == null ? null : respbillMsg.trim();
    }

    public String getSpbillResultType() {
        return spbillResultType;
    }

    public void setSpbillResultType(String spbillResultType) {
        this.spbillResultType = spbillResultType == null ? null : spbillResultType.trim();
    }

    public Date getSpbillClearTime() {
        return spbillClearTime;
    }

    public void setSpbillClearTime(Date spbillClearTime) {
        this.spbillClearTime = spbillClearTime;
    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType == null ? null : errorType.trim();
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

    public String getPosMerchantCode() {
        return posMerchantCode;
    }

    public void setPosMerchantCode(String posMerchantCode) {
        this.posMerchantCode = posMerchantCode == null ? null : posMerchantCode.trim();
    }

    public String getTransBankSeq() {
        return transBankSeq;
    }

    public void setTransBankSeq(String transBankSeq) {
        this.transBankSeq = transBankSeq == null ? null : transBankSeq.trim();
    }

    public String getPaymentSeq() {
        return paymentSeq;
    }

    public void setPaymentSeq(String paymentSeq) {
        this.paymentSeq = paymentSeq == null ? null : paymentSeq.trim();
    }
}