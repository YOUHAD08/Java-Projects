package com.oop.projects.ExceptionManagement.NaturalNumbe;

public class Natural_Number {
    private int number;

    public Natural_Number(int number) throws NegativeNumberException {
        if (number < 0) throw new NegativeNumberException("Number must be positive", number);
        this.number = number;
    }


    public Natural_Number getVal() {
        return this;
    }

    public void setVal(int number) throws NegativeNumberException {
        if (number < 0) throw new NegativeNumberException("Number must be positive" , number);
        this.number = number ;
    }

    public void decrement() throws NegativeNumberException {
        if (number < 1) throw new NegativeNumberException("We can not decrement Natural_Number less than 1", number);
        this.number--;
    }

    @Override
    public String toString() {
        return "Natural_Number{" +
                "number=" + number +
                '}';
    }
}
