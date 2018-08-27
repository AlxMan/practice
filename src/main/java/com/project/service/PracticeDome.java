package com.project.service;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.*;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/8/7 15:32
 * @Version 1.0
 */

public class PracticeDome {
    /*
    　* @Description: 判断输入的是否是闰年
    　* @user wangxianchao
    　* @date 2018/8/7 15:47
    */
    @Test
    public void ifRn() {
        long year=2005;
            if(year%4==0&&year%100!=0||year%400==0){
                System.out.print(year+"是闰年！");
            }else {
                System.out.print(year+"不是闰年！");
            }
    }
    /* @Description: 打印杨辉三角
    　* @user wangxianchao
    　* @date 2018/8/7 16:06
    */
    @Test
    public void YanghuiSanjiao(){
        int sanjiao[][]=new int[10][];//创建二维数组
        for (int i=0;i<sanjiao.length;i++){//遍历第一层
            sanjiao[i]=new int[i+1];//初始化第二层数组的大小
                for (int j=0;j<=i;j++){//遍历第二层数组
                    if (i==0||j==0||j==i){
                        sanjiao[i][j]=1;//将两侧元素赋值1
                    }else {
                        sanjiao[i][j]=sanjiao[i-1][j]+sanjiao[i-1][j-1];
                    }
                    System.out.print(sanjiao[i][j]+"\t");
            }
            System.out.println();
        }
    }
    /* @Description: 九九乘法表
    　* @user wangxianchao
    　* @date 2018/8/7 16:25
    */
    @Test
    public void chengfabiao(){
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
    /*
    　* @Description:  输出空心棱角
    　* @user wangxianchao
    　* @date 2018/8/7 16:32 
    */
    @Test
    public void kongxinlengjiao(){
        int size = 7;
        if(size%2==0){//计算棱形大小
            size++;
        }
        for (int i=0;i<size/2+1;i++){
            for (int j=size/2+1;j>i+1;j--){
                System.out.print(" ");//输出左上角位置的空白
            }
            for (int j=0;j<2*i+1;j++){
                if (j==0||j==2*i){
                    System.out.print("*");//输出棱形上半部分边缘
                }else {
                    System.out.print(" ");//输出棱形上半部分空心
                }
            }
            System.out.println("");
        }
        for (int i=size/2+1;i<size;i++){
            for (int j=0;j<i-size/2;j++){
                System.out.print(" ");//输出棱形左下角空白
            }
            for (int j=0;j<2*size-1-2*i;j++){
                if (j==0||j==2*(size-i-1)){
                    System.out.print("*");//输出棱形下半部分边缘
                }else{
                    System.out.print(" ");//输出棱形下半部分空心
                }
            }
            System.out.println("");
        }
    }

    /*
    　* @Description: 反转字符串
    　* @user wangxianchao
    　* @date 2018/8/10 10:37 
    */

    public String reverse(String str){
        String string= new StringBuilder(str).reverse().toString();
        return string;
    }
    public static void main(String args[]){
        System.out.print(new PracticeDome().reverse("hello world!"));
    }
    /*
    　* @Description: 使用URL读取内容
    　* @user wangxianchao
    　* @date 2018/8/13 18:08 
    */
    @Test
    public void URLDemo() throws Exception{
        URL url = new URL("https","tieba.baidu.com",443,"/index.html");
        InputStream inputStream = url.openStream();
        Scanner scanner = new Scanner(inputStream);//实例化Scanner对象
        scanner.useDelimiter("\n");//设置读取分隔符
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
    /*
    　* @Description: 使用UrlConnection读取内容
    　* @user wangxianchao
    　* @date 2018/8/13 18:38 
    */
    @Test
    public void UrlConnectionDemo() throws Exception{
        URL url = new URL("https://www.baidu.com");
        URLConnection urlConnection = url.openConnection();//建立连接
        System.out.println("内容大小"+urlConnection.getContentLength());
        System.out.println("内容类型"+urlConnection.getContentType());
    }

    /*
    　* @Description: 编码与解码
    　* @user wangxianchao
    　* @date 2018/8/14 9:54
    */
    @Test
    public void CodeDemo() throws Exception{
        String keyword="liudehua 刘德华";
        String encode=URLEncoder.encode(keyword,"UTF-8");
        System.out.println("编码之后的内容"+encode);
        String decode=URLDecoder.decode(encode,"UTF-8");
        System.out.println("解码之后的内容"+decode);
    }

    /*
    　* @Description:
    　* @user wangxianchao第一个TCP程序
    　* @date 2018/8/14 14:27 
    */
    @Test
    public void HelloServer ()throws Exception{
        ServerSocket server = null;//定义ServerSocket对象
        Socket client = null;//定义Socket对象
        PrintStream out =null;//声明打印流对象
        server = new ServerSocket(8888);//在服务器8888端口等待客户访问
        System.out.println("服务器运行等待客户访问");
        client = server.accept();//程序阻塞，等等客户端连接
        String str = "Hello world!";
        out = new PrintStream(client.getOutputStream());//实例化打印流对象，输出信息
        out.print(str);//输出信息
        out.close();
        client.close();
        server.close();

    }
    /*
    　* @Description: 编写客户端信息
    　* @user wangxianchao
    　* @date 2018/8/14 14:42
    */
    @Test
    public void HelloClient()throws Exception{
        Socket client = null;
        client = new Socket("localhost",8888);
        BufferedReader buf = null;//声明bufferedreader对象接收信息
        buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String string = buf.readLine();//读取信息
        System.out.println("服务端输出内容"+string);
        client.close();
        buf.close();
    }

    /*
    　* @Description: 统计重复出现的字符或者数字
    　* @user wangxianchao
    　* @date 2018/8/15 16:15 
    */
    @Test
    public void chongfu(){
        String str ="2342asfghgyu56asdasda";
        Map<String,Integer> map = new HashMap<String, Integer>();
        for (int i = 0;i<str.length();i++){
            String key = String.valueOf((str.charAt(i)));
            if (!map.containsKey(key)){
                map.put(key,1);
            }else {
                int val = map.get(key);
                map.put(key,val+1);
            }
        }
        for (Map.Entry<String,Integer> integerMap : map.entrySet()){
            System.out.println(integerMap.getKey()+"---->"+integerMap.getValue());
        }
    }





}