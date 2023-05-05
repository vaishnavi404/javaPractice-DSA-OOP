package com.example.vaishnavi;

public class SearchInRotatedArrWithDuplicates {
    public static void main(String[] args) {

    }
    static  int  findPivotWithDuplicateELe(int[] arr){
        int start=0;
        int end = arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
//            case 1: mid is at pivot
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
//            case2: mid is at start of rotation
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1 ;
            }
// case 3: if start=end=mid then skip duplicates
            if(arr[start]==arr[mid]&& arr[mid]== arr[end]){
                // note:what id these ele at start or end were pivot?
//                check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                if(arr[end]<arr[end-1]){
                    return end;
                }
                start++;
                end--;}
                //ledt side is sorted so pivot is in right
                else if(arr[start]<arr[mid]||(arr[start]== arr[mid]&&arr[mid]>arr[end])){
                    start=mid+1;
                }
                else {
                    end=mid-1;
            }
        }
        return -1;
    }
}
