package com.company;

import java.util.Scanner;

// 1. sorunun çözümü

public class birincisoru {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi Giriniz: ");
        int input_number = scan.nextInt();
        int first_value = input_number;
        int length = String.valueOf(input_number).length();

        int a;
        int b = 0;
        for (int i = 0; i < length; i++) {

            a = input_number % 10;
            b = b * 10 + a;
            input_number = input_number / 10;
        }

        if (b == first_value) {
            System.out.println(b + " Bir palindrom sayidir");
        }
        else {
            System.out.println(b + " Bir palindrom sayi degildir");
        }
    }
}
