package cn.mrx.test;

import cn.mrx.ssh.model.Role;
import cn.mrx.ssh.model.User;
import cn.mrx.ssh.service.RoleService;
import cn.mrx.ssh.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @ClassName: UserTest
 * @Author: Mr.X
 * @Date: 2017/5/31 22:54
 * @Description:
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-service.xml", "classpath:spring/spring-dao.xml"})
public class UserTest {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    /**
     * 插入测试 & 事务测试
     */
    @Test
    public void test1(){
        User user = new User();
        user.setUserName("user-1");
        user.setRole(roleService.get(1));
        System.out.println("---->"+userService.save(user));

        user.setUserName("user-2");
        user.setRole(roleService.get(2));
        System.out.println("---->"+userService.save(user));

        user.setUserName("user-3");
        user.setRole(roleService.get(3));
        System.out.println("---->"+userService.save(user));
    }

    /**
     * 查询测试
     */
    @Test
    public void test2(){
        List<User> users = userService.loadAll();
        for (User user : users){
            System.out.println("---->"+user);
        }
    }

    /**
     * get()查询用户
     */
    @Test
    public void test3(){
        System.out.println("--->"+userService.get(1));
    }
}
