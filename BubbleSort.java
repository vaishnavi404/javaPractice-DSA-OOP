package com.example.vaishnavi;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
       int[] arr={6, 7,8 ,9,1,2,3,4,5};
       bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
       selectionSOrt(arr);
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSOrt(int[] arr){
        for(int i=0;i< arr.length;i++){
     int last = arr.length-i-1;
     int maxIndex=getMaxIndex(arr,0,last);
           swap(arr,maxIndex,last);
        }
    }
    static void swap(int[] arr, int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static  int getMaxIndex(int[] arr,int start,int end){
        int max= start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void bubbleSort(int[] arr){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped=false;
            for (int j=1; j<arr.length-i ;j++){
                if(arr[j] < arr[j-1]){
                  int temp=arr[j];
                  arr[j]=arr[j-1];
                  arr[j-1]=temp;
                  swapped= true;
                }

            }
            if(!swapped){
                break;
            }
        }


    }
    static void insertionSort(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            for (int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }

    //only use when 1to N numbers are given
    static  void cyclicSort(int[] arr){
        int i=0;
        while (i< arr.length){
            int correct = arr[i]-1;
            if(arr[i]!= arr[correct]){
                swap(arr,i,correct);
            }
            else {i++;}
        }
    }
}
