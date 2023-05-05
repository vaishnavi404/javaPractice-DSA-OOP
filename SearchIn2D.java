package com.example.vaishnavi;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr={
                {23,4,1},
                {18,12,3,9},
                {78, 99,34,56},
                {18,22}
        };
        int target=34;
        System.out.println(search(arr,target));
    }
    static int search(int[][] arr, int target){
            for(int row=0;row< arr.length;row++){
                for(int j=0;j< arr[row].length;j++){
                     if(target==arr[row][j]){
                         return 1;
                     }
                }
            }
            return  0;
    }
}
