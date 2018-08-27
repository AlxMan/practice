package com.project.Day01;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/8/27 13:11
 * @Version 1.0
 */
public class MapDome {
    public static void main(String[] args) {
        String string = "2342asfghgyu56asdasda";
        Map<String,Integer> hasMap = new HashMap<String,Integer>();
        for (int i=0;i<string.length();i++){
            String key = String.valueOf(string.charAt(i));
            if (!hasMap.containsKey(key)){
                hasMap.put(key,1);
            }else{
                int val = hasMap.get(key);
                hasMap.put(key,val+1);
            }
        }
        for (Map.Entry<String,Integer> echomap:hasMap.entrySet()
             ) {
            System.out.println(echomap.getKey()+"--"+echomap.getValue());
        }
    }
}