package com.example.vaishnavi;

import java.util.Arrays;
public class SearchInStrictlySortedMatrix {
    public static void main(String[] args) {
 int[][] arr={ {1,2,4,6,8},
         {10,12,15,17,19},
         {21,22,25,27,29},
         {32,33,35,36,39},
         {41,43,45,46,47}};
        System.out.println(Arrays.toString(search(arr,90)));
    }
    //search in the row provided between the columns provided
    static int[] binarySearch(int[][]matrix, int row, int Cstart, int Cend, int target){
   while (Cstart<=Cend){
       int mid= Cstart+(Cstart-Cend)/2;
       if(matrix[row][mid]==target){
           return new int[]{row,mid};
       }
       if(matrix[row][mid]<target){
          Cstart=mid+1;
       }
       if(matrix[row][mid]>target){
           Cend=mid-1;
       }
   }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix, int target){
        int rows=matrix.length;
        int col=matrix[0].length;
        if(rows==1){
           return binarySearch(matrix,0,0,col-1,target);
        }
        int rStart=0;
        int rEnd=rows-1;
        int Cmid=col/2;
        // run the loop till 2 rows are remaining
        while(rStart < (rEnd-1)){
            //while this is true we have more than two rows
            int mid=rStart+(rEnd-rStart)/2;
            if(matrix[mid][Cmid]==target){
                return new int[]{mid,Cmid};
            }
            if(matrix[mid][Cmid]<target){
                rStart=mid;
            }
            if(matrix[mid][Cmid]>target){
                rEnd=mid;
            }
        }
        // now we have 2 rows
        // check whether the target is in the col of two rows
        if(matrix[rStart][Cmid]==target){
            return new int[]{rStart,Cmid};
        }
        if(matrix[rStart+1][Cmid]==target){
            return new int[]{rStart+1,Cmid};
        }
        //search in first half
        if(target<=matrix[rStart][Cmid-1]){
          return binarySearch(matrix,rStart,0,Cmid-1,target);
        }
        //search in second half
        if(target>=matrix[rStart][Cmid+1]&& target<=matrix[rStart][col-1]){
            return binarySearch(matrix,rStart,Cmid+1,col-1,target);
        }
        //search in third half
        if(target<=matrix[rStart+1][Cmid-1]){
            return binarySearch(matrix,rStart+1,0,Cmid-1,target);
        }
        //search in fourth half
        if(target>=matrix[rStart+1][Cmid+1]){
            return binarySearch(matrix,rStart+1,Cmid+1,col-1,target);
        }
        return new int[]{-1,-1};
    }
}
