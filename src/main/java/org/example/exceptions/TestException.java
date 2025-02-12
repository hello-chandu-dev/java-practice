package org.example.exceptions;

public class TestException extends Exception {
    //Constructor is taking String Value from the Parent Exception
    public TestException(){
//        super.getCause();// calling super class method
//        super.abc="asd"; // calling super class variable
        super(); // calling superclass constructor
    }


    public TestException(String message){
        super(message);
    }


    public TestException(String message, Throwable throwable){
        super(message, throwable);
    }

    public TestException(Throwable th){
        super(th);
    }

}
