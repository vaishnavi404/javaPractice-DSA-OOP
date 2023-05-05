package com.example.vaishnavi;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(armstrong(n));
    }
 static boolean armstrong(int a)
 {  int p=a;
//     int c=
     int ans=0;
     int rem;
     while(p>0){
         rem=p%10;
         ans += Math.pow(rem,3);
         p=p/10;
     }
     if(ans==a) return true;
     else return false;
//     return ans;

 }
}
