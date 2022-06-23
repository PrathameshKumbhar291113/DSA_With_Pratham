package com.company;

import java.util.Scanner;

public class reduceToOneDigit {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input the number");
        int a = keyboard.nextInt();
        int counter = 0;
        while(true){
            if(a<10){
                break;
            }else{
                a = numberOfProducts(a);
                counter+=1;
            }
        }
        System.out.println(counter);
    }
    static int numberOfProducts(int n){
        int ans = 1;
        while(n!=0){
            int temp = n;
            temp = temp%10;
            ans = ans*temp;
            n = n/10;
        }
        return ans;
    }
    /*
    def ops(n):
  ans=1
  while(n!=0):
    temp=n
    temp=temp%10
    ans=ans*temp
    n=n//10
  return ans

n = int(input())
counter = 0
while(True):
  if n<10:
    break
  else:
    n=ops(n)
    counter+=1

print(counter)

    */

    //WAP to find most occured character in string
}
