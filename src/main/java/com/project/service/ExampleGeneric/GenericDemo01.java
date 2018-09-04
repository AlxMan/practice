package com.project.service.ExampleGeneric;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/8/29 16:00
 * @Version 1.0
 */
public class GenericDemo01 {
    public static void main(String[] args) {
        Person<Contact> person = new Person<Contact>(new Contact("北京市",
                "0108888888","000001"));
        System.out.println(person);
        Person<Introduction> person1=new Person<Introduction>(new Introduction("阿拉蕾",
                "女",18));
        System.out.println(person1);
    }
}