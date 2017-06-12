package cn.mrx.ssh.service;

import cn.mrx.ssh.model.User;

import java.util.List;

/**
 * @ClassName: UserService
 * @Author: Mr.X
 * @Date: 2017/5/31 23:09
 * @Description:
 * @Version 1.0
 */
public interface UserService {

    List<User> loadAll();

    Integer save(User user);

    User get(int id);
}
