package com.ehomepay.reconciliation.entity;

import java.util.Date;

public class CashPosMerchantEntity {
    private Short pkid;

    private String merchantnum;

    private String postfix;

    private String groupid;

    private String status;

    private String settlebank;

    private String settlebankacc;

    private String payconfirmnum;

    private String remark;

    private Date createtime;

    private String channel;

    public Short getPkid() {
        return pkid;
    }

    public void setPkid(Short pkid) {
        this.pkid = pkid;
    }

    public String getMerchantnum() {
        return merchantnum;
    }

    public void setMerchantnum(String merchantnum) {
        this.merchantnum = merchantnum == null ? null : merchantnum.trim();
    }

    public String getPostfix() {
        return postfix;
    }

    public void setPostfix(String postfix) {
        this.postfix = postfix == null ? null : postfix.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getSettlebank() {
        return settlebank;
    }

    public void setSettlebank(String settlebank) {
        this.settlebank = settlebank == null ? null : settlebank.trim();
    }

    public String getSettlebankacc() {
        return settlebankacc;
    }

    public void setSettlebankacc(String settlebankacc) {
        this.settlebankacc = settlebankacc == null ? null : settlebankacc.trim();
    }

    public String getPayconfirmnum() {
        return payconfirmnum;
    }

    public void setPayconfirmnum(String payconfirmnum) {
        this.payconfirmnum = payconfirmnum == null ? null : payconfirmnum.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }
}