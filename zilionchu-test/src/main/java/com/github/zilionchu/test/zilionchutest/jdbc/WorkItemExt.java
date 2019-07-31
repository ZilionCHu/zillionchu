package com.github.zilionchu.test.zilionchutest.jdbc;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Date;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-07-10 16:52
 * @Description:
 */
public class WorkItemExt extends WFWorkItem{


    /**
     *
     */
    private static final long serialVersionUID = -6482768460216741284L;
    private String createStartTime;//创建时间
    private String createEndTime;//结束时间
    private SysUser sysUser;
    private String projectName;//项目名称
    private Long projectId;//项目ID
    private String userName;//提交人
    private Long userId;//提交人ID
    private String businessName;//业务名称
    private Long businessId;//业务ID
    private String summary;//摘要
    private Double amount;//金额
    private Long mandator;//委托人
    private String remark;
    //状态说明-审批中，审批通过，审批拒绝
    private String statusName;
    //日期查询区间-1代表全部，3：近三个月，6：近半年，12：近一年。依次类推
    private Integer interval;
    private Date bizDate;//业务日期(用于补录)
    private String isPass;//ispass定义的是0是通过,-1是拒绝

    private String transDate;//查询使用业务日期

    private String viewurl;//查看链接
    private String submiturl;//补录链接
    private String approveclass;//补录完成调用类
    private String approvemethod;//补录完成调用方法
    private String methodparam;//调用方法参数类型
    private String businesstype;//业务类型
    private String peerUserName;//对方银行户名

    public String getPeerUserName() {
        return peerUserName;
    }

    public void setPeerUserName(String peerUserName) {
        this.peerUserName = peerUserName;
    }

    public String getPeerBankName() {
        return peerBankName;
    }

    public void setPeerBankName(String peerBankName) {
        this.peerBankName = peerBankName;
    }

    public String getPeerAcctonNo() {
        return peerAcctonNo;
    }

    public void setPeerAcctonNo(String peerAcctonNo) {
        this.peerAcctonNo = peerAcctonNo;
    }

    private String peerBankName;//对方银行名称
    private String peerAcctonNo;//对方银行账号

    public String getViewurl() {
        return viewurl;
    }

    public void setViewurl(String viewurl) {
        this.viewurl = viewurl;
    }

    public String getSubmiturl() {
        return submiturl;
    }

    public void setSubmiturl(String submiturl) {
        this.submiturl = submiturl;
    }

    public String getApproveclass() {
        return approveclass;
    }

    public void setApproveclass(String approveclass) {
        this.approveclass = approveclass;
    }

    public String getApprovemethod() {
        return approvemethod;
    }

    public void setApprovemethod(String approvemethod) {
        this.approvemethod = approvemethod;
    }

    public String getMethodparam() {
        return methodparam;
    }

    public void setMethodparam(String methodparam) {
        this.methodparam = methodparam;
    }

    public String getBusinesstype() {
        return businesstype;
    }

    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype;
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    /**
     * @return the isPass
     */
    public String getIsPass() {
        return isPass;
    }

    /**
     * @param isPass the isPass to set
     */
    public void setIsPass(String isPass) {
        this.isPass = isPass;
    }

    /**
     * @return the bizDate
     */
    public Date getBizDate() {
        return bizDate;
    }

    /**
     * @param bizDate the bizDate to set
     */
    public void setBizDate(Date bizDate) {
        this.bizDate = bizDate;
    }

    /**
     * 当前审批人ID
     */
    private Long participantID;
    /**
     * 委托人、待办授权人
     */
    private Long wtr;
    /**
     * 待办类型：1-BPS；2-软通
     */
    private String DBLX;
    /**
     * 是否最后节点
     */
    private String lastStep;
    /**
     * 节点名称
     */
    private String stepName;
    /**
     * 默认节点名称-为批量拨款补录功能使用。
     */
    private String defaultStepName;

    /**
     * 业务名称
     */
    private String bizName;
    /**
     *默认业务名称
     */
    private String defaultbizName;
    /**
     * 排序列名
     */
    private String sortColumn;
    /**
     * 排序方式
     */
    private String sort;
    /**
     * 操作记录ID
     */
    private Long[] recordID;

    /**
     * @return the recordID
     */
    public Long[] getRecordID() {
        return recordID;
    }

    /**
     * @param recordID the recordID to set
     */
    public void setRecordID(Long[] recordID) {
        this.recordID = recordID;
    }

    public String getCreateStartTime() {
        return createStartTime;
    }

    public void setCreateStartTime(String createStartTime) {
        this.createStartTime = createStartTime;
    }

    public String getCreateEndTime() {
        return createEndTime;
    }

    public void setCreateEndTime(String createEndTime) {
        this.createEndTime = createEndTime;
    }

    public String getStepName() {
        return stepName;
    }

    public String getBizName() {
        return bizName;
    }

    public void setBizName(String bizName) {
        try {
            bizName = URLDecoder.decode(URLDecoder.decode(bizName, "UTF-8"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.bizName = bizName;
    }

    public void setStepName(String stepName) {
        try {
            stepName = URLDecoder.decode(URLDecoder.decode(stepName, "UTF-8"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.stepName = stepName;
    }

    public SysUser getSysUser() {
        return sysUser;
    }

    public void setSysUser(SysUser sysUser) {
        if (sysUser != null && sysUser.getUserName() != null) {
            String userName = sysUser.getUserName();
            try {
                userName = URLDecoder.decode(URLDecoder.decode(userName, "UTF-8"), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            sysUser.setUserName(userName);
        }
        this.sysUser = sysUser;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        try {
            projectName = URLDecoder.decode(URLDecoder.decode(projectName, "UTF-8"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.projectName = projectName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        try {
            userName = URLDecoder.decode(URLDecoder.decode(userName, "UTF-8"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.userName = userName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        try {
            summary = URLDecoder.decode(URLDecoder.decode(summary, "UTF-8"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.summary = summary;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getMandator() {
        return mandator;
    }

    public void setMandator(Long mandator) {
        this.mandator = mandator;
    }

    public Long getParticipantID() {
        return participantID;
    }

    public void setParticipantID(Long participantID) {
        this.participantID = participantID;
    }

    public Long getWtr() {
        return wtr;
    }

    public void setWtr(Long wtr) {
        this.wtr = wtr;
    }

    public String getDBLX() {
        return DBLX;
    }

    public void setDBLX(String dBLX) {
        DBLX = dBLX;
    }

    public String getLastStep() {
        return lastStep;
    }

    public void setLastStep(String lastStep) {
        this.lastStep = lastStep;
    }

    public String getSortColumn() {
        return sortColumn;
    }

    public void setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        try {
            statusName = URLDecoder.decode(URLDecoder.decode(statusName, "UTF-8"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.statusName = statusName;

    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * @return the defaultStepName
     */
    public String getDefaultStepName() {
        return defaultStepName;
    }

    /**
     * @param defaultStepName the defaultStepName to set
     */
    public void setDefaultStepName(String defaultStepName) {
        this.defaultStepName = defaultStepName;
    }

    /**
     * @return the defaultbizName
     */
    public String getDefaultbizName() {
        return defaultbizName;
    }

    /**
     * @param defaultbizName the defaultbizName to set
     */
    public void setDefaultbizName(String defaultbizName) {
        this.defaultbizName = defaultbizName;
    }
}
