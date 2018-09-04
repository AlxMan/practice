package com.project.service.ExampleIO;

import java.io.*;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/9/3 16:17
 * @Version 1.0
 */
public class outputStreamWriterDome {
    public static void main(String[] args) throws Exception {
        File file = new File("e:" + File.separator + "test.txt");
        Writer writer = new OutputStreamWriter(new FileOutputStream(file,true));
        writer.write("alalei1");
        writer.close();
        }
}