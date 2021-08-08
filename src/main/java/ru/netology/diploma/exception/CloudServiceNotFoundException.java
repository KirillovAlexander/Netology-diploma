package ru.netology.diploma.exception;

public class CloudServiceNotFoundException extends RuntimeException{
    public CloudServiceNotFoundException(String message) {
        super(message);
    }
}
