package com.project.Day02;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/9/4 16:09
 * @Version 1.0
 */
public class TestUser {
    private String uid;
    private String loginName;
    private String passWord;

    @Override
    public String toString() {
        return "TestUser{" +
                "uid='" + uid + '\'' +
                ", loginName='" + loginName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}