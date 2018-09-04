package com.project.service.ExampleIO;

import java.io.*;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/9/3 16:28
 * @Version 1.0
 */
public class inputStreamWriterDome {
    public static void main(String[] args) throws Exception{
        File file = new File("e:"+File.separator+"test1.txt");
        Reader reader = new InputStreamReader(new FileInputStream(file));
        char c[]=new char[1024];
        int len = reader.read(c);
        reader.close();
        System.out.println(new String(c,0,len));
    }
}