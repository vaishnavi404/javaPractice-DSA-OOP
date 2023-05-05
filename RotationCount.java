package com.example.vaishnavi;

public class RotationCount {
//    index of pivot+1
public static void main(String[] args) {
//int[] arr={4,5,6,7,0,1,2,3};
    int[] arr={1,2,3,4,5,6,7,8};
    System.out.println(countRotation(arr));
}

    private static int countRotation(int[] arr) {
    int pivot=findPivot(arr);
//    if(pivot==-1){
////        array is not rotated
//        return 0;
//    }
    return pivot+1;
    }
    static  int  findPivot(int[] arr){
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
//            case3: mid is at rotation part
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
//            case4: mid is at non-rotated part
            if(arr[mid]>= arr[start]) {
                start= mid+1;
            }
        }
        return -1;
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
                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
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
