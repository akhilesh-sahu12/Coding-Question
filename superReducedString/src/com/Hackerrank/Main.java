package com.Hackerrank;
/*
Reduce a string of lowercase characters in 
range ascii[‘a’..’z’]by doing a series of 
operations. In each operation, select a pair 
of adjacent letters that match, and delete them.

Delete as many characters as possible using 
this method and return the resulting string. 
If the final string is empty, return Empty String

Example.


aab shortens to b in one operation:
 remove the adjacent a characters.


Remove the two 'b' characters leaving 'aa'.
Remove the two 'a' characters to leave ''. 
Return 'Empty String'.
*/

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
      //  System.out.println(superReducedString(s));
        System.out.println(superReduceStrings(s));
    }

     static String superReduceStrings(String s) {
        Stack<Character>ch=new Stack<>();
         for(char c: s.toCharArray()){
             if(ch.isEmpty())
                 ch.push(c);
             else if(c==ch.peek())
                 ch.pop();
             else
                 ch.push(c);
         }
         StringBuilder str=new StringBuilder();
         for(Character cha:ch)
             str.append(cha);
         if(str.length()==0)
             return  "Empty String";
         else
             return str.toString();
    }

    static String superReducedString(String s) {
        StringBuffer str=new StringBuffer(s);
        for(int i=0; i<=str.length(); i++){
            for(int j=1; j<str.length(); j++){
                if(str.charAt(j)==str.charAt(j-1)){
                    str.delete(j-1,j+1);
                }
            }
        }
        if(str.toString().isEmpty())
            return "Empty String";
        return str.toString();
    }
}
