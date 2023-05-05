package com.example.vaishnavi;

public class LinearSearching {
  public static void main(String[] args) {
    int[] nums = {23, 45, 1, 2, 9 };
    System.out.println(linearSearch(nums, 3));
//best case complexity of life o(1)
    //worst case complexity o(n )
  }
  static int linearSearch(int[] arr,int target){
    if(arr.length==0){
      return -1;
    }
//    for(int i=0;i< arr.length;i++) {
//      //check for ele at  every index if it is =target
//      int element = arr[i];
//      if (element == target) {
//        return i;
//      }
//    }
    for(int element:arr){
      if(element==target){
        return element;
      }
    }
//this line will execute if no condition above found
    return -1;
  }
}
