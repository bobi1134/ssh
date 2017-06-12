package cn.mrx.ssh.dao.impl;

import cn.mrx.ssh.dao.UserDao;
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
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    public List<User> loadAll() {
        return getHibernateTemplate().loadAll(User.class);
    }

    public Integer save(User user) {
        return (Integer) getHibernateTemplate().save(user);
    }

    @Override
    public User get(int id) {
        return getHibernateTemplate().get(User.class, id);
    }
}
