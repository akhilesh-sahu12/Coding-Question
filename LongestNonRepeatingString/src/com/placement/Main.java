package com.placement;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int res= lengthOfLongestSubstringNonRepeatingChar(str);
        System.out.println(res);
    }
    static int lengthOfLongestSubstringNonRepeatingChar(String str){
        int maxLength=0;
        int left=0;
        int right=0;
        Set<Character>set=new HashSet<>();
        while (right<str.length()){
            while(set.contains((str.charAt(right))))
                set.remove(str.charAt(left++));
            set.add(str.charAt(right++));
            maxLength=Math.max(maxLength,right-left);
        }
        return maxLength;

    }

}
