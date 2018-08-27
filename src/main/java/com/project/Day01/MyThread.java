package com.project.Day01;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/8/27 9:34
 * @Version 1.0
 */
public class MyThread extends Thread{
    @Override
    public void run() {
       for (int i=0;i<10;i++){
           System.out.println(Thread.currentThread().getName()+"run"+i);
       }
    }

    public static void main(String[] args) {
        for (int i=0;i<3;i++){
            new MyThread().start();
        }
    }
}