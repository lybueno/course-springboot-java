package com.educandoweb.course.services.exceptions;

import java.io.Serializable;

public class DatabaseException extends RuntimeException {

    public DatabaseException(String msg) {
        super(msg);
    }
}
