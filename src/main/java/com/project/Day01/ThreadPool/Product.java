package com.project.Day01.ThreadPool;

/**
 * @Description 生产者
 * @Author wangxianchao
 * @Date 2018/8/27 18:16
 * @Version 1.0
 */
public class Product implements Runnable{
    private Info info=null;
    public Product (Info info){
        this.info=info;
    }
    @Override
    public void run() {
        boolean falg = false;
        for (int i=0;i<50;i++){
            if (falg){
                this.info.set("小米公司","小米not手机");
                falg=false;
            }else{
                this.info.set("联想公司","thinkpad电脑");
                falg=true;
            }
        }
    }
}