package com.project.service.ExampleIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/8/30 11:24
 * @Version 1.0
 */
public class InputStreamDome {
//    public static void main(String[] args) throws Exception{
//        File file = new File("e:"+File.separator+"test.txt");
//        InputStream inputStream = new FileInputStream(file);
//        byte b[]= new byte[(int)file.length()];//所有数据读到此数组中
//        inputStream.read(b);
//        System.out.println("内容："+new String(b));
//        inputStream.close();
//    }
    //read()循环读取
//    public static void main(String[] args) throws Exception{
//        File file=new File("e:"+File.separator+"test.txt");
//        InputStream inputStream=new FileInputStream(file);
//        byte b[] = new byte[(int)file.length()];
//        for (int i=0;i<b.length;i++){
//            b[i]=(byte) inputStream.read();
//        }
//        System.out.println("内容："+new String(b));
//        inputStream.close();
//}
    //判断是否读到文件尾
    public static void main(String[] args) throws Exception{
        File file = new File("e:"+File.separator+"test.txt");
        InputStream inputStream = new FileInputStream(file);
        int len = 0;//用于记录读取的个数
        byte b[] = new byte[(int)file.length()];
        int temp = 0;//读取的每一个内容
        while((temp=inputStream.read())!=-1){//将每次读取的内容给temp，如果temp的值不是-1表示文件没有读完
            b[len] = (byte)temp;
            len++;
        }
        inputStream.close();
        System.out.println("内容："+new String(b,0,len));
    }
}