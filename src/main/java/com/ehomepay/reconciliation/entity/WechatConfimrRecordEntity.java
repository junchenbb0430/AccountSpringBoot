package com.ehomepay.reconciliation.entity;

import java.math.BigDecimal;
import java.util.Date;

public class WechatConfimrRecordEntity {
    private Integer pkid;

    private String tpId;

    private String merchantNo;

    private String tpOrderNo;

    private String tpTradeNo;

    private Short payOrderId;

    private String originTradeNo;

    private String paymentSeq;

    private BigDecimal sureAmount;

    private Date orderCreateTime;

    private String tradeType;

    private String bizType;

    private String bankRespSeq;

    private String channelId;

    private Date createTime;

    private Date updateTime;

    private String splitNo;

    private Date finishTime;

    private String remark;

    

    public Integer getPkid() {
		return pkid;
	}

	public void setPkid(Integer pkid) {
		this.pkid = pkid;
	}

	public String getTpId() {
        return tpId;
    }

    public void setTpId(String tpId) {
        this.tpId = tpId == null ? null : tpId.trim();
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo == null ? null : merchantNo.trim();
    }

    public String getTpOrderNo() {
        return tpOrderNo;
    }

    public void setTpOrderNo(String tpOrderNo) {
        this.tpOrderNo = tpOrderNo == null ? null : tpOrderNo.trim();
    }

    public String getTpTradeNo() {
        return tpTradeNo;
    }

    public void setTpTradeNo(String tpTradeNo) {
        this.tpTradeNo = tpTradeNo == null ? null : tpTradeNo.trim();
    }

    public Short getPayOrderId() {
        return payOrderId;
    }

    public void setPayOrderId(Short payOrderId) {
        this.payOrderId = payOrderId;
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

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType == null ? null : bizType.trim();
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

    public String getSplitNo() {
        return splitNo;
    }

    public void setSplitNo(String splitNo) {
        this.splitNo = splitNo == null ? null : splitNo.trim();
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}