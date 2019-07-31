package com.github.zilionchu.test.zilionchutest.jdbc;

import java.sql.Timestamp;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-07-10 17:29
 * @Description:
 */
public class TaskViewPO {

    @Override
    public String toString() {
        return "---TaskViewPO{" +
                "ID=" + ID +
                ", workItemID=" + workItemID +
                ", workItemName='" + workItemName + '\'' +
                ", userID=" + userID +
                ", userName='" + userName + '\'' +
                ", createTime=" + createTime +
                ", currentState='" + currentState + '\'' +
                ", processInstID=" + processInstID +
                ", processInstName='" + processInstName + '\'' +
                ", actionURL='" + actionURL + '\'' +
                ", businessID=" + businessID +
                ", projectID=" + projectID +
                ", projectName='" + projectName + '\'' +
                ", bizName='" + bizName + '\'' +
                ", amount=" + amount +
                ", memo='" + memo + '\'' +
                ", activityInstID=" + activityInstID +
                ", activityInstName='" + activityInstName + '\'' +
                ", spr=" + spr +
                ", wtr=" + wtr +
                ", sfzhjd='" + sfzhjd + '\'' +
                ", dblx='" + dblx + '\'' +
                ", approver='" + approver + '\'' +
                ", processdefname='" + processdefname + '\'' +
                ", activitydefid='" + activitydefid + '\'' +
                '}';
    }

    /**
     * 序号
     */
    private Long ID;
    /**
     * 工作项ID
     */
    private Long workItemID;
    /**
     * 工作项名称
     */
    private String workItemName;
    /**
     * 提交人ID
     */
    private Long userID;
    /**
     * 提交人
     */
    private String userName;
    /**
     * 创建时间
     */
    private Timestamp createTime;
    /**
     * 流程状态
     */
    private String currentState;
    /**
     * 流程实例ID
     */
    private Long processInstID;
    /**
     * 流程实例名称
     */
    private String processInstName;
    /**
     * 审批URL
     */
    private String actionURL;
    /**
     * 业务ID
     */
    private Long businessID;
    /**
     * 项目ID
     */
    private Long projectID;
    /**
     * 项目名称
     */
    private String projectName;
    /**
     * 业务名称
     */
    private String bizName;
    /**
     * 金额
     */
    private Double amount;
    /**
     * 摘要
     */
    private String memo;
    /**
     * 活动实例ID
     */
    private Long activityInstID;
    /**
     * 节点名称
     */
    private String activityInstName;
    /**
     * 审批人
     */
    private Long spr;
    /**
     * 委托人、权限转移人
     */
    private Long wtr;
    /**
     * 是否最后节点
     */
    private String sfzhjd;
    /**
     * 待办类型
     */
    private String dblx;

    private String approver;
    private String processdefname;//流程定义ID

    private String activitydefid;//节点ID

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getWorkItemID() {
        return workItemID;
    }

    public void setWorkItemID(Long workItemID) {
        this.workItemID = workItemID;
    }

    public String getWorkItemName() {
        return workItemName;
    }

    public void setWorkItemName(String workItemName) {
        this.workItemName = workItemName;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    public Long getProcessInstID() {
        return processInstID;
    }

    public void setProcessInstID(Long processInstID) {
        this.processInstID = processInstID;
    }

    public String getProcessInstName() {
        return processInstName;
    }

    public void setProcessInstName(String processInstName) {
        this.processInstName = processInstName;
    }

    public String getActionURL() {
        return actionURL;
    }

    public void setActionURL(String actionURL) {
        this.actionURL = actionURL;
    }

    public Long getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Long businessID) {
        this.businessID = businessID;
    }

    public Long getProjectID() {
        return projectID;
    }

    public void setProjectID(Long projectID) {
        this.projectID = projectID;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getBizName() {
        return bizName;
    }

    public void setBizName(String bizName) {
        this.bizName = bizName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Long getActivityInstID() {
        return activityInstID;
    }

    public void setActivityInstID(Long activityInstID) {
        this.activityInstID = activityInstID;
    }

    public String getActivityInstName() {
        return activityInstName;
    }

    public void setActivityInstName(String activityInstName) {
        this.activityInstName = activityInstName;
    }

    public Long getSpr() {
        return spr;
    }

    public void setSpr(Long spr) {
        this.spr = spr;
    }

    public Long getWtr() {
        return wtr;
    }

    public void setWtr(Long wtr) {
        this.wtr = wtr;
    }

    public String getSfzhjd() {
        return sfzhjd;
    }

    public void setSfzhjd(String sfzhjd) {
        this.sfzhjd = sfzhjd;
    }

    public String getDblx() {
        return dblx;
    }

    public void setDblx(String dblx) {
        this.dblx = dblx;
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public String getProcessdefname() {
        return processdefname;
    }

    public void setProcessdefname(String processdefname) {
        this.processdefname = processdefname;
    }

    public String getActivitydefid() {
        return activitydefid;
    }

    public void setActivitydefid(String activitydefid) {
        this.activitydefid = activitydefid;
    }
}
