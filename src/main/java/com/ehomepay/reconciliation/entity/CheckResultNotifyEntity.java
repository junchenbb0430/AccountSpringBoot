package com.ehomepay.reconciliation.entity;

import java.util.Date;

public class CheckResultNotifyEntity {
    private Short pkid;

    private String channelId;

    private String channelFlow;

    private String paymentSeq;

    private String cardType;

    private String isInlandCard;

    private String clearMode;

    private Date clearDate;

    private String msgKey;

    private String msgId;

    private Long queueId;

    private String sendStatus;

    private Date createTime;

    private Date updateTime;

    private String cardNo;

    private String trxId;

    private String successFlag;

    private String lftChannelFlow;

    public Short getPkid() {
        return pkid;
    }

    public void setPkid(Short pkid) {
        this.pkid = pkid;
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

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    public String getIsInlandCard() {
        return isInlandCard;
    }

    public void setIsInlandCard(String isInlandCard) {
        this.isInlandCard = isInlandCard == null ? null : isInlandCard.trim();
    }

    public String getClearMode() {
        return clearMode;
    }

    public void setClearMode(String clearMode) {
        this.clearMode = clearMode == null ? null : clearMode.trim();
    }

    public Date getClearDate() {
        return clearDate;
    }

    public void setClearDate(Date clearDate) {
        this.clearDate = clearDate;
    }

    public String getMsgKey() {
        return msgKey;
    }

    public void setMsgKey(String msgKey) {
        this.msgKey = msgKey == null ? null : msgKey.trim();
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId == null ? null : msgId.trim();
    }

    public Long getQueueId() {
        return queueId;
    }

    public void setQueueId(Long queueId) {
        this.queueId = queueId;
    }

    public String getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus == null ? null : sendStatus.trim();
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

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public String getTrxId() {
        return trxId;
    }

    public void setTrxId(String trxId) {
        this.trxId = trxId == null ? null : trxId.trim();
    }

    public String getSuccessFlag() {
        return successFlag;
    }

    public void setSuccessFlag(String successFlag) {
        this.successFlag = successFlag == null ? null : successFlag.trim();
    }

    public String getLftChannelFlow() {
        return lftChannelFlow;
    }

    public void setLftChannelFlow(String lftChannelFlow) {
        this.lftChannelFlow = lftChannelFlow == null ? null : lftChannelFlow.trim();
    }
}