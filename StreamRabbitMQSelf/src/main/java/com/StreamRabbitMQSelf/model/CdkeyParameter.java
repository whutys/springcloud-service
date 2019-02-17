package com.StreamRabbitMQSelf.model;

import java.util.Date;

public class CdkeyParameter {
    private Long id;

    private String telephone;

    private String cdkey;

    private Short messageStatus;

    private Short billStatus;

    private Date timeStamp;

    private String encode;

    private String version;

    private Short channel;

    private Short flowType;

    private Short flowSize;

    private Date rechargeTime;

    private String memberType;

    private String method;

    private String serialNumber;

    private String orderCodeWo;

    private String orderCode;

    private Short rechargeState;

    private Date createTime;

    private Date updateTime;

    private String flag1;

    private String flag2;

    private Integer flag3;

    private Integer flag4;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getCdkey() {
        return cdkey;
    }

    public void setCdkey(String cdkey) {
        this.cdkey = cdkey == null ? null : cdkey.trim();
    }

    public Short getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(Short messageStatus) {
        this.messageStatus = messageStatus;
    }

    public Short getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(Short billStatus) {
        this.billStatus = billStatus;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getEncode() {
        return encode;
    }

    public void setEncode(String encode) {
        this.encode = encode == null ? null : encode.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public Short getChannel() {
        return channel;
    }

    public void setChannel(Short channel) {
        this.channel = channel;
    }

    public Short getFlowType() {
        return flowType;
    }

    public void setFlowType(Short flowType) {
        this.flowType = flowType;
    }

    public Short getFlowSize() {
        return flowSize;
    }

    public void setFlowSize(Short flowSize) {
        this.flowSize = flowSize;
    }

    public Date getRechargeTime() {
        return rechargeTime;
    }

    public void setRechargeTime(Date rechargeTime) {
        this.rechargeTime = rechargeTime;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType == null ? null : memberType.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    public String getOrderCodeWo() {
        return orderCodeWo;
    }

    public void setOrderCodeWo(String orderCodeWo) {
        this.orderCodeWo = orderCodeWo == null ? null : orderCodeWo.trim();
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public Short getRechargeState() {
        return rechargeState;
    }

    public void setRechargeState(Short rechargeState) {
        this.rechargeState = rechargeState;
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

    public String getFlag1() {
        return flag1;
    }

    public void setFlag1(String flag1) {
        this.flag1 = flag1 == null ? null : flag1.trim();
    }

    public String getFlag2() {
        return flag2;
    }

    public void setFlag2(String flag2) {
        this.flag2 = flag2 == null ? null : flag2.trim();
    }

    public Integer getFlag3() {
        return flag3;
    }

    public void setFlag3(Integer flag3) {
        this.flag3 = flag3;
    }

    public Integer getFlag4() {
        return flag4;
    }

    public void setFlag4(Integer flag4) {
        this.flag4 = flag4;
    }
}
