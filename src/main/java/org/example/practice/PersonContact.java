package org.example.practice;

import java.security.Key;
import java.util.*;

public class PersonContact {
    static Map<String, List<String>> conctactsMap = new HashMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to conctactbook");
        int input = sc.nextInt();
        System.out.println("please add :" + "  " + "add contacts for eg:abc,656453764");
        String name = null;
        for (int i = 0; i < input; i++) {
            String st = sc.next();
            String[] split = st.split(",");
            for (int j = 0; j < split.length; j++) {
                if (j == 0) {
                    name = split[0];
                    continue;
                }
                addContact(name, split[j]);

            }
        }

        System.out.println("thanks for using phone book" + "  " + conctactsMap);
        System.out.println("You successfully added: "+conctactsMap.size()+" contacts");


    }

    private static void addContact(String name, String contact) {
        if (conctactsMap.containsKey(name)) {
            List<String> contacts = conctactsMap.get(name);
            contacts.add(contact);
            conctactsMap.put(name, contacts);


        } else {
            List<String> contacts = new ArrayList<>();
            contacts.add(contact);
            conctactsMap.put(name, contacts);

        }

    }
}

