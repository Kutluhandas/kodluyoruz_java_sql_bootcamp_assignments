package com.company;

public class AdvancedCalculator extends BasicCalculator implements Scientific {

    public void square(){
        System.out.println("İlk girdiğiniz sayının karesi: " + Math.pow(x,2));

    }

    public void cube(){
        System.out.println("İlk girdiğiniz sayının küpü: " + Math.pow(x,3));

    }
}
