package com.example.vaishnavi;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CheckCase {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        char ch =       in.next().trim().charAt(0);
        System.out.println(ch);
        String word ="hello";
        System.out.println(word.charAt(2));
         if(ch>='a' && ch<='z'){
             System.out.println("it small case alpha");
         }
    }
}
