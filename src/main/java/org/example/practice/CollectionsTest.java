package org.example.practice;

import java.util.*;

public class CollectionsTest {

    public static void main(String[] args){
        // LIST - indexed collection - dynamic array
            // Insertion order is preserved
        // contains duplicates
        List<String> namesList = new ArrayList();
        namesList.add("abc");
        namesList.add("xyz");
        namesList.add("pqr");

        for(String name: namesList){
//            if(name.endsWith("z") || name.startsWith("a")){
//                System.out.println(name);
//            }
            System.out.println(name);
        }

        namesList.add(1, "asd");
        System.out.println(namesList);
        namesList.set(1 , "uno");
        System.out.println(namesList);
        System.out.println(namesList.remove("uno"));
        System.out.println(namesList);

        // SET - non-indexed collection  -Hash table
            // insertion order not preserved
        //  set will not allow duplicates
        System.out.println("====== SET ========");
        Set<String> namesSet = new HashSet<>();
        System.out.println(namesSet.add("aaa"));
        namesSet.add("bbb");
        namesSet.add("ccc");
        namesSet.add("aaa");
        namesSet.remove("bbb");
        System.out.println(namesSet);

        System.out.println(namesSet.contains("aaa"));
        System.out.println(namesSet.contains("bbb"));

    // MAP - Key , Value pair - Hybrid collection
        // eg., to store Phone numbers
        // insertion order is not preserved
        // indexes not present
        System.out.println("===== MAP ======");
        Map<String, String> phoneNumbersMap = new HashMap<>();
        phoneNumbersMap.put("praveen", "9703010665");
        phoneNumbersMap.put("chandu", "7386192526");
//        phoneNumbersMap.put("praveen", "8919226737");
        System.out.println(phoneNumbersMap);
        String phoneNumber = phoneNumbersMap.get("praveen");
        System.out.println(phoneNumber);
        System.out.println(phoneNumbersMap.containsKey("asasd"));
        System.out.println(phoneNumbersMap.containsValue("9703010665"));
        System.out.println(phoneNumbersMap.keySet());
        System.out.println(phoneNumbersMap.values());

    }
}
