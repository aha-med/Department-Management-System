package com.department.exception;

public class NoDepartmentFound extends RuntimeException
{
    public NoDepartmentFound() {
    }

    public NoDepartmentFound(String message) {
        super(message);
    }

    public NoDepartmentFound(String message, Throwable cause) {
        super(message, cause);
    }

    public NoDepartmentFound(Throwable cause) {
        super(cause);
    }

    public NoDepartmentFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
