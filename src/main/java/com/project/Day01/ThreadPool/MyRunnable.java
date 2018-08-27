package com.project.Day01.ThreadPool;

/**
 * @Description 定义Runnable接口
 * @Author wangxianchao
 * @Date 2018/8/27 14:28
 * @Version 1.0
 */
public class MyRunnable implements Runnable{
    int index;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    public MyRunnable(int index){
        this.index=index;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+index);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}