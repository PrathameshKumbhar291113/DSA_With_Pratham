package com.company;

import java.util.Scanner;

public class simpleDsa {
    public static void main(String[] args) {
        //Problem statement : Suppose you have got 39 then 3*9 = 27 then 2*7 = 14 and then 1*4 = 4 , print the number of steps to reach the single digit ,  do this with array
        Scanner sc = new Scanner(System.in);

        printNum(1);
    }
    static void printNum(int n){
        if(n<=10){
            System.out.println(n);
            printNum(n+1);
        }
    }
}
