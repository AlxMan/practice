package com.project.Day01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/8/27 9:43
 * @Version 1.0
 */
public class HelloWorld {
    public static void main(String[] args) {
      Person person = new Person();
        System.out.println(person);

      Person wowen = new Wowen();
      wowen.eat();
      ((Wowen) wowen).eat("西红柿");
        System.out.println("-----------------------------------------------");


        List<String> list = new ArrayList<String>();
        list.add("ABC");
        list.add("123");
        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        for (String str:list) {
            System.out.println(str);
        }
        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
            System.out.println(string);
		}
}
}