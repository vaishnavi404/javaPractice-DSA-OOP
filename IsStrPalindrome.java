package com.example.vaishnavi;

import java.util.Locale;

public class IsStrPalindrome {
    public static void main(String[] args) {
    String s="abcba";
        System.out.println(Ispalindrom(s));
    }
    static boolean Ispalindrom(String s){
        if(s.length()==0||s == null){
            return true;
        }
      s=s.toLowerCase();
        int start= 0;
      int end= s.length()-1;
      while(end>=start){
          if(s.charAt(start)==s.charAt(end)){
              start++;
              end--;
          }
          if(s.charAt(start)!=s.charAt(end)){
              return false;
          }

      }
        return true;
    }
}
