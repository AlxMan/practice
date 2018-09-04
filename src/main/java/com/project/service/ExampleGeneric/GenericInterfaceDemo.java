package com.project.service.ExampleGeneric;

import com.project.entify.ExampleGenericEntify.GenericInterface;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/8/29 14:03
 * @Version 1.0
 */
public class GenericInterfaceDemo<T> implements GenericInterface<T> {
    private T var;

    public GenericInterfaceDemo(T var){
        this.var=var;
    }

    public void setVar(T var) {
        this.var = var;
    }

    @Override
    public T getVar() {
        return this.var;
    }
}