package com.Series;
// 0 0 7 6 14 12 21 18 28 24 35 30
//  Time complexity => O(1)
// if(n%2==0)// 0 6 12 18 24 30 36
//      than n=n/2;
//           n=6*(n-1)
//           print n;
// else    // 0 7 14 21 28 35
//      than n=n/2+1;
//           n=7*n
//           print n

import java.util.*;
public class Series2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
           my(n);
        rachit(n);
    }

    static void rachit(int n) {
        if (n % 2 == 0)//  0 6 12 18 24 30 36
        {
            n = n / 2;
            n = 6 * (n - 1);
            System.out.println(n);
        } else {  // 0 7 14 21 28 35
            n = n / 2 + 1;
            n = 7 * (n - 1);
            System.out.println(n);
        }

    }
    static void my(int n) {
        int ans = 0;
        if(n %2 != 0)//0 7 14 21 28 35
        {
            int a = 0;
            for (int i = 0; i < (n +1)/ 2; i++) {
                ans = a*7;
                a += 1;

            }
            System.out.println(ans);
        }
        else{ // 0 6 12 18 24 30 36
            int a = 0;
            for (int i = 0; i < n  / 2; i++) {
                ans = 6*a;
                a++;
            }
            System.out.println(ans);
        }

    }
}
