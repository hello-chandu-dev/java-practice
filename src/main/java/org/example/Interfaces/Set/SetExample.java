package org.example.Interfaces.Set;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String>st1=new LinkedHashSet<>();
        st1.add("welcome");
        st1.add("to");
        st1.add("java");
        st1.retainAll(st1);
        System.out.println(st1);
        Set<String>st2=new TreeSet<String>();
        st2.add("hello");
        st2.add("world");
        st1.addAll(st2);
        System.out.println(st1);

//        Integer[]A={10,20,30,40,50,60,70};
//        Integer[]B={10,30,45,34,23,56};
//        Set<Integer>set1=new HashSet<Integer>();
//        set1.addAll(Arrays.asList(A));
//        Set<Integer>set2=new HashSet<>();
//        set2.addAll(Arrays.asList(B));
//        Set<Integer> union_data = new HashSet<Integer>(set1);
//        union_data.addAll(set2);
//        System.out.println("Union of set1 and set2 is:");
//        System.out.println(union_data);

//        Set<String>data=new LinkedHashSet<String>();
//         data.add("Java");
//         data.add("set");
//            data.add("example");
//            data.add("set");
//            data.add("data");
//        System.out.println(data);

    }
}
