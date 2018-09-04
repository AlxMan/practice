package com.project.service.ExampleIO;

import java.io.*;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/8/31 15:22
 * @Version 1.0
 */
public class CopyFileDome {
    public static void main(String[] args) {
        CopyFileDome copyFileDome =new CopyFileDome();
        copyFileDome.fun("e:\\test.txt","e:\\test1.txt");
    }
    public static void fun(String str1,String str2){
        if(str1==null||str2==null){
            System.out.println("输入的参数不正确");
            System.out.println("例如路径1  copy  路径2");
            System.exit(1);
        }
        File file1=new File(str1);
        File file2=new File(str2);
        if (!file1.exists()){
            System.out.println("源文件不存在！");
            System.exit(1);
        }
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(file1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            outputStream = new FileOutputStream(file2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (inputStream !=null && outputStream!=null){
            int temp = 0;
            try {
                while ((temp = inputStream.read()) != -1) {//开始复制
                    outputStream.write(temp);
                }
                System.out.println("复制完成！");
            }catch (IOException e){
                e.printStackTrace();
            }
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}