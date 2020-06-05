package com.fante.dubbo.manage.entity;

import java.io.Serializable;

/**
 * (Authority)实体类
 *
 * @author liubao
 * @since 2020-06-05 12:02:33
 */
public class Authority implements Serializable {
    private static final long serialVersionUID = 767735325767993054L;
    
    private Integer id;
    /**
    * 权限模块
    */
    private String authority;
    /**
    * 角色名称
    */
    private String description;
    /**
    * 父级权限模块
    */
    private Integer parentId;
    /**
    * 权限模块地址
    */
    private String url;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}