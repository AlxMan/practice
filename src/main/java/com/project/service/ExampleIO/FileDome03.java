package com.project.service.ExampleIO;

import java.io.File;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/8/29 17:30
 * @Version 1.0
 */
public class FileDome03 {
    public static void main(String[] args) {
        File my = new File("e:"+File.separator);
        print(my);
    }
    public static void print(File file){
        if (file!=null){
            if (file.isDirectory()){
                File file1[] = file.listFiles();
                if (file1!=null){
                    for (int i=0;i<file1.length;i++){
                        print(file1[i]);
                    }
                }
            }else {
                System.out.println(file.getPath());
            }
        }
    }
}