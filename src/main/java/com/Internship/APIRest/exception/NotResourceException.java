package com.Internship.APIRest.exception;

public class NotResourceException extends  RuntimeException {
    public NotResourceException() {
    }

    public NotResourceException(String s) {
        super(s);
    }

    public NotResourceException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public NotResourceException(Throwable throwable) {
        super(throwable);
    }

    public NotResourceException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
