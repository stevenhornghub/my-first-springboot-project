package com.bib.basiclibraryspring.exceptions;

public class CouldNotDeleteException extends RuntimeException{

    public CouldNotDeleteException(String message) {
        super(message);
    }
}
