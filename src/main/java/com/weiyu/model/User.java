package com.weiyu.model;

/**
 *
 * @author zhouyulong
 * @date 2018/10/6 下午9:39
 */
public class User {
    private Integer id;
    private String nickname;
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
