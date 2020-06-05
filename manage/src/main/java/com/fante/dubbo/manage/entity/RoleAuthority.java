package com.fante.dubbo.manage.entity;

import java.io.Serializable;

/**
 * (RoleAuthority)实体类
 *
 * @author liubao
 * @since 2020-06-05 12:03:00
 */
public class RoleAuthority implements Serializable {
    private static final long serialVersionUID = -57144092278337102L;
    /**
    * 角色id
    */
    private Integer roles;
    /**
    * 权限id
    */
    private Integer authorities;


    public Integer getRoles() {
        return roles;
    }

    public void setRoles(Integer roles) {
        this.roles = roles;
    }

    public Integer getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Integer authorities) {
        this.authorities = authorities;
    }

}