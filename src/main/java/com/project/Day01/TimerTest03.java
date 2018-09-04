package com.project.Day01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/9/4 10:36
 * @Version 1.0
 */
public class TimerTest03 {
    public TimerTest03(){
        Timer timer = new Timer();
        timer.schedule(new TimerTestTask03(),1000,5000);//(执行的方法,延迟时间,多久执行一次)
    }
    class TimerTestTask03 extends TimerTask{
        @Override
        public void run() {
            System.out.println("本次任务执行时间"+new Date());
        }
    }

    public static void main(String[] args) {
        new TimerTest03();
    }
}