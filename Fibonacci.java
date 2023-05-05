package com.example.vaishnavi;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       int arrayF[]=new int[n+2];
//        int p=0;
//        int i=1;
//        int count=2;
//        while(count<=n){
//            int temp=i;
//            i=i+p;
//            p=temp;
//            count++;
//
//        }
//        System.out.println(i);

        arrayF[0] = 1;
        arrayF[1] =1;

        for( int i=2;i<n;i++){
            arrayF[i]=arrayF[i-1]+arrayF[i-2];}
        for(int i=0;i<n;i++){
            System.out.println(arrayF[i]);
        }



    }
}

