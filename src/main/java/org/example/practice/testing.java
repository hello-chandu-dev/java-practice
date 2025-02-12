//package org.example.practice;
//
//
//import java.util.*;
//
//public class testing {
//    // {"a" : "1"}
//    // {"a": ["1", "2"]}
//    private static Map<String, ArrayList<String>> contactMaps = new HashMap<>();
////    private static  String name,contacts;
//
//    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
//        map.put("praveen", "9703010665");
////     contactBook.put("Sweety","9353900156");
////     contactBook.put("chandu","7386192526");
////        System.out.println(contactBook);
////Taking input from the user
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Welcome to create contacts book ");
//        // input reader from  user
//        int input = scanner.nextInt();
//        System.out.println("please enter " + "  " + input + "  " + "Sepated with space eg,nhb 78787");
//        // looping the input  from users
//        for (int i = 0; i < input; i++) {
//
//            String sc = scanner.next();
//            String[] split = sc.split(" ");
//            String name = null;
//            for (int j = 0; j < split.length; j++) {
//                if (j == 0) {
//                    name = split[0];
//                    continue;
//                }
//
////                addContacts(name, );
//                System.out.println("thanks for using the contact book");
//
//            }
//        }
//    }
//
//    private static void addContacts(String name, String number) {
//        ArrayList<String> numberList = new ArrayList<>();
//        numberList.add(number);
//        contactMaps.put(name, numberList); // Directly put the list of numbers
//    }
//}
//
 package org.example.practice;


import java.util.*;


public class testing {

    private static Map<String, List<String>> map = new HashMap<>();

//    private static String name, contacts;


    public static void main(String[] args) {

//        Map<String, String> map = new HashMap<>();
//        map.put("praveen", "9703010665");

// contactBook.put("Sweety","9353900156");
// contactBook.put("chandu","7386192526");
// System.out.println(contactBook);
//Taking input from the user

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to create conctacts book ");
// input reader from user
        int input = scanner.nextInt();
        System.out.println("please enter " + " " + input + " " + "Sepated with space eg,nhb 78787");
// looping the input from users
        for (int i = 0; i < input; i++) {
            String sc = scanner.next();
            String[] split = sc.split(",");
            String name = null;
            for (int j = 0; j < split.length; j++) {
                if (j == 0) {
                    name = split[0];
                    continue;
                }
                String contact = split[j];
                addContact(name, contact);
                System.out.println("thanks for using the contact book");
            }
        }
        System.out.println(map);
    }

    private static void addContact (String name, String contact)
    {
        if (map.containsKey(name)) {
            List<String> contacts = new ArrayList<>();
            contacts.add(contact);
            map.put(name, contacts);
        } else {
            List<String> contacts = new ArrayList<>();
            contacts.add(contact);
            map.put(name, contacts);
        }
    }
}