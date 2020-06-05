package com.fante.dubbo.manage.service.impl;

import com.fante.dubbo.manage.entity.AdminRole;
import com.fante.dubbo.manage.dao.AdminRoleDao;
import com.fante.dubbo.manage.service.AdminRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AdminRole)表服务实现类
 *
 * @author liubao
 * @since 2020-06-05 11:47:46
 */
@Service("adminRoleService")
public class AdminRoleServiceImpl implements AdminRoleService {
    @Resource
    private AdminRoleDao adminRoleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AdminRole queryById(Integer id) {
        return this.adminRoleDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<AdminRole> queryAllByLimit(int offset, int limit) {
        return this.adminRoleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param adminRole 实例对象
     * @return 实例对象
     */
    @Override
    public AdminRole insert(AdminRole adminRole) {
        this.adminRoleDao.insert(adminRole);
        return adminRole;
    }

    /**
     * 修改数据
     *
     * @param adminRole 实例对象
     * @return 实例对象
     */
    @Override
    public AdminRole update(AdminRole adminRole) {
        this.adminRoleDao.update(adminRole);
        return this.queryById(adminRole.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.adminRoleDao.deleteById(id) > 0;
    }
}