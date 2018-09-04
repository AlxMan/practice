package com.project.service.ExampleIO;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/9/3 17:33
 * @Version 1.0
 */
public class Receive implements Runnable{
    private PipedInputStream pip=null;
    public Receive (){
        this.pip= new PipedInputStream();
    }
    @Override
    public void run() {
        byte b[]=new byte[1024];
        int len = 0;
        try {
            len = this.pip.read(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            this.pip.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("接收内容："+new String(b,0,len));
    }
    public PipedInputStream getPip(){
        return pip;
    }
}