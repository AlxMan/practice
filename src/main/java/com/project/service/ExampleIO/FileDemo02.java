package com.project.service.ExampleIO;

import java.io.File;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/8/29 17:11
 * @Version 1.0
 */
public class FileDemo02 {
    public static void main(String[] args) {
        File file = new File("e:"+File.separator+"test");
        if (file.isDirectory()){
            System.out.println(file.getPath()+"是路径");
        }else {
            System.out.println(file.getPath()+"不是路径");
        }
        File files[] = file.listFiles();
        for (int i=0;i<files.length;i++){
            System.out.println(files[i]);
        }
    }
}