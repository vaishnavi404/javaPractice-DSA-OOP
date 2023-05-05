package com.example.vaishnavi;

import java.util.Scanner;

//34. Find First and Last Position of Element in Sorted Array
//        Medium
//        16.6K
//        395
//        Companies
//        Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//
//        If target is not found in the array, return [-1, -1].
//
//        You must write an algorithm with O(log n) runtime complexity.
//
//
//
//        Example 1:
//
//        Input: nums = [5,7,7,8,8,10], target = 8
//        Output: [3,4]
//        Example 2:
//
//        Input: nums = [5,7,7,8,8,10], target = 6
//        Output: [-1,-1]
//        Example 3:
//
//        Input: nums = [], target = 0
//        Output: [-1,-1]
//
//
//        Constraints:
//
//        0 <= nums.length <= 105
//        -109 <= nums[i] <= 109
//        nums is a non-decreasing array.
//        -109 <= target <= 109
public class FirstAndLastOccurence {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int size= n.nextInt();
        int[] nums = new int[size];
        for (int i=0;i<size;i++){
            nums[i]=n.nextInt();
        }
        int target = n.nextInt();
        System.out.println(searchRange(nums,target));
    }
     static int[] searchRange(int [] nums,int target){
        int[] ans={-1,-1};
    int start= search(nums, target,true);
    int end = search(nums, target,false);
    ans[0]=start;
    ans[1]=end;
    return  ans;
}
static int search(int[] nums, int target, boolean findStartIndex) {
   int ans = -1;
    int start = 0;
    int end = nums.length - 1;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (target > nums[mid]) {
            start = mid + 1;
        } else if (target < nums[mid]) {
            end = mid - 1;
        } else if (target == nums[mid]) {
             ans = mid;
            if (findStartIndex ) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }
    return ans;
}
}
