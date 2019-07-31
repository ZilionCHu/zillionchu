package com.github.zilionchu.test.zilionchutest.jdbc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-07-10 16:51
 * @Description:
 */
public class WFWorkItem extends WFUserObject{

    private static final long serialVersionUID = -4353273982550620758L;
    long workItemID = -9223372036854775807L;
    String workItemName = null;
    String workItemType = null;
    String workItemDesc = null;
    int currentState = -2147483647;
    String partiName = null;
    int priority = -2147483647;
    String isTimeOut = null;
    long limitNum = -9223372036854775807L;
    String limitNumDesc = null;
    String createTime = null;
    String startTime = null;
    String endTime = null;
    String finalTime = null;
    String remindTime = null;
    String actionURL = null;
    long processInstID = -9223372036854775807L;
    long activityInstID = -9223372036854775807L;
    String statesList = null;
    int timeOutNum = -2147483647;
    String timeOutNumDesc = null;
    String actionMask = "NNYYNYNN";
    String processInstName = null;
    String activityInstName = null;
    long processDefID = -9223372036854775807L;
    String processDefName = null;
    String processChName = null;
    String activityDefID = null;
    String allowAgent = null;
    int bizState = -2147483647;
    String assistantName = null;
    String urlType = null;
    long rootProcInstID = -9223372036854775807L;
    String participant = null;
    String assistant = null;
    private Map bizObject = new HashMap();
    String catalogUUID = null;
    String catalogName = null;
    String dealOpinion = null;
    String dealResult = null;
    private List<WFParticipant> participants = new ArrayList();

    public WFWorkItem() {
    }

    /** @deprecated */
    @Deprecated
    public String getDealOpinion() {
        return this.dealOpinion;
    }

    /** @deprecated */
    @Deprecated
    public void setDealOpinion(String dealOpinion) {
        this.dealOpinion = dealOpinion;
    }

    /** @deprecated */
    @Deprecated
    public String getDealResult() {
        return this.dealResult;
    }

    /** @deprecated */
    @Deprecated
    public void setDealResult(String dealResult) {
        this.dealResult = dealResult;
    }

    public String getCatalogName() {
        return this.catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getCatalogUUID() {
        return this.catalogUUID;
    }

    public void setCatalogUUID(String catalogUUID) {
        this.catalogUUID = catalogUUID;
    }

    public String getActionURL() {
        return this.actionURL;
    }

    public void setActionURL(String actionURL) {
        this.actionURL = actionURL;
    }

    public String getActivityDefID() {
        return this.activityDefID;
    }

    public void setActivityDefID(String activityDefID) {
        this.activityDefID = activityDefID;
    }

    public long getActivityInstID() {
        return this.activityInstID;
    }

    public void setActivityInstID(long activityInstID) {
        this.activityInstID = activityInstID;
    }

    public String getActivityInstName() {
        return this.activityInstName;
    }

    public void setActivityInstName(String activityInstName) {
        this.activityInstName = activityInstName;
    }

    public String getAllowAgent() {
        return this.allowAgent;
    }

    public void setAllowAgent(String allowAgent) {
        this.allowAgent = allowAgent;
    }

    public String getAssistantName() {
        return this.assistantName;
    }

    public void setAssistantName(String assistant) {
        this.assistantName = assistant;
    }

    public int getBizState() {
        return this.bizState;
    }

    public void setBizState(int bizState) {
        this.bizState = bizState;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getCurrentState() {
        return this.currentState;
    }

    public void setCurrentState(int currentState) {
        this.currentState = currentState;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getActionMask() {
        return this.actionMask;
    }

    public void setActionMask(String actionMask) {
        this.actionMask = actionMask;
    }

    public String getFinalTime() {
        return this.finalTime;
    }

    public void setFinalTime(String finalTime) {
        this.finalTime = finalTime;
    }

    public String getIsTimeOut() {
        return this.isTimeOut;
    }

    public void setIsTimeOut(String isTimeOut) {
        this.isTimeOut = isTimeOut;
    }

    public long getLimitNum() {
        return this.limitNum;
    }

    public void setLimitNum(long limitNum) {
        this.limitNum = limitNum;
    }

    public String getLimitNumDesc() {
        return this.limitNumDesc;
    }

    public void setLimitNumDesc(String limitNumDesc) {
        this.limitNumDesc = limitNumDesc;
    }

    public String getPartiName() {
        return this.partiName;
    }

    public void setPartiName(String participant) {
        this.partiName = participant;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getProcessChName() {
        return this.processChName;
    }

    public void setProcessChName(String processChName) {
        this.processChName = processChName;
    }

    public long getProcessDefID() {
        return this.processDefID;
    }

    public void setProcessDefID(long processDefID) {
        this.processDefID = processDefID;
    }

    public String getProcessDefName() {
        return this.processDefName;
    }

    public void setProcessDefName(String processDefName) {
        this.processDefName = processDefName;
    }

    public long getProcessInstID() {
        return this.processInstID;
    }

    public void setProcessInstID(long processInstID) {
        this.processInstID = processInstID;
    }

    public String getProcessInstName() {
        return this.processInstName;
    }

    public void setProcessInstName(String processInstName) {
        this.processInstName = processInstName;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStatesList() {
        return this.statesList;
    }

    public void setStatesList(String statesList) {
        this.statesList = statesList;
    }

    public int getTimeOutNum() {
        return this.timeOutNum;
    }

    public void setTimeOutNum(int timeOutNum) {
        this.timeOutNum = timeOutNum;
    }

    public String getTimeOutNumDesc() {
        return this.timeOutNumDesc;
    }

    public void setTimeOutNumDesc(String timeOutNumDesc) {
        this.timeOutNumDesc = timeOutNumDesc;
    }

    public String getWorkItemDesc() {
        return this.workItemDesc;
    }

    public void setWorkItemDesc(String workItemDesc) {
        this.workItemDesc = workItemDesc;
    }

    public long getWorkItemID() {
        return this.workItemID;
    }

    public void setWorkItemID(long workItemID) {
        this.workItemID = workItemID;
    }

    public String getWorkItemName() {
        return this.workItemName;
    }

    public void setWorkItemName(String workItemName) {
        this.workItemName = workItemName;
    }

    public String getWorkItemType() {
        return this.workItemType;
    }

    public void setWorkItemType(String workItemType) {
        this.workItemType = workItemType;
    }

    public String getRemindTime() {
        return this.remindTime;
    }

    public void setRemindTime(String remindTime) {
        this.remindTime = remindTime;
    }

    public String getUrlType() {
        return this.urlType;
    }

    public void setUrlType(String urlType) {
        this.urlType = urlType;
    }

    public long getRootProcInstID() {
        return this.rootProcInstID;
    }

    public void setRootProcInstID(long rootProcInstID) {
        this.rootProcInstID = rootProcInstID;
    }

    public Map getBizObject() {
        return this.bizObject;
    }

    public void setBizObject(Map bizMap) {
        this.bizObject = bizMap;
    }

    public String getAssistant() {
        return this.assistant;
    }

    public void setAssistant(String assistantID) {
        this.assistant = assistantID;
    }

    public String getParticipant() {
        return this.participant;
    }

    public void setParticipant(String participantID) {
        this.participant = participantID;
    }

    public List<WFParticipant> getParticipants() {
        return this.participants;
    }

    public void setParticipants(List<WFParticipant> list) {
        this.participants = list;
    }
}
