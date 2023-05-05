package com.example.vaishnavi;

import java.util.Arrays;

public class SearchINSortedMatrix {
    public static void main(String[] args) {
       int[][] arr={
               {10,20,30,40},
               {15,25,35,45},
               {25,29,37,49},
               {33,34,38,50}
       };
        System.out.println(Arrays.toString(search(arr,36)));
    }
    static int[] search(int[][] matrix, int target){
        int r=0;
        int c = matrix.length-1;
        while (r<matrix.length&&c>=0){
            if (matrix[r][c]==target){
                return new int[]{r,c};
            }
            if(matrix[r][c]<target){
                r++;
            }
            else {
                c--;
            }}
            return new int[]{-1,-1};

    }
}
