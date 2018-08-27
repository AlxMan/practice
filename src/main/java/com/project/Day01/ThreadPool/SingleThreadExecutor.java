package com.project.Day01.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description 创建一个单线程化的Executor
 * @Author wangxianchao
 * @Date 2018/8/27 15:03
 * @Version 1.0
 */
public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i=0;i<10;i++){
            final int index=i;
            singleThreadExecutor.execute(new MyRunnable(index));
        }
    }
}