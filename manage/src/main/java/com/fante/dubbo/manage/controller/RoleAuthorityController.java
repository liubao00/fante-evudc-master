package com.fante.dubbo.manage.controller;

import com.fante.dubbo.manage.entity.RoleAuthority;
import com.fante.dubbo.manage.service.RoleAuthorityService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (RoleAuthority)表控制层
 *
 * @author liubao
 * @since 2020-06-05 12:03:00
 */
@RestController
@RequestMapping("roleAuthority")
public class RoleAuthorityController {
    /**
     * 服务对象
     */
    @Resource
    private RoleAuthorityService roleAuthorityService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public RoleAuthority selectOne(Integer id) {
        return this.roleAuthorityService.queryById(id);
    }

}