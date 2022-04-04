package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int result = ispalindrome(m);
        if (m == result)
            System.out.println("number is palindrome");
        else
            System.out.println("number is not palindrome");

    }

    static int ispalindrome(int n) {
        int rev = 0;
        while (n > 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        return rev;
    }
}