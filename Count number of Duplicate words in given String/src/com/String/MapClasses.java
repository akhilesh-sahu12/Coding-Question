package com.String;
import javax.swing.*;
import  java.util.*;
public class MapClasses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={4,2987,987,8,98,987};
       // Map<Integer,Integer>map=new HashMap<>();// random order
        Map<Integer,Integer>map=new LinkedHashMap<>();// in order
        //Map<Integer,Integer>map=new TreeMap<>(); // sorted order
        //Map<Integer,Integer>map=new HashMap<>();
           
        for (int ele:arr) {
            if (map.containsKey(ele))
                map.put(ele, map.get(ele) + 1);
            else
                map.put(ele, 1);
        }
        System.out.println(map);

    }
}
