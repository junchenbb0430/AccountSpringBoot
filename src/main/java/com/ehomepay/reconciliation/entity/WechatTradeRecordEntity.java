package com.ehomepay.reconciliation.entity;

import java.math.BigDecimal;
import java.util.Date;

public class WechatTradeRecordEntity {
    private Integer pkid;

    private String tpTradeNo;

    private Short orderRecordId;

    private String originTradeNo;

    private String paymentSeq;

    private BigDecimal sureAmount;

    private Date orderCreateTime;

    private String tradeType;

    private String bankCode;

    private String bankTradeTime;

    private String bankRespSeq;

    private String channelId;

    private String status;

    private String statusHis;

    private String bankRespMsg;

    private Object codeUrl;

    private String limitPay;

    private Object sceneInfo;

    private Date createTime;

    private Date updateTime;

    private String mark1;

    private String mark2;

    private String payType;

    private String scanPayType;

    private String openId;

    private String appId;

    private String wpData;

    private String wxSubmerid;

    private String wxChannelid;

    private String coreFlow;

    private String refundSettleFlag;

    private String productCode;

     

    public Integer getPkid() {
		return pkid;
	}

	public void setPkid(Integer pkid) {
		this.pkid = pkid;
	}

	public String getTpTradeNo() {
        return tpTradeNo;
    }

    public void setTpTradeNo(String tpTradeNo) {
        this.tpTradeNo = tpTradeNo == null ? null : tpTradeNo.trim();
    }

    public Short getOrderRecordId() {
        return orderRecordId;
    }

    public void setOrderRecordId(Short orderRecordId) {
        this.orderRecordId = orderRecordId;
    }

    public String getOriginTradeNo() {
        return originTradeNo;
    }

    public void setOriginTradeNo(String originTradeNo) {
        this.originTradeNo = originTradeNo == null ? null : originTradeNo.trim();
    }

    public String getPaymentSeq() {
        return paymentSeq;
    }

    public void setPaymentSeq(String paymentSeq) {
        this.paymentSeq = paymentSeq == null ? null : paymentSeq.trim();
    }

    public BigDecimal getSureAmount() {
        return sureAmount;
    }

    public void setSureAmount(BigDecimal sureAmount) {
        this.sureAmount = sureAmount;
    }

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType == null ? null : tradeType.trim();
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    public String getBankTradeTime() {
        return bankTradeTime;
    }

    public void setBankTradeTime(String bankTradeTime) {
        this.bankTradeTime = bankTradeTime == null ? null : bankTradeTime.trim();
    }

    public String getBankRespSeq() {
        return bankRespSeq;
    }

    public void setBankRespSeq(String bankRespSeq) {
        this.bankRespSeq = bankRespSeq == null ? null : bankRespSeq.trim();
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getStatusHis() {
        return statusHis;
    }

    public void setStatusHis(String statusHis) {
        this.statusHis = statusHis == null ? null : statusHis.trim();
    }

    public String getBankRespMsg() {
        return bankRespMsg;
    }

    public void setBankRespMsg(String bankRespMsg) {
        this.bankRespMsg = bankRespMsg == null ? null : bankRespMsg.trim();
    }

    public Object getCodeUrl() {
        return codeUrl;
    }

    public void setCodeUrl(Object codeUrl) {
        this.codeUrl = codeUrl;
    }

    public String getLimitPay() {
        return limitPay;
    }

    public void setLimitPay(String limitPay) {
        this.limitPay = limitPay == null ? null : limitPay.trim();
    }

    public Object getSceneInfo() {
        return sceneInfo;
    }

    public void setSceneInfo(Object sceneInfo) {
        this.sceneInfo = sceneInfo;
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

    public String getMark1() {
        return mark1;
    }

    public void setMark1(String mark1) {
        this.mark1 = mark1 == null ? null : mark1.trim();
    }

    public String getMark2() {
        return mark2;
    }

    public void setMark2(String mark2) {
        this.mark2 = mark2 == null ? null : mark2.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getScanPayType() {
        return scanPayType;
    }

    public void setScanPayType(String scanPayType) {
        this.scanPayType = scanPayType == null ? null : scanPayType.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getWpData() {
        return wpData;
    }

    public void setWpData(String wpData) {
        this.wpData = wpData == null ? null : wpData.trim();
    }

    public String getWxSubmerid() {
        return wxSubmerid;
    }

    public void setWxSubmerid(String wxSubmerid) {
        this.wxSubmerid = wxSubmerid == null ? null : wxSubmerid.trim();
    }

    public String getWxChannelid() {
        return wxChannelid;
    }

    public void setWxChannelid(String wxChannelid) {
        this.wxChannelid = wxChannelid == null ? null : wxChannelid.trim();
    }

    public String getCoreFlow() {
        return coreFlow;
    }

    public void setCoreFlow(String coreFlow) {
        this.coreFlow = coreFlow == null ? null : coreFlow.trim();
    }

    public String getRefundSettleFlag() {
        return refundSettleFlag;
    }

    public void setRefundSettleFlag(String refundSettleFlag) {
        this.refundSettleFlag = refundSettleFlag == null ? null : refundSettleFlag.trim();
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }
}