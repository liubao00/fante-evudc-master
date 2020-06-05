package com.fante.dubbo.manage.controller;

import com.fante.dubbo.manage.entity.AdminRole;
import com.fante.dubbo.manage.service.AdminRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AdminRole)表控制层
 *
 * @author liubao
 * @since 2020-06-05 11:47:46
 */
@RestController
@RequestMapping("adminRole")
public class AdminRoleController {
    /**
     * 服务对象
     */
    @Resource
    private AdminRoleService adminRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AdminRole selectOne(Integer id) {
        return this.adminRoleService.queryById(id);
    }

}