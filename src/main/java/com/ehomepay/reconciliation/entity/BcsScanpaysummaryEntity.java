package com.ehomepay.reconciliation.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BcsScanpaysummaryEntity {
    private BigDecimal pkid;

    private String merchid;

    private String filename;

    private String transdate;

    private String filesource;

    private String stpTimestamp;

    private String filesavepath;

    private Long recordnum;

    private BigDecimal sumamount;

    private BigDecimal refundamount;

    private BigDecimal feeamount;

    private BigDecimal couponamount;

    private BigDecimal clearamount;

    private Date createdatetime;

    private Date updatetime;

    private String sumline;

    private String status;

    public BigDecimal getPkid() {
        return pkid;
    }

    public void setPkid(BigDecimal pkid) {
        this.pkid = pkid;
    }

    public String getMerchid() {
        return merchid;
    }

    public void setMerchid(String merchid) {
        this.merchid = merchid == null ? null : merchid.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getTransdate() {
        return transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate == null ? null : transdate.trim();
    }

    public String getFilesource() {
        return filesource;
    }

    public void setFilesource(String filesource) {
        this.filesource = filesource == null ? null : filesource.trim();
    }

    public String getStpTimestamp() {
        return stpTimestamp;
    }

    public void setStpTimestamp(String stpTimestamp) {
        this.stpTimestamp = stpTimestamp == null ? null : stpTimestamp.trim();
    }

    public String getFilesavepath() {
        return filesavepath;
    }

    public void setFilesavepath(String filesavepath) {
        this.filesavepath = filesavepath == null ? null : filesavepath.trim();
    }

    public Long getRecordnum() {
        return recordnum;
    }

    public void setRecordnum(Long recordnum) {
        this.recordnum = recordnum;
    }

    public BigDecimal getSumamount() {
        return sumamount;
    }

    public void setSumamount(BigDecimal sumamount) {
        this.sumamount = sumamount;
    }

    public BigDecimal getRefundamount() {
        return refundamount;
    }

    public void setRefundamount(BigDecimal refundamount) {
        this.refundamount = refundamount;
    }

    public BigDecimal getFeeamount() {
        return feeamount;
    }

    public void setFeeamount(BigDecimal feeamount) {
        this.feeamount = feeamount;
    }

    public BigDecimal getCouponamount() {
        return couponamount;
    }

    public void setCouponamount(BigDecimal couponamount) {
        this.couponamount = couponamount;
    }

    public BigDecimal getClearamount() {
        return clearamount;
    }

    public void setClearamount(BigDecimal clearamount) {
        this.clearamount = clearamount;
    }

    public Date getCreatedatetime() {
        return createdatetime;
    }

    public void setCreatedatetime(Date createdatetime) {
        this.createdatetime = createdatetime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getSumline() {
        return sumline;
    }

    public void setSumline(String sumline) {
        this.sumline = sumline == null ? null : sumline.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}