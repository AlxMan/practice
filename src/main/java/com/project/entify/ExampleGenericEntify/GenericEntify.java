package com.project.entify.ExampleGenericEntify;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/8/29 10:39
 * @Version 1.0
 */
public class GenericEntify<T> {
    private T var;
//    public GenericEntify(T var){
//        this.var=var;
//    }
    public void setVar(T var){
        this.var=var;
    }
    public T getVar(){
        return var;
    }

//    public <T> T fun(T t){
//        return t;
//    }
    @Override
    public String toString() {
        return this.var.toString();
    }
}