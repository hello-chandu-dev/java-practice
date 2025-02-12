package org.example.Interfaces.Set;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String,Integer> maps=new HashMap<>();
        maps.put("one",1);
        maps.put("two",2);
        maps.put("five",5);
        maps.put("four",4);
        maps.put("three",3);
        System.out.println(maps);

        Map<String,Integer> mp=new HashMap<>();
        mp.put("Twenty",20);
        mp.put("ten",10);
        mp.put("fifty",50);
        maps.putAll(mp);
        System.out.println(maps);
        System.out.println(maps.entrySet());

        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("a",10);
        hm.put("b",30);

        hm.merge("c",45,(oldValue,newValue)->oldValue+newValue);
        hm.merge("a",15,(oldValue,newValue)->oldValue+newValue);
        System.out.println(hm);

//        Map<String,Integer> map=new HashMap<>();
//        map.put("rani",80);
//        map.put("raju",65);
//        map.put("mahesh",90);
//        map.put("pandu",45);
//        map.put("abhi",56);
//        System.out.println(map.keySet());
//        for(String names: map.keySet())
//        System.out.println(names+" : "+map.get(names));



    }
}
