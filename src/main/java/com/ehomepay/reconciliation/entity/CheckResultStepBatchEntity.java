package com.ehomepay.reconciliation.entity;

import java.util.Date;

public class CheckResultStepBatchEntity {
    private Short pkid;

    private Date transDate;

    private String channelId;

    private String batchNo;

    private String stepStatus;

    private String checkType;

    private Short manualCount;

    private Short autoCount;

    private Date createTime;

    private Date updateTime;

    public Short getPkid() {
        return pkid;
    }

    public void setPkid(Short pkid) {
        this.pkid = pkid;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
    }

    public String getStepStatus() {
        return stepStatus;
    }

    public void setStepStatus(String stepStatus) {
        this.stepStatus = stepStatus == null ? null : stepStatus.trim();
    }

    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType == null ? null : checkType.trim();
    }

    public Short getManualCount() {
        return manualCount;
    }

    public void setManualCount(Short manualCount) {
        this.manualCount = manualCount;
    }

    public Short getAutoCount() {
        return autoCount;
    }

    public void setAutoCount(Short autoCount) {
        this.autoCount = autoCount;
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