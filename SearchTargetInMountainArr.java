package com.example.vaishnavi;

public class SearchTargetInMountainArr {
    public static void main(String[] args) {
     int [] arr= {1 ,2,3,4,5,6,7,8,9,17,15,4,2};
     int target=15;
        System.out.println(findInMountainArray(target,arr));
    }



        public static int findInMountainArray(int target, int[] mountainArr) {
            int peak = peakIndex(mountainArr);
            int ans1=0;
            int result=0;
            int ans= binarySearch(mountainArr,target,peak+1,mountainArr.length-1);
            if(ans==-1){
                 ans1= binarySearch(mountainArr,target,mountainArr[0],peak);
            }
            if(ans==-1){
                 result= ans1;
            }
            else {
                   result = ans;
            }
            return result;
        }
        public static int peakIndex(int arr[]) {
            int low = 0;
            int high = arr.length - 1;
            while (low < high) {
                int mid = low + (high - low) / 2;

                if (arr[mid] < arr[mid + 1]) {
                    low = mid + 1;
                }
                else {
                    high = mid;
                }
            }
            return low;
        }
        static int binarySearch(int[] arr, int target, int start, int end){
            // int start = ;
            // int end = arr.length - 1;
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

