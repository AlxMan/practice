package com.project.Day01;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/8/27 9:34
 * @Version 1.0
 */
public class MyRunable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"run");
    }

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            new Thread(new MyRunable()).start();
        }
    }
}