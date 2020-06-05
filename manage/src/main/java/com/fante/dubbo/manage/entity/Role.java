package com.fante.dubbo.manage.entity;

import java.io.Serializable;

/**
 * (Role)实体类
 *
 * @author liubao
 * @since 2020-06-05 12:01:12
 */
public class Role implements Serializable {
    private static final long serialVersionUID = -56089556785567545L;
    
    private Integer id;
    /**
    * 角色名称
    */
    private String name;
    /**
    * 角色描述
    */
    private String description;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}