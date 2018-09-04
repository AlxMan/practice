package com.project.service.ExampleIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/9/3 17:46
 * @Version 1.0
 */
public class PrintDome {
    public static void main(String[] args) throws Exception{
        PrintStream stream = new PrintStream(new FileOutputStream(new File("e:"+File.separator+"test.txt")));
        stream.print("hello");
        stream.println("world!");
        stream.print("1+1="+2);
        stream.close();
    }
}