package com.fante.dubbo.manage.service.impl;

import com.fante.dubbo.manage.entity.RoleAuthority;
import com.fante.dubbo.manage.dao.RoleAuthorityDao;
import com.fante.dubbo.manage.service.RoleAuthorityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (RoleAuthority)表服务实现类
 *
 * @author liubao
 * @since 2020-06-05 12:03:00
 */
@Service("roleAuthorityService")
public class RoleAuthorityServiceImpl implements RoleAuthorityService {
    @Resource
    private RoleAuthorityDao roleAuthorityDao;

    /**
     * 通过ID查询单条数据
     *
     * @param roles 主键
     * @return 实例对象
     */
    @Override
    public RoleAuthority queryById(Integer roles) {
        return this.roleAuthorityDao.queryById(roles);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<RoleAuthority> queryAllByLimit(int offset, int limit) {
        return this.roleAuthorityDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param roleAuthority 实例对象
     * @return 实例对象
     */
    @Override
    public RoleAuthority insert(RoleAuthority roleAuthority) {
        this.roleAuthorityDao.insert(roleAuthority);
        return roleAuthority;
    }

    /**
     * 修改数据
     *
     * @param roleAuthority 实例对象
     * @return 实例对象
     */
    @Override
    public RoleAuthority update(RoleAuthority roleAuthority) {
        this.roleAuthorityDao.update(roleAuthority);
        return this.queryById(roleAuthority.getRoles());
    }

    /**
     * 通过主键删除数据
     *
     * @param roles 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer roles) {
        return this.roleAuthorityDao.deleteById(roles) > 0;
    }
}