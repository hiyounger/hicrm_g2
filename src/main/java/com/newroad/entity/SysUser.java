package com.newroad.entity;

import java.util.Date;

public class SysUser {
    private Integer id;

    private String username;

    private String password;

    private Date createtime;

    private String email;

    private String phone;

    private String salt;

    private Integer sortnum;

    private Integer status;

    private Date updatetime;

    private String usernote;

    private Integer createby;

    private Integer updateby;

    public SysUser(Integer id, String username, String password, Date createtime, String email, String phone, String salt, Integer sortnum, Integer status, Date updatetime, String usernote, Integer createby, Integer updateby) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.createtime = createtime;
        this.email = email;
        this.phone = phone;
        this.salt = salt;
        this.sortnum = sortnum;
        this.status = status;
        this.updatetime = updatetime;
        this.usernote = usernote;
        this.createby = createby;
        this.updateby = updateby;
    }

    public SysUser() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Integer getSortnum() {
        return sortnum;
    }

    public void setSortnum(Integer sortnum) {
        this.sortnum = sortnum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUsernote() {
        return usernote;
    }

    public void setUsernote(String usernote) {
        this.usernote = usernote == null ? null : usernote.trim();
    }

    public Integer getCreateby() {
        return createby;
    }

    public void setCreateby(Integer createby) {
        this.createby = createby;
    }

    public Integer getUpdateby() {
        return updateby;
    }

    public void setUpdateby(Integer updateby) {
        this.updateby = updateby;
    }
}