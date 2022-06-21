package com.company;

import java.util.Scanner;



public class MaxMinArray {
    static int getMax(int [] array , int n){
        int max = Integer.MIN_VALUE ;
        for(int i=0 ;i<n;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    static int getMin(int [] array , int n){
        int min = Integer.MAX_VALUE ;
        for(int i=0 ;i<n;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The max element in the array is "  + getMax(arr ,n));
        System.out.println("The max element in the array is "  + getMin(arr ,n));

    }
}
