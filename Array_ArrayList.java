package com.example.vaishnavi;

import java.util.Arrays;
import java.util.Scanner;

public class Array_ArrayList {
    public static void main(String[] args) {
        int a=19;
      //
        //datatype[] variable_name = new datatype[size];
        //store 5 roll numbers
//        int [] roll=new int[5];//by default ti has all 0 values
    //   (compile time) int is data type roll is reffrence variable
        //   (run time)new int [5] is creating object in heap memory
//        int[] rnos2= {23,12,45,32,15};
//        int [] ros;//declaration of array
//        ros = new int[5];//actual object is being created in memory (heap memory )
       // reffrence variable is in the stack and actual array is in heap

        //array objects are in heap
        // heap objects are not continues
        // Dynamic memory allocation(runtime)
       // hence array objects in java may not be continuos (depends on jvm)

        //new is used to create an object
//        String[] arr = new String[4];
//        System.out.println(arr[0]);
        //null can be assign to string but not to int
        //array of objets
        Scanner in= new Scanner(System.in);
        int[] str =new int[5];
        for(int i=0;i< str.length;i++){
         str[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(str));
        change(str);
        System.out.println(Arrays.toString(str));
    }
    static void change(int[]arr){
        arr[0]=99;
    }
}
// in java only call by value

//