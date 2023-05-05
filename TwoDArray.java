package com.example.vaishnavi;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int [][]arr = new int [3][3];
//        int [][] abc={
//                {1,2,3},{4,5,6},{7,8,9}
//
//        };
//        int [][] arr={
//                {1,2,3},//0th index
//                {4,5},//1st index
//                {6,8,9,7}//2nd index
//        };
        //length of array gives number of rows
        for(int row=0;row< arr.length;row++){
            //for each col in every row
            for (int col=0;col<arr[row].length;col++){
                arr[row][col]=in.nextInt();
            }
        }
//        for(int row=0;row< arr.length;row++){
//            //for each col in every row
//            for (int col=0;col<arr[row].length;col++){
////                arr[row][col]=in.nextInt();
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }
//        for(int row=0;row< arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }
        for(int[]a:arr){
            System.out.println(Arrays.toString(a));
        }
        for(int row=0; row< arr.length;row++){

        }

    }
}
