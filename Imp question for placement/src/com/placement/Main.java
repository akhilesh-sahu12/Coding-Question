package com.placement;
import java.lang.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
	String s="(()())(()))";
	String res=remove_P(s);
        System.out.println(res);
    }

    private static String remove_P(String s) {
        int bf=0;
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(' && bf==0) {
                bf = 1;
                while (bf != 0) {
                    i++;
                    if (s.charAt(i) == '(')
                        bf++;
                    else if (s.charAt(i) == ')')
                        bf--;
                    if (bf != 0)
                        sb.append(s.charAt(i));
                }
            }
        else
            continue;
        }
        return sb.toString();
    }
}
