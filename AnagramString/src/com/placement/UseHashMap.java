package com.placement;

import java.util.*;

public class UseHashMap {
    public static void main(String[] args) {
        String s="abc";
        String s1="aba";
        boolean res= isAnagram2(s,s1);
        System.out.println(res);
    }

    private static boolean isAnagram2(String s, String s1) {
        Map<Character,Integer>map=new HashMap<>();
        if(s.length()!=s1.length())
            return false;
        else {
            for (int i = 0; i <s.length(); i++) {
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
                map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)-1);

            }
        }
        for (int i = 0; i <s.length() ; i++) {
            //System.out.println(map);
            if(map.get(s.charAt(i))!=0)
                return false;
        }
       return true;
        }
}
