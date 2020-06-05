package com.fante.dubbo.manage.service;

import com.fante.dubbo.manage.entity.SysAdmin;
import java.util.List;

/**
 * (SysAdmin)表服务接口
 *
 * @author liubao
 * @since 2020-06-05 12:01:58
 */
public interface SysAdminService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysAdmin queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysAdmin> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysAdmin 实例对象
     * @return 实例对象
     */
    SysAdmin insert(SysAdmin sysAdmin);

    /**
     * 修改数据
     *
     * @param sysAdmin 实例对象
     * @return 实例对象
     */
    SysAdmin update(SysAdmin sysAdmin);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}