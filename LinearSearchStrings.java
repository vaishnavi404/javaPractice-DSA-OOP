package com.example.vaishnavi;

import java.util.Arrays;

public class LinearSearchStrings {
    public static void main(String[] args) {
        String name ="Kunal";
        char target = 'u';
        System.out.println(search(name,target));
        //to create character array
        System.out.println(Arrays.toString(name.toCharArray()));

    }


    static boolean search(String str , char i) {
  if(str.length()==0){
      return false;
  }
// for(int j=0;j<str.length();j++){
//     if(i==str.charAt(j)){
//         return true;
//     }
// }
        for(char ch: str.toCharArray()){
            if(ch==i){
               return true;
            }
        }
    return false;
    }
}
