package com.project.Day01.ThreadPool;

/**
 * @Description 消费者
 * @Author wangxianchao
 * @Date 2018/8/27 18:16
 * @Version 1.0
 */
public class Consumer implements Runnable{
    private Info info = null;

    public Consumer(Info info) {
        this.info = info;
    }

    @Override
    public void run() {
        for (int i=0;i<50;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.info.get();
        }

    }
}