package com.project.service.ExampleGeneric;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/8/29 15:12
 * @Version 1.0
 */
public class Introduction implements Info{
    private String name;
    private String sex;
    private int age;

    public Introduction(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "基本信息{" +
                "姓名='" + name + '\'' +
                ", 性别='" + sex + '\'' +
                ", 年龄=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}