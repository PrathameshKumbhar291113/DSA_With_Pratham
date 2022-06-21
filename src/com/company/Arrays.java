package com.company;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i=0 ; i<n ;i++){
            arr[i]  = sc.nextInt();
        }
        for (int ele : arr) {
            System.out.println(ele);
        }
    }
}
