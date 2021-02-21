package com.company;

import java.util.Scanner;

// 2. sorunun cevabı

public class ikincisoru {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hava sıcaklığını giriniz: ");
        int temp = scan.nextInt();
        if(temp < 20){
            System.out.println("Bugün hava biraz soğuk, üstüne kalın şeyler giy!");
        }
        else if(20 <= temp  && temp <=30){
            System.out.println("Bugün hava ılık, tam ince kot ceket giymelik!");
        }
        else if(30 < temp){
            System.out.println("Bugün hava sıcak bayağı görünüyor, bir tişört giyip çıkabilirsin!");
        }
    }
}
