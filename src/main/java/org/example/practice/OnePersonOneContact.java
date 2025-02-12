package org.example.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OnePersonOneContact {
    public static void main(String[] args) {
        Map<String,String> contactBook=new HashMap<>();
        contactBook.put("praveen","9703010665");
        contactBook.put("chandana","9708010667");
        contactBook.put("mahendra","8703010665");
        contactBook.put("vijaya","8003010685");
        contactBook.put("raja","8703070664");
        contactBook.put("rani","7703010885");

        Set<Map.Entry<String, String>> entries = contactBook.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String name= entry.getKey();
            if(name.startsWith("a"))
            System.out.println(entry.getKey() + " --> " + entry.getValue());

        }

//       System.out.println(contactBook);
//        for (String name: contactBook.keySet()) {
//            System.out.println(contactBook.get(name));
//        }

    }
}
