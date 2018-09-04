package com.project.service.ExampleGeneric;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/8/29 15:31
 * @Version 1.0
 */
public class Person <T extends Info>{
    private T info;

    public Person(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return this.info.toString();
    }
}