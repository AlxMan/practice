package com.project.service.ExampleIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/8/29 18:29
 * @Version 1.0
 */
public class outputStreamDome {
    public static void main(String[] args) throws Exception{
        File file = new File("e:"+File.separator+"test.txt");
        OutputStream outputStream = new FileOutputStream(file,true);
        String string = "\n Hello word!!!";
        byte b[] = string.getBytes();
        outputStream.write(b);
        outputStream.close();
    }
}