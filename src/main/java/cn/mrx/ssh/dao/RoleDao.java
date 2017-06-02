package cn.mrx.ssh.dao;

import cn.mrx.ssh.model.Role;

import java.util.List;

/**
 * @ClassName: UserDao
 * @Author: Mr.X
 * @Date: 2017/5/31 22:50
 * @Description:
 * @Version 1.0
 */
public interface RoleDao {

    List<Role> loadAll();

    Integer save(Role role);
}
