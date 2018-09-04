package com.project.Day01;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/9/4 11:29
 * @Version 1.0
 */
public class TimerTest04 {
    public static void main(String[] args) {
        Timer t = new Timer();

        t.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName() +"11111!"+ this.scheduledExecutionTime());
                    Thread.sleep(4*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, 0, 3* 1000);

//		t.schedule(new TimerTask() {
//			public void run() {
//				try {
//					  System.out.println("22222!"+ this.scheduledExecutionTime());
//					Thread.sleep(4*1000);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		}, 0l, 3* 1000);

        System.out.println(Thread.currentThread().getName()+"  main");
    }
}