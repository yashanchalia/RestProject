package com.yash.exception;

/**
 * Created by Yash on 8/16/2015.
 */
public class ErrorMessage {

    int errorCode;
    String errorMessage;
    String documnetation;

    public ErrorMessage() {
    }

    public ErrorMessage(int errorCode, String errorMessage, String documnetation) {
        super();
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.documnetation = documnetation;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getDocumnetation() {
        return documnetation;
    }

    public void setDocumnetation(String documnetation) {
        this.documnetation = documnetation;
    }
}
