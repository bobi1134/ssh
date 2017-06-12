package cn.mrx.ssh.model;

import javax.persistence.*;
import java.util.Set;

/**
 * @ClassName: Role
 * @Author: Mr.X
 * @Date: 2017/5/31 22:43
 * @Description:
 * @Version 1.0
 */
public class Role {

    private Integer id;
    private String roleName;
    private String roleDescription;

    /**
     * 角色和用户：一对多
     */
    private Set<User> users;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
