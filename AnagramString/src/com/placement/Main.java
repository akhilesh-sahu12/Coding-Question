package com.placement;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String s="abc";
        String s1="aba";
       boolean res= isAnagram1(s,s1);
        System.out.println(res);
	// write your code here
    }

    private static boolean isAnagram1(String s, String s1) {
        int freq[]=new int[26];
        if(s.length()!=s1.length())
            return false;
        else {

            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i)-'a']++;
                freq[s1.charAt(i)-'a']--;
            }
            System.out.println(Arrays.toString(freq));
        }
        for (int i = 0; i < s.length(); i++) {
            if(freq[s.charAt(i)-'a']!=0)
                return false;
        }
        return true;

    }

   /* private static boolean isAnagram(String s, String s1) {
        int res=0;
        if(s.length()!=s1.length())
            return false;
        else {

            for (int i = 0; i < s.length(); i++) {
                res^=(int)s.charAt(i);
                res^=(int)s1.charAt(i);
            }
        }
        return (res==0);
    }
    */

}
