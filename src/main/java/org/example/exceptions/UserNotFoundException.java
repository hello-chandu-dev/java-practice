package org.example.exceptions;

public class UserNotFoundException extends Exception {
    public UserNotFoundException() {
        super();
    }

    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(String message, Throwable th) {
        super(message, th);
    }

    public UserNotFoundException(Throwable th) {
        super(th);
    }


}
