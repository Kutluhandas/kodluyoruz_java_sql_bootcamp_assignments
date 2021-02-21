package com.company;

import java.util.Scanner;

// 3. sorunun cevabı

public class ucuncusoru {

    public static void main(String[] args) {
        String input_st;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir şeyler yazın: ");
        input_st = scan.nextLine();
        int j;
        for(j=input_st.length()-1; j>=0; j--){
            System.out.print(input_st.charAt(j));
        }
        }
    }

