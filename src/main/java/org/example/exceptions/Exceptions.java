package org.example.exceptions;

import java.util.ArrayList;
import java.util.List;

public class Exceptions {
    //Method to check age

    static void validate(int age) throws TestException {
        if (age < 18) {
            throw new TestException("age: " + age + " is not valid to vote");
        } else {
            System.out.println("welcome to voting");
        }

    }

    public static void main(String[] args) throws TestException, UserNotFoundException {
//        int age =10;
////        if(age < 18){
////            // throw keyword is used to throw an exception explicitly
////            throw new TestException();
////        }
//        try{
//            validate(age);
//        }
//        catch (TestException ex){
//            System.out.println("catch block: "+ex.getMessage());
////            throw new TestException("thrown from the catch block", ex);
////            ex.printStackTrace();
//        }
//
//       System.out.println("Rest of the code");

        User user = new User(1, "praveen");
        User user1 = new User();
        user1.setId(2);
        user1.setName("raja");

        List<User> userlist = new ArrayList<>();
        userlist.add(user);
        userlist.add(user1);
        int input = 3;
        boolean isUserPresent = false;
        for (User user2 : userlist) {
//            if (user2.getId() == input) {
//                isUserPresent = true;
//                System.out.println("user found: " + user2);
//                break;
//            }
            if (user2.getName().equals("raja")) {
                isUserPresent = true;
                System.out.println("user found:"+user2);
                break;
            }
        }

        if (!isUserPresent) {
            throw new UserNotFoundException("user not found");
        }

    }
}

