package com.cskaoyan.bean;

import lombok.Data;

import java.util.List;

@Data
public class DataBean {

    /**
     * roles : ["超级管理员"]
     * name : admin123
     * perms : ["*"]
     * avatar : https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif
     */
    private List<String> roles;
    private String name;
    private List<String> perms;
    private String avatar;
}
