package com.project.service.ExampleGeneric;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/8/29 15:09
 * @Version 1.0
 */
public class Contact implements Info{
    private String address;
    private String telphone;
    private String zipcode;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Contact(String address, String telphone, String zipcode) {
        this.address = address;
        this.telphone = telphone;
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "联系方式{" +
                "地址='" + address + '\'' +
                ", 电话='" + telphone + '\'' +
                ", 邮编='" + zipcode + '\'' +
                '}';
    }
}