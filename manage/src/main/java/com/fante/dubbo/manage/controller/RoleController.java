package com.fante.dubbo.manage.controller;

import com.fante.dubbo.manage.entity.Role;
import com.fante.dubbo.manage.service.RoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Role)表控制层
 *
 * @author liubao
 * @since 2020-06-05 12:01:12
 */
@RestController
@RequestMapping("role")
public class RoleController {
    /**
     * 服务对象
     */
    @Resource
    private RoleService roleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Role selectOne(Integer id) {
        return this.roleService.queryById(id);
    }

}