package com.Capgemini;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            String s=br.readLine();
            String res=anagram(s);
            System.out.println("Case #"+i+": "+res);
        }
    }
        static String anagram(String s){
            HashMap< String>map=new HashMap<>();
            char  letter[]=s.toCharArray();
            Arrays.sort(letter);
            String newWord=new String(letter);
            if(map.containsKey(newWord)) map.get(newWord);
            else{
                List<String>words=new ArrayList<>();
                words.add(s);
                map.put(newWord,words);
            }
        for(String i:map){
            List<String>values= (List<String>) map.get(i);
            if(values.size()>1){
                for(int i=0; i<s.length(); i++){
                    if(values.contains(i)!=s.charAt(i)){
                        continue;
                    }
                }
                return values;

            }
            return "IMPOSSIBLE";

        }
    }
}