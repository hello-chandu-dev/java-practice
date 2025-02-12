package org.example.practice;

import java.util.*;

public class PhoneBook {
    private static Map<String, List<String>> contactsMap = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to phonebook creation, please enter the number of contacts you want to add");
        // reading user input in the form of an integer
        int inputCount = sc.nextInt();
        System.out.println("please add: "+inputCount + " contacts in the comma separated format: eg., abc,123434343");
        for(int i=0;i< inputCount;i++){
            // reading user input in the form of an string
            String st = sc.next();
            // praveen,9703010665
            String[] split = st.split(",");
            String name = null;
            // reading the user input and storing it in the map
            for(int j=0; j< split.length;j++){
                if(j==0){
                    name = split[0];
                    continue;
                }
                addContact(name , split[j]);
            }
        }
        System.out.println("Thanks for using phonebook. Below are the contacts you have saved!! "+ contactsMap);

        System.out.println("You successfully added: "+contactsMap.size()+" contacts, now enter the name of the contact you want to search for:");
        String searchInput = sc.next();
        if(contactsMap.containsKey(searchInput)){
            System.out.println("Here is the contact that you have request for :"+ searchInput+" -> "+contactsMap.get(searchInput));
        }
        else{
            System.out.println("Sorry, the contact "+ searchInput+" you requested ,does not exist");
        }


//
//        addContact("praveen", "9703010665");
//        addContact("chandu", "7386192526");
//        addContact("vijaya", "8106512541");
//        addContact("praveen", "8919226737");
//        System.out.println(contactsMap);
//
//        System.out.println(contactsMap.get("praveen"));
    }

    private static void addContact(String name, String contact) {
        if(contactsMap.containsKey(name)){
            List<String> contacts = contactsMap.get(name);
            contacts.add(contact);
            contactsMap.put(name, contacts);
        }
        else{
            List<String> contacts  = new ArrayList<>();
            contacts.add(contact);
            contactsMap.put(name , contacts);
        }

    }

//    praveen,9703010665
//    praveen,8919226737
//    chandu,7386192526
}
