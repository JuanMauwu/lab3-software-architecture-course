package com.udea.lab3vuelo.exception;

public class InvalidRating extends RuntimeException{
    public InvalidRating(String message) {
        super(message);
    }
}