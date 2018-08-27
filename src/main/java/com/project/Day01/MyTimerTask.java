package com.project.Day01;

import java.util.TimerTask;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/8/27 9:35
 * @Version 1.0
 */
public class MyTimerTask extends TimerTask {
    private String name;

    public MyTimerTask(String name){
        super();
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+name+"do timer");
    }
}