package cn.mrx.ssh.service.impl;

import cn.mrx.ssh.dao.RoleDao;
import cn.mrx.ssh.dao.UserDao;
import cn.mrx.ssh.model.User;
import cn.mrx.ssh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName: UserServiceImpl
 * @Author: Mr.X
 * @Date: 2017/5/31 23:09
 * @Description:
 * @Version 1.0
 */
@Service
@Transactional(rollbackFor = RuntimeException.class)
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Transactional(readOnly = true)
    @Override
    public List<User> loadAll() {
        return userDao.loadAll();
    }

    @Override
    public Integer save(User user) {
        Integer res = userDao.save(user);
//        int a = 10 / 0;
        return res;
    }
}
