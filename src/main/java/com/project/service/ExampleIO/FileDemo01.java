package com.project.service.ExampleIO;

import java.io.File;
import java.io.IOException;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/8/29 16:55
 * @Version 1.0
 */
public class FileDemo01 {
    public static void main(String[] args) {
        File filemkdir = new File("e:"+File.separator+"test");
        if (filemkdir.exists()){
            filemkdir.delete();
        }else{
            filemkdir.mkdir();
        }
        File file =new File("e:"+File.separator+"test"+File.separator+"test.txt");
        if (file.exists()) {
            file.delete();
        }else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
//        System.out.println(File.pathSeparator+File.separator);
        }
    }
}