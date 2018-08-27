package com.project.Day01.ThreadPool;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description 创建一个可缓存线程池
 * @Author wangxianchao
 * @Date 2018/8/27 13:52
 * @Version 1.0
 */
public class ThreadPoolExecutorTest {
    public static void main(String[] args) {
        ExecutorService cachedThreadPool  = Executors.newCachedThreadPool();
        for (int i=0;i<10;i++){
            final int index = i;
            try {
                Thread.sleep(index*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cachedThreadPool .execute(new MyRunnable(index));
        }
    }
}