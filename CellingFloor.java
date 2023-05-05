package com.example.vaishnavi;

import java.util.Scanner;

public class CellingFloor {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int size = n.nextInt();
        int []arr= new int[size];

        for(int i=0;i<size;i++){
            arr[i]= n.nextInt();
        };
        int target = n.nextInt();
        System.out.println(Celling(arr,target));
        System.out.println(Floor(arr,target));
    }
//  return index of greatest element <= given element
     static int Floor(int[] arr, int target) {

         int start = 0;
         int end = arr.length - 1;
         boolean isAsc = arr[start] < arr[end];
         while (start<=end){
             int mid = start+(end-start)/2;

             if(arr[mid]==target){
                 return mid;
             }
             if(isAsc){
                 if(target<arr[0]){
                     return -1;
                 }
                 if (target < arr[mid]) {
                     end = mid - 1;
                 }
                 else {
                     start = mid + 1;
                 }
             }
             else{
                 if (target > arr[mid]) {
                     end = mid - 1;
                 }
                 else{
                     start = mid + 1;
                 }
             }

         }
         return arr[end];
    }

//     return the index of smallest no>= target
    static int Celling(int[] arr, int target) {

         int start = 0;
         int end = arr.length - 1;
         boolean isAsc = arr[start] < arr[end];
         while (start<=end){
             int mid = start+(end-start)/2;

             if(arr[mid]==target){
                 return mid;
             }
             if(isAsc){
                 if(target > arr[arr.length-1]){
                     return -1;
                 }
                 if (target < arr[mid]) {
                     end = mid - 1;
                 }
                 else {
                     start = mid + 1;
                 }
             }
             else{
                 if (target > arr[mid]) {
                     end = mid - 1;
                 }
                 else{
                     start = mid + 1;
                 }
             }

         }
         return arr[start];
    }

}
