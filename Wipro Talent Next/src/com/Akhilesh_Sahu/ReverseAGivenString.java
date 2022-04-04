package com.Akhilesh_Sahu;

import java.util.Scanner;

public class ReverseAGivenString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String  s=sc.nextLine();
        reverseString(s);

    }

    static void reverseString(String s) {
        char ch[]=s.toCharArray();
        int j=s.length()-1;
        for (int i=0; i<s.length()/2; i++){
            char cha=ch[i];
            ch[i]=ch[j];
            ch[j]=cha;
            j--;
        }
        System.out.println(ch);
    }
}
