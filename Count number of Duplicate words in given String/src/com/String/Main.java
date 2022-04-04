package com.String;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s=str.toLowerCase();
        countDuplicateWords(s);
    }

     static void countDuplicateWords(String s) {
        String arr[]=s.split(" ");
        Map<String, Integer>map=new HashMap<>();

         for (int i = 0; i <arr.length ; i++) {
             if(map.containsKey(arr[i])){
                 map.put(arr[i],(map.get(arr[i])+1));
             }
             else
             {
                 map.put(arr[i],1);
             }
         }
         for(int i=0; i<arr.length; i++){
             if(map.get(arr[i])>1){
                 System.out.println(arr[i]+":"+map.get(arr[i]));
                 map.put(arr[i],-1);
             }
         }

        // System.out.println(map);
    }

}
