package com.project.service.ExampleIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/9/3 17:50
 * @Version 1.0
 */
public class PrintDome01 {
    public static void main(String[] args) throws Exception{
        PrintStream stream = new PrintStream(new FileOutputStream(new File("e:"+File.separator+"test.txt")));
        String name = "刘德华";
        int age = 50;
        float score= 99.99f;
        char sex = 'M';
        stream.printf("姓名：%s；年龄：%d；成绩：%f；性别：%c",name,age,score,sex);
        stream.close();
    }
}