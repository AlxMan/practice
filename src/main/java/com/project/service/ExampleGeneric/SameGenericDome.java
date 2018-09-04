package com.project.service.ExampleGeneric;

import com.project.entify.ExampleGenericEntify.SameGenericEntify;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/8/29 13:45
 * @Version 1.0
 */
public class SameGenericDome {
    public static void main(String[] args) {
        SameGenericEntify <String,Integer> sameGenericEntify = new SameGenericEntify<String, Integer>();
        sameGenericEntify.setKey("阿拉蕾");
        sameGenericEntify.setValue(12);
        System.out.println("姓名："+sameGenericEntify.getKey());
        System.out.println("年龄:"+sameGenericEntify.getValue());
    }
}