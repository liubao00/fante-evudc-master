package com.fante.dubbo.manage.controller;

import com.fante.dubbo.manage.entity.Authority;
import com.fante.dubbo.manage.service.AuthorityService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Authority)表控制层
 *
 * @author liubao
 * @since 2020-06-05 12:02:33
 */
@RestController
@RequestMapping("authority")
public class AuthorityController {
    /**
     * 服务对象
     */
    @Resource
    private AuthorityService authorityService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Authority selectOne(Integer id) {
        return this.authorityService.queryById(id);
    }

}