package com.github.zillionchu.controller;

import java.util.List;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-05 10:38
 * @Description:
 */
public class AgentFlowDto {

    /**
     * 节点名称
     */
    private String nodeName;

    /**
     * 系统类型(RT:软通OA:新平台)
     */
    private String systemType;

    /**
     * 委托人id
     */
    private Long agentFromId;

    /**
     * 代理人id集合
     */
    private List<Long> agentToIdList;

    /**
     * 提交人部门id
     */
    private Long submitPersonDeptId;

    /**
     * 流程定义id
     */
    private Long flowId;

    /**
     * 工作项id
     */
    private Long workItemId;

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }

    public Long getAgentFromId() {
        return agentFromId;
    }

    public void setAgentFromId(Long agentFromId) {
        this.agentFromId = agentFromId;
    }

    public List<Long> getAgentToIdList() {
        return agentToIdList;
    }

    public void setAgentToIdList(List<Long> agentToIdList) {
        this.agentToIdList = agentToIdList;
    }

    public Long getSubmitPersonDeptId() {
        return submitPersonDeptId;
    }

    public void setSubmitPersonDeptId(Long submitPersonDeptId) {
        this.submitPersonDeptId = submitPersonDeptId;
    }

    public Long getFlowId() {
        return flowId;
    }

    public void setFlowId(Long flowId) {
        this.flowId = flowId;
    }

    public Long getWorkItemId() {
        return workItemId;
    }

    public void setWorkItemId(Long workItemId) {
        this.workItemId = workItemId;
    }

    @Override
    public String toString() {
        return "AgentFlowDto{" +
                "nodeName='" + nodeName + '\'' +
                ", systemType='" + systemType + '\'' +
                ", agentFromId=" + agentFromId +
                ", agentToIdList=" + agentToIdList +
                ", submitPersonDeptId=" + submitPersonDeptId +
                ", flowId=" + flowId +
                ", workItemId=" + workItemId +
                '}';
    }
}
