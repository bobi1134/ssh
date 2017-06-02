package cn.mrx.ssh.service;

import cn.mrx.ssh.model.Role;

import java.util.List;

/**
 * @ClassName: RoleService
 * @Author: Mr.X
 * @Date: 2017/6/1 20:34
 * @Description:
 * @Version 1.0
 */
public interface RoleService {

    List<Role> loadAll();

    Integer save(Role Role);
}
