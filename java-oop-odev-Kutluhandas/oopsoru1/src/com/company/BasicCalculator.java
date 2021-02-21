package com.company;

import java.util.Scanner;

public class BasicCalculator implements Calculator {

    int x,y;

    public void firstSituation() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        x = scan.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        y = scan.nextInt();
    }

    public void addition(){
        System.out.println("Girdiğiniz sayıların toplamı: " + (x + y));
    }

    public void subtraction(){
        System.out.println("Girdiğiniz sayıların farkı: " + (x - y));
    }

    public void multiplication(){
        System.out.println("Girdiğiniz sayıların çarpımı: " + (x * y));
    }

    public void division(){
        System.out.println("Girdiğiniz sayıların bölümü: " + ((float)  x / y));
    }
}
