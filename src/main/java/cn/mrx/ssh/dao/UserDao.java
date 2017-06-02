package cn.mrx.ssh.dao;

import cn.mrx.ssh.model.User;

import java.util.List;

/**
 * @ClassName: UserDao
 * @Author: Mr.X
 * @Date: 2017/5/31 22:50
 * @Description:
 * @Version 1.0
 */
public interface UserDao {

    List<User> loadAll();

    Integer save(User user);
}
