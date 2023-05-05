package com.example.vaishnavi;

public class RotatedArrBS {
    public static void main(String[] args) {
       int[] arr={2,2,9,2,2};
//        System.out.println(findPivotWithDuplicateELe(arr));
        System.out.println(search(arr,4));
    }
    static int search(int[] nums, int target){
//        int pivot=findPivotWithDuplicateELe(nums);
        int pivot = findPivot(nums);
//        if you do not find a pivot, it means the array is not rotated
        if(pivot==-1){
            //just do normal binary search
            return binarySearch(nums,target,0, nums.length);
        }
//        if pivot is found you have found 2 asc sorted array
//        case 1: pivot ele == target
        if(nums[pivot]==target){
             return pivot;
        }
//        case 2: target>start(search space start to pivot-1) because all number after pivot will be smaller than
//        \]]]]]]]start
        if(target>= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }
//  case 3: target<start(start to pivot going to be bigger than target so search space pivot+1 till end)
        return  binarySearch(nums,target,pivot+1,nums.length-1);
    }
    static int binarySearch(int[] arr, int target,int start, int end){
        while (start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }

                if (target < arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }

        }
        return -1;
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
//        case 3: if start=end=mid then skip duplicates
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
            //left side is sorted so pivot is in right
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
