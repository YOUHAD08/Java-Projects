package com.oop.projects.Exception_Management.NaturalNumbe;

public class NegativeNumberException extends Exception {
    private int false_number;


    public NegativeNumberException(String message, int false_number) {
        super(message);
        this.false_number=false_number;
    }

    // Return the Number That Rise NegativeNumberException  Exception
    public int getFalse_number() {
        return false_number;
    }
}
