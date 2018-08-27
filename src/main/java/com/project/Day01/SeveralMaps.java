package com.project.Day01;

import java.util.*;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/8/27 9:44
 * @Version 1.0
 */
public class SeveralMaps {
    public static void main(String[] args) {
        Map<String,String> hasmap = new HashMap<String ,String>();
        hasmap.put("1","a");
        hasmap.put("2","b");
        hasmap.put("3","c");
        hasmap.put("4","d");
        System.out.println(hasmap.keySet());
        System.out.println(hasmap.values());
        for (Map.Entry<String,String> hasmp:hasmap.entrySet()) {
            System.out.println(hasmp.getKey()+"--"+hasmp.getValue());
        }

        Map<String,String> treeMap = new TreeMap<String, String>();
        treeMap.put("a6", "6");
        treeMap.put("b1", "1");
        treeMap.put("2", "2");
        treeMap.put("5", "5");
        treeMap.put("3", "3");
        treeMap.put("4", "4");
        System.out.println(treeMap.keySet());
        System.out.println(treeMap.values());
        for (Map.Entry<String ,String > tree:treeMap.entrySet()
             ) {
            System.out.println(tree.getKey()+"--"+tree.getValue());
        }

        Map<String,String> linkedHashMap = new LinkedHashMap<String, String>();
        linkedHashMap.put("6a", "6");
        linkedHashMap.put("b1", "1");
        linkedHashMap.put("2", "2");
        linkedHashMap.put("5", "5");
        linkedHashMap.put("3", "3");
        linkedHashMap.put("4", "4");
        System.out.println(linkedHashMap.keySet());
        System.out.println(linkedHashMap.values());
        for (Map.Entry<String,String> link:linkedHashMap.entrySet()
             ) {
            System.out.println(link.getKey()+"--"+link.getValue());
        }
    }
}