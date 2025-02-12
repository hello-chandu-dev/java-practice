package org.example.practice;

import java.util.*;

public class PhoneContacts {
    private static Map<String, ArrayList<String>> contactsMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to create contacts book");

        System.out.println("Enter the number of contacts: ");
        int inputCount = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter contact name and number(s) separated by space (e.g., John 1234567890,9876543210): ");
        for (int i = 0; i < inputCount; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String name = parts[0];
            ArrayList<String> numbers = new ArrayList<>();

            // Handle multiple numbers
            for (int j = 1; j < parts.length; j++) {
                String[] numParts = parts[j].split(",");  // Split by comma for multiple numbers
                for (String num : numParts) {
                    numbers.add(num);
                }
            }

            addContact(name, numbers);
        }

        System.out.println("Thanks for using the contact book. Here are your contacts:");
        System.out.println(contactsMap);

        scanner.close(); // Close the scanner to release resources.
    }

    private static void addContact(String name, ArrayList<String> numbers) {
        contactsMap.put(name, numbers); // Directly put the list of numbers
    }
}