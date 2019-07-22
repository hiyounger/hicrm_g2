package com.newroad.entity;

import java.util.Date;

public class Function {
    private Integer id;

    private String funccode;

    private String funcname;

    private String funcnote;

    private Integer functype;

    private String funcurl;

    private String iconclass;

    private String iconurl;

    private Integer parentid;

    private Integer createby;

    private Integer updateby;

    private Integer sortnum;

    private Date updatetime;

    private Date createtime;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFunccode() {
        return funccode;
    }

    public void setFunccode(String funccode) {
        this.funccode = funccode == null ? null : funccode.trim();
    }

    public String getFuncname() {
        return funcname;
    }

    public void setFuncname(String funcname) {
        this.funcname = funcname == null ? null : funcname.trim();
    }

    public String getFuncnote() {
        return funcnote;
    }

    public void setFuncnote(String funcnote) {
        this.funcnote = funcnote == null ? null : funcnote.trim();
    }

    public Integer getFunctype() {
        return functype;
    }

    public void setFunctype(Integer functype) {
        this.functype = functype;
    }

    public String getFuncurl() {
        return funcurl;
    }

    public void setFuncurl(String funcurl) {
        this.funcurl = funcurl == null ? null : funcurl.trim();
    }

    public String getIconclass() {
        return iconclass;
    }

    public void setIconclass(String iconclass) {
        this.iconclass = iconclass == null ? null : iconclass.trim();
    }

    public String getIconurl() {
        return iconurl;
    }

    public void setIconurl(String iconurl) {
        this.iconurl = iconurl == null ? null : iconurl.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
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

    public Integer getSortnum() {
        return sortnum;
    }

    public void setSortnum(Integer sortnum) {
        this.sortnum = sortnum;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}