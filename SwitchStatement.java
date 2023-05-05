package com.example.vaishnavi;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        int n=in.nextInt();
//    .equals check only values
//    == also check refrrence
        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("red fruit");
                 break;
            default:
                System.out.println("please enter a valid fruit");

        }
        switch(n){
             case 1,2,3,4,5->
                System.out.println("week days");
            case  6,7->
                System.out.println("weekend");
        }
    }
}

