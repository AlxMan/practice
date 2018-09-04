package com.project.Day01.ThreadPool;

/**
 * @Description 消费信息
 * @Author wangxianchao
 * @Date 2018/8/27 18:15
 * @Version 1.0
 */
public class Info {
    private String name = "苹果公司";
    private String content = "生产苹果手机";
    private boolean flag = false;
    public synchronized void set(String name,String content){
        if(!flag){
            try {
                super.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        this.setName(name);
        try {
            Thread.sleep(90);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setContent(content);
        flag=false;
        super.notify();
    }
    public synchronized void get(){
        if (flag){
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(90);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.getName()+"-->"+this.getContent());
        flag = true;
        super.notify();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Info{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}