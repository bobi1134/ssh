package cn.mrx.test;

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
 * @ClassName: HibernateTest
 * @Author: Mr.X
 * @Date: 2017/5/31 22:54
 * @Description:
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-service.xml", "classpath:spring/spring-dao.xml"})
public class HibernateTest {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    /**
     * 查询测试
     */
    @Test
    public void test1(){
        List<User> users = userService.loadAll();
        System.out.println("-----------------------------------------------");
        for (User user : users){
            System.out.println(user);
        }
    }

    /**
     * 插入测试 & 事务测试
     */
    @Test
    public void test2(){
        User user = new User();
        user.setUserName("user-2");
        Integer res = userService.save(user);
        System.out.println(res);
    }
}
