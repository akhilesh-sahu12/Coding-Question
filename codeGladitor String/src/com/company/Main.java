package com.company;
import java.util.*;

public class Main {

    // Returns true if str1[] is a subsequence
    // of str2[] m is length of str1 and n is
    // length of str2
    static boolean isSubSequence(String str1, String str2, int m, int n)
    {
        int j = 0;

        // Traverse str2 and str1, and compare
        // current character of str2 with first
        // unmatched char of str1, if matched
        // then move ahead in str1
        for (int i = 0; i < m && j < n; i++)
            if (str2.charAt(j) == str1.charAt(i))
                j++;

        // If all characters of str1 were found
        // in str2
        return (j == n);
    }

    public static void main(String[] args)
    {
      Scanner sc =new Scanner(System.in);
    {
        String str1 =sc.next();
        int m = str1.length();
        int t=sc.nextInt();
        while (t-->0){
        String str2 = sc.next();
        int n = str2.length();
        boolean res = isSubSequence(str1, str2, m, n);
        if (res)
            System.out.println("Positive");
        else
            System.out.println("Negative");
    }
}}}

