package com.project.Day01.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description 创建一个指定工作线程
 * @Author wangxianchao
 * @Date 2018/8/27 14:43
 * @Version 1.0
 */
public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService fixedThreadPoll = Executors.newFixedThreadPool(3);
        for (int i=0;i<10;i++){
            final int index = i;
            fixedThreadPoll.execute(new MyRunnable(index));
        }
    }
}