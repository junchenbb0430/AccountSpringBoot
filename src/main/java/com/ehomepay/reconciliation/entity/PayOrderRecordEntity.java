package com.ehomepay.reconciliation.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PayOrderRecordEntity {
    private Integer pkid;

    private String tpId;

    private String tpOrderNo;

    private String tradeType;

    private String tpTradeNo;

    private String originTradeNo;

    private String paymentSeq;

    private BigDecimal orderAmount;

    private BigDecimal sureAmount;

    private String orderTitle;

    private String productName;

    private String payType;

    private Date tradeTime;

    private BigDecimal lftFee;

    private BigDecimal merchantFee;

    private String merchantNo;

    private String merchantName;

    private String merchantAcc;

    private String paymentStatus;

    private String bankErrMsg;

    private String tpOrderNotice;

    private Date createTime;

    private Date updateTime;

    private String mark1;

    private String mark2;

    private Short tranStatus;

    private String splitNo;

    private String splitInfo;

    private Date validTime;

    private Short userId;

    private String settlementAccount;

    private String sysErrorCode;

    private String lftMchNo;

    private String lftMchEmail;

    private String settleNoticeUrl;

    private String settleNotifyStatus;

    private Date orderCretDatetime;

    private Date orderUpdtDatetime;

    private Date channelChangeDate;

    private Date lftChangeDate;

    private String productCode;

     

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

    public String getTpOrderNo() {
        return tpOrderNo;
    }

    public void setTpOrderNo(String tpOrderNo) {
        this.tpOrderNo = tpOrderNo == null ? null : tpOrderNo.trim();
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType == null ? null : tradeType.trim();
    }

    public String getTpTradeNo() {
        return tpTradeNo;
    }

    public void setTpTradeNo(String tpTradeNo) {
        this.tpTradeNo = tpTradeNo == null ? null : tpTradeNo.trim();
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

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public BigDecimal getSureAmount() {
        return sureAmount;
    }

    public void setSureAmount(BigDecimal sureAmount) {
        this.sureAmount = sureAmount;
    }

    public String getOrderTitle() {
        return orderTitle;
    }

    public void setOrderTitle(String orderTitle) {
        this.orderTitle = orderTitle == null ? null : orderTitle.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public BigDecimal getLftFee() {
        return lftFee;
    }

    public void setLftFee(BigDecimal lftFee) {
        this.lftFee = lftFee;
    }

    public BigDecimal getMerchantFee() {
        return merchantFee;
    }

    public void setMerchantFee(BigDecimal merchantFee) {
        this.merchantFee = merchantFee;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo == null ? null : merchantNo.trim();
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getMerchantAcc() {
        return merchantAcc;
    }

    public void setMerchantAcc(String merchantAcc) {
        this.merchantAcc = merchantAcc == null ? null : merchantAcc.trim();
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus == null ? null : paymentStatus.trim();
    }

    public String getBankErrMsg() {
        return bankErrMsg;
    }

    public void setBankErrMsg(String bankErrMsg) {
        this.bankErrMsg = bankErrMsg == null ? null : bankErrMsg.trim();
    }

    public String getTpOrderNotice() {
        return tpOrderNotice;
    }

    public void setTpOrderNotice(String tpOrderNotice) {
        this.tpOrderNotice = tpOrderNotice == null ? null : tpOrderNotice.trim();
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

    public Short getTranStatus() {
        return tranStatus;
    }

    public void setTranStatus(Short tranStatus) {
        this.tranStatus = tranStatus;
    }

    public String getSplitNo() {
        return splitNo;
    }

    public void setSplitNo(String splitNo) {
        this.splitNo = splitNo == null ? null : splitNo.trim();
    }

    public String getSplitInfo() {
        return splitInfo;
    }

    public void setSplitInfo(String splitInfo) {
        this.splitInfo = splitInfo == null ? null : splitInfo.trim();
    }

    public Date getValidTime() {
        return validTime;
    }

    public void setValidTime(Date validTime) {
        this.validTime = validTime;
    }

    public Short getUserId() {
        return userId;
    }

    public void setUserId(Short userId) {
        this.userId = userId;
    }

    public String getSettlementAccount() {
        return settlementAccount;
    }

    public void setSettlementAccount(String settlementAccount) {
        this.settlementAccount = settlementAccount == null ? null : settlementAccount.trim();
    }

    public String getSysErrorCode() {
        return sysErrorCode;
    }

    public void setSysErrorCode(String sysErrorCode) {
        this.sysErrorCode = sysErrorCode == null ? null : sysErrorCode.trim();
    }

    public String getLftMchNo() {
        return lftMchNo;
    }

    public void setLftMchNo(String lftMchNo) {
        this.lftMchNo = lftMchNo == null ? null : lftMchNo.trim();
    }

    public String getLftMchEmail() {
        return lftMchEmail;
    }

    public void setLftMchEmail(String lftMchEmail) {
        this.lftMchEmail = lftMchEmail == null ? null : lftMchEmail.trim();
    }

    public String getSettleNoticeUrl() {
        return settleNoticeUrl;
    }

    public void setSettleNoticeUrl(String settleNoticeUrl) {
        this.settleNoticeUrl = settleNoticeUrl == null ? null : settleNoticeUrl.trim();
    }

    public String getSettleNotifyStatus() {
        return settleNotifyStatus;
    }

    public void setSettleNotifyStatus(String settleNotifyStatus) {
        this.settleNotifyStatus = settleNotifyStatus == null ? null : settleNotifyStatus.trim();
    }

    public Date getOrderCretDatetime() {
        return orderCretDatetime;
    }

    public void setOrderCretDatetime(Date orderCretDatetime) {
        this.orderCretDatetime = orderCretDatetime;
    }

    public Date getOrderUpdtDatetime() {
        return orderUpdtDatetime;
    }

    public void setOrderUpdtDatetime(Date orderUpdtDatetime) {
        this.orderUpdtDatetime = orderUpdtDatetime;
    }

    public Date getChannelChangeDate() {
        return channelChangeDate;
    }

    public void setChannelChangeDate(Date channelChangeDate) {
        this.channelChangeDate = channelChangeDate;
    }

    public Date getLftChangeDate() {
        return lftChangeDate;
    }

    public void setLftChangeDate(Date lftChangeDate) {
        this.lftChangeDate = lftChangeDate;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }
}