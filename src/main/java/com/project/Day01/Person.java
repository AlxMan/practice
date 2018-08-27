package com.project.Day01;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/8/27 9:43
 * @Version 1.0
 */
public class Person {
    private String name;
    private int age;
    public Person(){

    }
    public Person(String name){
        super();
        this.name = name;
    }
    public Person(String name , int age){
        super();
        this.name=name;
        this.age=age;
    }
    public void eat(){
        System.out.println("大米");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}