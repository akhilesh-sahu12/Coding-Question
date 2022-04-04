package com.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFreqOfCharacterInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s=str.toLowerCase();
        countDuplicateWords(s);
    }

    static void countDuplicateWords(String s) {
       // char ch[]=s.toCharArray();
        Map<Character, Integer> map=new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),(map.get(s.charAt(i))+1));
            }
            else
            {
                map.put(s.charAt(i),1);
            }
        }
        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i))!=-1){
                System.out.println(s.charAt(i)+":"+map.get(s.charAt(i)));
                map.put(s.charAt(i),-1);
            }
        }

        // System.out.println(map);
    }

}
