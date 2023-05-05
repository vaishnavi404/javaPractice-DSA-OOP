package com.example.vaishnavi;

import java.util.Scanner;

public class BinarySearch {
    //only works for sorted array assending or decending
     // find the middle element
    // check if target
//    mid=start+end/2
    // 1) = middle element
    // 2) > mid start= mid+1;
    // 3) <mid end= min-1;
//    worst case time complexity is logn
    public static void main(String[] args) {
        int arr[]= new int[8];
        Scanner n= new Scanner(System.in);
      for(int i=0;i<8-1;i++){
       arr[i]= n.nextInt();
      }
//      int target =35;
        System.out.println(binanrySrearch(arr,35));

    }
//    static  int binanrySrearch(int[] arr, int target) {
//        int start =0;
//        int end = arr.length - 1;
//        int mid =0;
//        while (start < end) {
//            for (int i = start; i < end; i++) {
//                 mid = start + (end-start)/2;
//                 if (arr[mid] == target) {
//                    return mid;
//                }
//                if (target < arr[mid]) {
//                    end = mid - 1;
//                }
//                if (target > arr[mid]) {
//                    start = mid + 1;
//                }
//            }
//        }
//        return -1;
//    }


// when order is unknown
    static int binanrySrearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
      while (start<=end){
          int mid = start+(end-start)/2;

          if(arr[mid]==target){
              return mid;
          }
          if(isAsc){
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
  return -1;
    }
}
