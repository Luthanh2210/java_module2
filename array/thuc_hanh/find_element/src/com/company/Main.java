package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] students = {"Chiristan", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name 's student");
        String input_name = scanner.nextLine();
        boolean isExit = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Postion of the students in the list" + input_name + "is: " + (i + 1));
                isExit = true;
                break;
            }
        }
        if (!isExit)
            System.out.println("Not found" + input_name + " in the list:");
    }
}

