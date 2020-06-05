package com.fante.dubbo.manage.controller;

import com.fante.dubbo.manage.entity.SysAdmin;
import com.fante.dubbo.manage.service.SysAdminService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysAdmin)表控制层
 *
 * @author liubao
 * @since 2020-06-05 12:01:58
 */
@RestController
@RequestMapping("sysAdmin")
public class SysAdminController {
    /**
     * 服务对象
     */
    @Resource
    private SysAdminService sysAdminService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysAdmin selectOne(Integer id) {
        return this.sysAdminService.queryById(id);
    }

}