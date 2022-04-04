package com.String;

import java.util.*;

public class CountFrequencyOfCharacterInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        countFrequencyOfCharacterInString(s);
    }

     static void countFrequencyOfCharacterInString(String st) {
        String s=st.toLowerCase();
        Map<Character,Integer>map=new HashMap<>();
         for (int i = 0; i < s.length(); i++) {
             if(map.containsKey(s.charAt(i))){
                 map.put(s.charAt(i),map.get(s.charAt(i))+1);
             }
             else
             {
                 map.put(s.charAt(i),1);
             }

         }
         for (int i = 0; i < s.length(); i++) {
             if (map.get(s.charAt(i)) != 0) {
                 System.out.print(s.charAt(i));
                 System.out.print(map.get(s.charAt(i)) + " ");
                 map.put(s.charAt(i), 0);
             }
         }

    }
}
