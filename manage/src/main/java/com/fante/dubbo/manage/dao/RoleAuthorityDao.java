package com.fante.dubbo.manage.dao;

import com.fante.dubbo.manage.entity.RoleAuthority;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * (RoleAuthority)表数据库访问层
 *
 * @author liubao
 * @since 2020-06-05 12:03:00
 */
public interface RoleAuthorityDao {

    /**
     * 通过ID查询单条数据
     *
     * @param roles 主键
     * @return 实例对象
     */
    RoleAuthority queryById(Integer roles);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<RoleAuthority> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param roleAuthority 实例对象
     * @return 对象列表
     */
    List<RoleAuthority> queryAll(RoleAuthority roleAuthority);

    /**
     * 新增数据
     *
     * @param roleAuthority 实例对象
     * @return 影响行数
     */
    int insert(RoleAuthority roleAuthority);

    /**
     * 修改数据
     *
     * @param roleAuthority 实例对象
     * @return 影响行数
     */
    int update(RoleAuthority roleAuthority);

    /**
     * 通过主键删除数据
     *
     * @param roles 主键
     * @return 影响行数
     */
    int deleteById(Integer roles);

}