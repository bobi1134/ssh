package cn.mrx.ssh.dao.impl;

import cn.mrx.ssh.dao.RoleDao;
import cn.mrx.ssh.model.Role;
import cn.mrx.ssh.model.User;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * @ClassName: UserDaoImpl
 * @Author: Mr.X
 * @Date: 2017/5/31 22:51
 * @Description:
 * @Version 1.0
 */
public class RoleDaoImpl extends HibernateDaoSupport implements RoleDao {

    @Override
    public List<Role> loadAll() {
        return getHibernateTemplate().loadAll(Role.class);
    }

    @Override
    public Integer save(Role role) {
        return (Integer) getHibernateTemplate().save(role);
    }
}
