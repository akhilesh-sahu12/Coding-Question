package com.Akhilesh_Sahu;

import java.util.Scanner;

public class WithoutUsingFunctionCalculateLengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        calculateLengthOfString(s);
    }
    static void calculateLengthOfString(String s) {
        int count=0;
        char[] ch=s.toCharArray();
           for (char c:ch) {
               count++;
           }
           System.out.println(count);
    }

}

