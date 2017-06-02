package cn.mrx.ssh.service.impl;

import cn.mrx.ssh.dao.RoleDao;
import cn.mrx.ssh.model.Role;
import cn.mrx.ssh.model.User;
import cn.mrx.ssh.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName: RoleServiceImpl
 * @Author: Mr.X
 * @Date: 2017/6/1 20:34
 * @Description:
 * @Version 1.0
 */
@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public List<Role> loadAll() {
        return roleDao.loadAll();
    }

    @Override
    public Integer save(Role role) {
        return roleDao.save(role);
    }
}
