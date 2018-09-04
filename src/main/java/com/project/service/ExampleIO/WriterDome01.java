package com.project.service.ExampleIO;

import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.Writer;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/8/31 10:06
 * @Version 1.0
 */
public class WriterDome01 {
    public static void main(String[] args) throws Exception{
        File file = new File("e:"+File.separator+"test.txt");
        Writer writer = new FileWriter(file,true);
        String string = "刘德华";
        writer.write(string);
//        writer.flush();//强制清除缓存
        writer.close();
    }
}