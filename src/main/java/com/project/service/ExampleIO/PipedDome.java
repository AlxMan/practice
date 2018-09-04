package com.project.service.ExampleIO;

import java.io.IOException;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/9/3 17:38
 * @Version 1.0
 */
public class PipedDome {
    public static void main(String[] args) {
        Send send = new Send();
        Receive receive = new Receive();
        try {
            send.getPos().connect(receive.getPip());//连接通道
        } catch (IOException e) {
            e.printStackTrace();
        }
        new Thread(send).start();
        new Thread(receive).start();
    }
}