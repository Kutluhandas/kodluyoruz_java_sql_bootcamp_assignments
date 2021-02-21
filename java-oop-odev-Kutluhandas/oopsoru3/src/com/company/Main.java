package com.company;

public class Main {

    public static void main(String[] args) {

        Pair<String, Integer> obje1 = new Pair<String, Integer>();
        Pair<Double, String> obje2 = new Pair<Double, String>();

        obje1.setFirst("deneme");
        obje1.setSecond(75);
        obje2.setFirst(45.5);
        obje2.setSecond("deneme2");

        System.out.println("obje1 in değerleri: " + obje1.getFirst() + " ve " + obje1.getSecond());
        System.out.println("obje2 nin değerleri: " + obje2.getFirst() + " ve " + obje2.getSecond());

    }
}
