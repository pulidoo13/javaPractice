package com.Internship.APIRest.exception;

public class PreconditionFailedException extends RuntimeException {
    public PreconditionFailedException() {
    }

    public PreconditionFailedException(String s) {
        super(s);
    }

    public PreconditionFailedException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public PreconditionFailedException(Throwable throwable) {
        super(throwable);
    }

    public PreconditionFailedException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
