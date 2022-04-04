package com.placement;

import java.util.*;
public class LetterCombinationOfAPhoneNumber {
    public static void main(String[] args){
        pad("","12");
        System.out.println(padRet("","123"));
        System.out.println(padCount("","123"));
        System.out.println(padCount1("","123",0));
    }

    private static void pad(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int dig=up.charAt(0)-'0';
        for (int i = (dig-1)*3; i <dig*3 ; i++) {
            char ch=(char)(i+'a');
            pad(p+ch,up.substring(1));
        }
    }
    private static ArrayList<String> padRet(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>list=new ArrayList<>();
        int dig=up.charAt(0)-'0';
        for (int i = (dig-1)*3; i <dig*3 ; i++) {
            char ch=(char)(i+'a');
            list.addAll(padRet(p+ch,up.substring(1)));
        }
        return list;
    }
    private static int padCount(String p, String up) {
        if(up.isEmpty()){
            return 1;
        }
       // ArrayList<String>list=new ArrayList<>();
        int count=0;
        int dig=up.charAt(0)-'0';
        for (int i = (dig-1)*3; i <dig*3 ; i++) {
            char ch=(char)(i+'a');
           count+=(padCount(p+ch,up.substring(1)));
        }
        return count;
    }
    private static int padCount1(String p, String up, int count) {
        if(up.isEmpty()){
            return 1;
        }
        // ArrayList<String>list=new ArrayList<>();

        int dig=up.charAt(0)-'0';
        for (int i = (dig-1)*3; i <dig*3 ; i++) {
            char ch=(char)(i+'a');
            count+=(padCount1(p+ch,up.substring(1),0));
        }
        return count;
    }
}
