package com.example.vaishnavi;

public class PeakEleInMountainArr {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 8, 9, 7, 6, 5, 4};
        System.out.println(peakIndex(arr));
    }

    static int peakIndex(int arr[]) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}