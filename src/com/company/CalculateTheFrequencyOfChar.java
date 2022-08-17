package com.company;
//Java Program to find the frequency of characters

import java.util.Scanner;

public class CalculateTheFrequencyOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        String str = sc.nextLine();
        int [] freq = new int [str.length()];
        char [] c = str.toCharArray();
        for(int i= 0; i<str.length(); i++){
            freq[i] = 1;
            for(int j= i+1; j<str.length(); j++){
                if(c[i] == c[j]){
                    freq[i]++;

                    c[j]='0';
                }

            }
        }
        for(int i= 0; i<str.length(); i++){
            if(c[i] != ' ' && c[i] != '0'){
                System.out.println(c[i] + "  =  " + freq[i]);
            }
        }
        System.out.println("The total number of characters is " + str.length());
    }
}
