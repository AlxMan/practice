package com.project.Day01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Description 在指定的时间执行任务
 * @Author wangxianchao
 * @Date 2018/9/4 10:18
 * @Version 1.0
 */
public class TimerTest02 {
    Timer timer;
    class TimerTaskTest02 extends TimerTask{

        @Override
        public void run() {
            System.out.println("指定时间的线程任务");
        }
    }
    //设置执行时间
    public Date getTime(){
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        System.out.println(simpleDateFormat.format(new Date()));
        Calendar calendar = Calendar.getInstance();//初始化calendar
//        calendar.setTime(new Date());
        calendar.set(calendar.HOUR,10);
        calendar.set(Calendar.MINUTE,35);
        calendar.set(Calendar.SECOND,00);
        Date time = calendar.getTime();
        return time;
    }

    public TimerTest02() {
        Date time = getTime();
        System.out.println("指定的时间是："+time);
        timer=new Timer();
        timer.schedule(new TimerTaskTest02(),time);//timer.schedule(执行的方法，要执行的时间)
    }

    public static void main(String[] args) {
        new TimerTest02();
    }
}