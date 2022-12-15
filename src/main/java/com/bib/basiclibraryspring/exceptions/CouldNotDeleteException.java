package com.bib.basiclibraryspring.exceptions;

/**
 * @author Steven Horng
 */
public class CouldNotDeleteException extends RuntimeException{

    public CouldNotDeleteException(String message) {
        super(message);
    }
}
