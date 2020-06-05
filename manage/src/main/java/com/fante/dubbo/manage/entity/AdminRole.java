package com.fante.dubbo.manage.entity;

import java.io.Serializable;

/**
 * (AdminRole)实体类
 *
 * @author liubao
 * @since 2020-06-05 11:47:44
 */
public class AdminRole implements Serializable {
    private static final long serialVersionUID = 921770551330193146L;
    /**
    * 主键id
    */
    private Integer id;
    /**
    * 账号id
    */
    private Integer adminId;
    /**
    * 角色id
    */
    private Integer roleId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

}