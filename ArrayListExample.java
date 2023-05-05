package com.example.vaishnavi;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(10);
        list.add(67);
        list.add(67);
        System.out.println(list);
        System.out.println(list.contains(7));
        list.set(0,99);
        System.out.println(list);
        list.remove(1);
        for (int i=0; i<10;i++){
            list.add(in.nextInt());
        }
        for (int i=0;i<5;i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println(list);
    }
}
