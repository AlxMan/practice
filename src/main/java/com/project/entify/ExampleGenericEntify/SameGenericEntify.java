package com.project.entify.ExampleGenericEntify;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/8/29 13:42
 * @Version 1.0
 */
public class SameGenericEntify <k,v>{
    private k key;
    private v value;

    public k getKey() {
        return key;
    }

    public void setKey(k key) {
        this.key = key;
    }

    public v getValue() {
        return value;
    }

    public void setValue(v value) {
        this.value = value;
    }
}