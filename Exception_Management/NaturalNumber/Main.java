package com.oop.projects.Exception_Management.NaturalNumbe;

public class Main {
    public static void main(String[] args) {

        try {

            // Test the Constructor
            Natural_Number natural_number = new Natural_Number(3);

            // Test setVal() Method
            natural_number.setVal(2);
            natural_number.setVal(-1);

            //  Test decrement() Method
            natural_number.decrement();

            // Retrieve Natural_Number
            System.out.println(natural_number.getVal());
        }
        catch (NegativeNumberException e){
            System.out.println(e.getMessage());
        }
    }
}
