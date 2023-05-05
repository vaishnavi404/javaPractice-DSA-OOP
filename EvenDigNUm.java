package com.example.vaishnavi;

public class EvenDigNUm {
    public static void main(String[] args) {
   int nums[]={
           111,222,333,4,5555,6666
   };
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[]nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static  boolean even(int num) {
//       int ans=  num +  "";
        int dig=0;
        while(num>0){
            dig++;
            num=num/10;
        }
        if(dig%2==0){
            return true;
        }
        return false;
    }
}
