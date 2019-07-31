package com.github.zilionchu.test.zilionchutest.jdbc;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-07-10 16:53
 * @Description:
 */
public class SysUser {

    private static final long serialVersionUID = 1836816150756090161L;

    private String cardType;//证件类型

    private Long ID;

    private String cardNo;//证件号码

    private String cardtypename;//证件类型名称

    private String tmcertificationno;//信托经理资格认证号码

    private String userCode;//用户编号

    private String userName;//用户名称

    private String userPassword;//用户密码

    private String userPhone;//用户电话

    private String mobile;

    private String userEmail;//用户Email

    private Long userDepartmentid;//用户所在部门号

    private String departmentName;//部门名称

    private Long userPosition;//是否部门经理

    private Long userState;//用户状态

    //private Long   userparentid;//上一级人员

    private String stateName;//状态名称

    private String userPositionName;//职位名称

    private Long userParentId; //上级领导ID

    private String userParentName; //上级领导名称



    private String firstStrs;//名称中每个字的第一个字母组成的字符串

    private boolean isManager = false;

    private boolean loginIsManager = false;

    private String userLocalCode;//员工编号


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardtypename() {
        return cardtypename;
    }

    public void setCardtypename(String cardtypename) {
        this.cardtypename = cardtypename;
    }

    public String getTmcertificationno() {
        return tmcertificationno;
    }

    public void setTmcertificationno(String tmcertificationno) {
        this.tmcertificationno = tmcertificationno;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Long getUserDepartmentid() {
        return userDepartmentid;
    }

    public void setUserDepartmentid(Long userDepartmentid) {
        this.userDepartmentid = userDepartmentid;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Long getUserPosition() {
        return userPosition;
    }

    public void setUserPosition(Long userPosition) {
        this.userPosition = userPosition;
    }

    public Long getUserState() {
        return userState;
    }

    public void setUserState(Long userState) {
        this.userState = userState;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getUserPositionName() {
        return userPositionName;
    }

    public void setUserPositionName(String userPositionName) {
        this.userPositionName = userPositionName;
    }

    public Long getUserParentId() {
        return userParentId;
    }

    public void setUserParentId(Long userParentId) {
        this.userParentId = userParentId;
    }

    public String getUserParentName() {
        return userParentName;
    }

    public void setUserParentName(String userParentName) {
        this.userParentName = userParentName;
    }

    public String getFirstStrs() {
        return firstStrs;
    }

    public void setFirstStrs(String firstStrs) {
        this.firstStrs = firstStrs;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    public boolean isLoginIsManager() {
        return loginIsManager;
    }

    public void setLoginIsManager(boolean loginIsManager) {
        this.loginIsManager = loginIsManager;
    }

    public String getUserLocalCode() {
        return userLocalCode;
    }

    public void setUserLocalCode(String userLocalCode) {
        this.userLocalCode = userLocalCode;
    }
}
