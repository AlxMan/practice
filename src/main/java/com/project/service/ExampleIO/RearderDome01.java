package com.project.service.ExampleIO;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/8/31 14:45
 * @Version 1.0
 */
public class RearderDome01 {
    public static void main(String[] args) throws Exception{
        File file = new File("e:"+File.separator+"test.txt");
        Reader reader = new FileReader(file);
//        char c[] = new char[1024];//将内容读到char中
//        int len = reader.read(c);//将内容输出
//        reader.close();
////        System.out.println("内容："+new String(c,0,len));
//        System.out.println(c);
        //循环读取数据
        int len = 0;
        char c[] = new char[1024];//将内容读到char中
        int temp = 0;
        while ((temp = reader.read())!= -1){
            c[len] = (char)temp;
            len++;
        }
        reader.close();
        System.out.println("内容："+new String(c,0,len));
        System.out.println(c);
    }
}