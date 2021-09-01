package com.example.assignment3.exception;

public class NameException extends Exception {
    @Override
    public String getMessage() {
        return "Name must be a real name";
    }
}
