package com.Number;

public class Number {
    private int firstNumber;
    private int secondNumber;
    public Number(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;

    }
    public Number() {
    }
 
    public int sum() {
        return firstNumber + secondNumber;
    }

    public void divide() {
        System.out.println("result:" + firstNumber / secondNumber);
    }


}
