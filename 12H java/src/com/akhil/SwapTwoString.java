package com.akhil;

public class SwapTwoString {
    public static void main(String[] args) {
        String s1 = "Akhilesh";
        String s2 = "Sachin";
        String temp;
        temp = s1;
        s1 = s2;
        s2 = temp;
        System.out.println(s1 + " " + s2);
        System.out.println(temp);
    }
}
