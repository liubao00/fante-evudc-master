package com.fante.dubbo.manage.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (SysAdmin)实体类
 *
 * @author liubao
 * @since 2020-06-05 12:01:58
 */
public class SysAdmin implements Serializable {
    private static final long serialVersionUID = -77683169889250935L;
    
    private Integer id;
    /**
    * 运营商id
    */
    private Integer operatorId;
    /**
    * 运营商名称
    */
    private String operatorName;
    /**
    * 角色Id
    */
    private Integer roleId;
    /**
    * 角色名称
    */
    private String roleName;
    /**
    * 是否上级运营商 0：否，1：是
    */
    private Integer isFather;
    /**
    * 上级账号id
    */
    private Integer parentId;
    /**
    * 下级账号id冗余（如：1,2,3）
    */
    private String treeIds;
    /**
    * 用户名
    */
    private String username;
    /**
    * 密码
    */
    private String password;
    /**
    * 0：启用，1：禁用
    */
    private Integer isEnabled;
    /**
    * 0：未锁，1：锁住
    */
    private Integer isLocked;
    /**
    * 最后登录ip
    */
    private String loginIp;
    /**
    * 最后登录时间
    */
    private Date loginDate;
    /**
    * 登录失败次数，5次锁住
    */
    private Integer loginFailureCount;
    /**
    * 锁定时间
    */
    private Date lockedDate;
    /**
    * 管理员姓名
    */
    private String name;
    /**
    * 手机号
    */
    private String mobile;
    /**
    * 邮箱
    */
    private String email;
    /**
    * 简介
    */
    private String introduction;
    
    private Date addTime;
    /**
    * 管理的电站id
    */
    private Integer stationId;
    /**
    * 集团id
    */
    private String groupId;
    /**
    * 国标id
    */
    private String nationalId;
    /**
    * 是否登录  0未登录  1已登录
    */
    private Integer isLogin;
    /**
    * 是否允许同时登录  0不允许  1允许
    */
    private Integer moreLogin;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getIsFather() {
        return isFather;
    }

    public void setIsFather(Integer isFather) {
        this.isFather = isFather;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getTreeIds() {
        return treeIds;
    }

    public void setTreeIds(String treeIds) {
        this.treeIds = treeIds;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Integer getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Integer isLocked) {
        this.isLocked = isLocked;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public Integer getLoginFailureCount() {
        return loginFailureCount;
    }

    public void setLoginFailureCount(Integer loginFailureCount) {
        this.loginFailureCount = loginFailureCount;
    }

    public Date getLockedDate() {
        return lockedDate;
    }

    public void setLockedDate(Date lockedDate) {
        this.lockedDate = lockedDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public Integer getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(Integer isLogin) {
        this.isLogin = isLogin;
    }

    public Integer getMoreLogin() {
        return moreLogin;
    }

    public void setMoreLogin(Integer moreLogin) {
        this.moreLogin = moreLogin;
    }

}