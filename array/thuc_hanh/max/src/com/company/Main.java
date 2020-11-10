package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int size;
	    int[] array;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Enter a size");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        }while (size > 20 );

        array = new  int [size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " , ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int k : array) {
            System.out.print(k + "\t");
        }
        int max = array[0];
        for (int k : array) {
            if (k > max) {
                max = k;
            }
        }
        System.out.println("the largest property value in the list is " +max+ " ,at postion");
    }
}
