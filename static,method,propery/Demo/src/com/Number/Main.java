package com.Number;

public class Main {

    public static void main(String[] args) {
        Number number = new Number(); // tao 1 doi tuong cua lop number khong co tham so truyen vao
       double value =number.sum();
        Number number1 = new Number(2,3);
        System.out.println(value);
        double value2= number1.sum();
        System.out.println(value2);
    }
}