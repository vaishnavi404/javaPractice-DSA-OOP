package com.example.vaishnavi;

import java.util.Scanner;

public class MethodsFunctions {
    public static void main(String[] args) {

         String personalize= myGreet("sanu");
        System.out.println(personalize);
//sum();
//        System.out.println(greet());
//        sum();
        /*access modifier (we'll look in oop return_type name(){
        return statement}
        * */
        System.out.println( sum1(8,9));
    }

  static String myGreet(String name) {
        return ("hello "+name);
    }

    static void sum(){
           Scanner in = new Scanner(System.in);
           System.out.print("Enter number 1: ");
           int num1=in.nextInt();
           System.out.print("Enter number 2: ");
           int num2 = in.nextInt();
           int sum = num1+num2;
        System.out.println(sum);
    }
    static String greet(){
        return "hello ";
    }
    static int sum1(int a , int b){
        int sum=a+b;
        return sum;
    }
}
// any thing you want to use in static is also has to be static