package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	   int vnd = 23000;
	   int usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền USD : ");
        usd = sc.nextInt();
        int quydoi= usd * vnd;
        System.out.print("Giá trị VND: " + quydoi);
    }
}
