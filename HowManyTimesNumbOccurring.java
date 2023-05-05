package com.example.vaishnavi;

import java.util.Scanner;

public class HowManyTimesNumbOccurring {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
          int n = in.nextInt();
          int num = in.nextInt();
          int count=0;
          while(n>=1){
              int rem =n%10;
              n=n/10;
              if(rem==num){
                  count++;
              }
          }
        System.out.println(count);
    }
}
