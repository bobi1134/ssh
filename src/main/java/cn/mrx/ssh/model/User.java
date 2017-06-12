package cn.mrx.ssh.model;

/**
 * @ClassName: UserDaoImpl
 * @Author: Mr.X
 * @Date: 2017/5/31 22:40
 * @Description:
 * @Version 1.0
 */
public class User {
    private Integer id;
    private String userName;
    private String pwd;
    private String reallyName;
    private String regTime;
    private Integer enabled;

    /**
     * 用户和角色：多对一
     */
    private Role role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getReallyName() {
        return reallyName;
    }

    public void setReallyName(String reallyName) {
        this.reallyName = reallyName;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
