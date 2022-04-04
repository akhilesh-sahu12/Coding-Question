package com.company;
import java.util.*;

public class Main {
    public static boolean isPalindrome(char[] ch, int l, int r) {
        //  char ch[] = s.toCharArray();
        // r= ch.length;
        //       l=0;
        if (l >= r)
            return true;
        if (ch[l] != ch[r]) {
            return false;
        }
        return isPalindrome(ch, l + 1, r - 1);
    }

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        String s = x.nextLine();// BananaB
        int l=0;
        int r=s.length()-1;
        char ch[] = s.toCharArray();

        boolean result=isPalindrome(ch,l,r);
        System.out.println(result);
    }
}
