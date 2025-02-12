package org.example.Interfaces.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        int a[]={1,23,56,90,1,90,56,23,1,23,40};
        ArrayList<Integer> am=new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            am.add(a[i]);
        }
        HashMap<Integer,Integer> ah=new HashMap<>();
        // counting of occurrence number
        for (int i = 0; i < am.size(); i++) {
            ah.putIfAbsent(am.get(i), Collections.frequency(am,am.get(i)));
        }
        System.out.println(ah);
        //        HashMap<String,Integer> map=new HashMap<>();
//        map.put("vishnu",30);
//        map.put("sakhi",60);
//        map.put("vishalakshi",10);
//        for (Map.Entry<String, Integer> e : map.entrySet())
//
//            System.out.println(e.getKey() + " "
//                    + e.getValue());


    }
}
