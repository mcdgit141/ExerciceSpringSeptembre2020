package com.formation.epita.mylibrairies.domain.exception;

public class LibrairieNotFoundException extends RuntimeException{

    private static final String ERROR_CODE = ErrorCodes.LIBRARY_NOT_FOUND;

    public LibrairieNotFoundException(String message) {
        super(message);
    }

    public String getErrorCode() {
        return ERROR_CODE;
    }
}
