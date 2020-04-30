package com.ehomepay.reconciliation.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CheckUnifiedOrderEntity {
    private Integer pkid;

    private String systemType;

    private String channelId;

    private String channelFlow;

    private String paymentSeq;

    private BigDecimal transAmount;

    private Date transDate;

    private Date transBeginTime;

    private Date transFinishTime;

    private String bizType;

    private String transType;

    private String trxId;

    private String transStatus;

    private String depositDirection;

    private String acctName;

    private String acctNo;

    private String acctType;

    private String requestTrxId;

    private String transFlowType;

    private Date createTime;

    private Date updateTime;

    private String tpid;

    private String bankCode;

    private String bankName;

    private String bizCode;

    private String transCode;

    private String merchantId;
 

    public Integer getPkid() {
		return pkid;
	}

	public void setPkid(Integer pkid) {
		this.pkid = pkid;
	}

	public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType == null ? null : systemType.trim();
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public String getChannelFlow() {
        return channelFlow;
    }

    public void setChannelFlow(String channelFlow) {
        this.channelFlow = channelFlow == null ? null : channelFlow.trim();
    }

    public String getPaymentSeq() {
        return paymentSeq;
    }

    public void setPaymentSeq(String paymentSeq) {
        this.paymentSeq = paymentSeq == null ? null : paymentSeq.trim();
    }

    public BigDecimal getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(BigDecimal transAmount) {
        this.transAmount = transAmount;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public Date getTransBeginTime() {
        return transBeginTime;
    }

    public void setTransBeginTime(Date transBeginTime) {
        this.transBeginTime = transBeginTime;
    }

    public Date getTransFinishTime() {
        return transFinishTime;
    }

    public void setTransFinishTime(Date transFinishTime) {
        this.transFinishTime = transFinishTime;
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType == null ? null : bizType.trim();
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType == null ? null : transType.trim();
    }

    public String getTrxId() {
        return trxId;
    }

    public void setTrxId(String trxId) {
        this.trxId = trxId == null ? null : trxId.trim();
    }

    public String getTransStatus() {
        return transStatus;
    }

    public void setTransStatus(String transStatus) {
        this.transStatus = transStatus == null ? null : transStatus.trim();
    }

    public String getDepositDirection() {
        return depositDirection;
    }

    public void setDepositDirection(String depositDirection) {
        this.depositDirection = depositDirection == null ? null : depositDirection.trim();
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName == null ? null : acctName.trim();
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo == null ? null : acctNo.trim();
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType == null ? null : acctType.trim();
    }

    public String getRequestTrxId() {
        return requestTrxId;
    }

    public void setRequestTrxId(String requestTrxId) {
        this.requestTrxId = requestTrxId == null ? null : requestTrxId.trim();
    }

    public String getTransFlowType() {
        return transFlowType;
    }

    public void setTransFlowType(String transFlowType) {
        this.transFlowType = transFlowType == null ? null : transFlowType.trim();
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

    public String getTpid() {
        return tpid;
    }

    public void setTpid(String tpid) {
        this.tpid = tpid == null ? null : tpid.trim();
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
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

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }
}