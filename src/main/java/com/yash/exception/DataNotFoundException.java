package com.yash.exception;

/**
 * Created by Yash on 8/16/2015.
 */
public class DataNotFoundException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = -6328286661536343936L;


    public DataNotFoundException(String message) {
        super(message);
    }
}
