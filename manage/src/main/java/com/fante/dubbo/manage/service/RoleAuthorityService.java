package com.fante.dubbo.manage.service;

import com.fante.dubbo.manage.entity.RoleAuthority;
import java.util.List;

/**
 * (RoleAuthority)表服务接口
 *
 * @author liubao
 * @since 2020-06-05 12:03:00
 */
public interface RoleAuthorityService {

    /**
     * 通过ID查询单条数据
     *
     * @param roles 主键
     * @return 实例对象
     */
    RoleAuthority queryById(Integer roles);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<RoleAuthority> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param roleAuthority 实例对象
     * @return 实例对象
     */
    RoleAuthority insert(RoleAuthority roleAuthority);

    /**
     * 修改数据
     *
     * @param roleAuthority 实例对象
     * @return 实例对象
     */
    RoleAuthority update(RoleAuthority roleAuthority);

    /**
     * 通过主键删除数据
     *
     * @param roles 主键
     * @return 是否成功
     */
    boolean deleteById(Integer roles);

}