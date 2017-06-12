package cn.mrx.test;

import cn.mrx.ssh.model.Role;
import cn.mrx.ssh.service.RoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName: RoleTest
 * @Author: Mr.X
 * @Date: 2017/6/12 13:26
 * @Description:
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-service.xml", "classpath:spring/spring-dao.xml"})
public class RoleTest {

    @Autowired
    private RoleService roleService;

    /**
     * 添加角色
     */
    @Test
    public void test1(){
        Role role = new Role();
        role.setRoleName("ADMIN");
        role.setRoleDescription("超级管理员");
        System.out.println("---->"+roleService.save(role));

        role.setRoleName("WEB_MANAGER");
        role.setRoleDescription("网站管理员");
        System.out.println("---->"+roleService.save(role));

        role.setRoleName("WEB_USER");
        role.setRoleDescription("网站会员");
        System.out.println("---->"+roleService.save(role));
    }

    /**
     * get()查询角色
     */
    @Test
    public void test2(){
        System.out.println("---->"+roleService.get(1));
    }

    /**
     * 删除角色
     */
    @Test
    public void test3(){
        Role role = new Role();
        role.setId(2);
        roleService.delete(role);
    }

    /**
     * 修改角色
     */
    @Test
    public void test4(){
        Role role = roleService.get(1);
        role.setRoleDescription("xxxxxxxxx");
        roleService.update(role);
    }
}
