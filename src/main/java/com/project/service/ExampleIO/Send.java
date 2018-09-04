package com.project.service.ExampleIO;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/9/3 17:25
 * @Version 1.0
 */
public class Send implements Runnable{
    private PipedOutputStream pos= null;//管道输出流

    public Send() {
        this.pos = new PipedOutputStream();//实例化输出流
    }

    @Override
    public void run() {
        String string = "Hello word!";
        try {
            this.pos.write(string.getBytes());//输出信息
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            this.pos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //通线程类得到输出流
    public PipedOutputStream getPos(){
        return pos;
    }
}