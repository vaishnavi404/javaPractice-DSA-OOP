package com.example.vaishnavi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
//        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
      int[] arr={1,3,23,9,18};
      reverse(arr);
        System.out.println(Arrays.toString(arr));

//        Scanner in = new Scanner(System.in);
//        for adding 3 list in arrylist
//        for(int i=0;i<3;i++){
//            list.add(new ArrayList<>());
//        }
////        add ele
//        for (int i=0;i<3;i++){
//            for (int j=0;j<3;j++){
//                list.get(i).add(in.nextInt());
//            }
//        }
        }
static void reverse(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
        swap(arr, start, end);
        start++;
        end--;
    }
}
static void swap(int[] arr,int i1,int i2){
    int temp=arr[i1];
    arr[i1]=arr[i2];
    arr[i2]=temp;
        }

    }

