package com.fante.dubbo.manage.service.impl;

import com.fante.dubbo.manage.entity.SysAdmin;
import com.fante.dubbo.manage.dao.SysAdminDao;
import com.fante.dubbo.manage.service.SysAdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysAdmin)表服务实现类
 *
 * @author liubao
 * @since 2020-06-05 12:01:58
 */
@Service("sysAdminService")
public class SysAdminServiceImpl implements SysAdminService {
    @Resource
    private SysAdminDao sysAdminDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysAdmin queryById(Integer id) {
        return this.sysAdminDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SysAdmin> queryAllByLimit(int offset, int limit) {
        return this.sysAdminDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysAdmin 实例对象
     * @return 实例对象
     */
    @Override
    public SysAdmin insert(SysAdmin sysAdmin) {
        this.sysAdminDao.insert(sysAdmin);
        return sysAdmin;
    }

    /**
     * 修改数据
     *
     * @param sysAdmin 实例对象
     * @return 实例对象
     */
    @Override
    public SysAdmin update(SysAdmin sysAdmin) {
        this.sysAdminDao.update(sysAdmin);
        return this.queryById(sysAdmin.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sysAdminDao.deleteById(id) > 0;
    }
}