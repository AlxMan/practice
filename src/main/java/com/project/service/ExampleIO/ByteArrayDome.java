package com.project.service.ExampleIO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/9/3 16:36
 * @Version 1.0
 */
public class ByteArrayDome {
    public static void main(String[] args) {
        String string = "HELLOWORLD!";
        ByteArrayInputStream bis = new ByteArrayInputStream(string.getBytes());
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int temp = 0;
        while ((temp = bis.read())!= -1){
            char c = (char) temp;//将读取的数字变为数组
            bos.write(Character.toLowerCase(c));//将字符串变为小写
        }
        String newStr = bos.toString();
        try {
            bis.close();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(newStr);
    }
}