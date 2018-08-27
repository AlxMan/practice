package com.project.Day01;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/8/27 9:35
 * @Version 1.0
 */
public class DateDemo {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(simpleDateFormat.format(new Date()));
        try {
            Date datenew = simpleDateFormat.parse("2018-08-28 15:30:30");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        // 或者用 Date 来初始化 Calendar 对象
        calendar.setTime(new Date());

        //System.out.println(str);
        // 显示年份
        int year = calendar.get(Calendar.YEAR);
        System.out.println("year is = " + String.valueOf(year));

        // 显示月份 (从0开始, 实际显示要加一)
        int month = calendar.get(Calendar.MONTH);
        System.out.println("nth is = " + (month + 1));

        //十天后
        calendar.add(Calendar.DAY_OF_YEAR, 10);
        int newday = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("new day is = " + newday);
        Date date_afer_10=  calendar.getTime();


    }
}