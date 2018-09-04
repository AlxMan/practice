package com.project.Day01;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @Description 指定多久之后执行此任务，注意：只会执行一次
 * @Author wangxianchao
 * @Date 2018/9/4 10:12
 * @Version 1.0
 */
public class TimerTest01 {
    Timer timer ;
    class timerTaskTest extends TimerTask{

        @Override
        public void run() {
            System.out.println("time up!");
        }
    }

    public TimerTest01(int time) {
        timer  = new Timer();
        timer.schedule(new timerTaskTest(),time * 1000);//timer.schedule(执行的方法，延迟多久执行(ms)
    }

    public static void main(String[] args) {
        System.out.println("time begin...");
        new TimerTest01(10);
    }
}