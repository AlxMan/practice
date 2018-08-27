package com.project.Day01;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/8/27 9:44
 * @Version 1.0
 */
public class Wowen extends Person {
    @Override
    public void eat() {
        System.out.println("面条");
    }


    public void eat(String  foot) {
        System.out.println(foot);
    }
}