package com.Series;
// 3 8 6 11 9 14 12 17 15 20 18
//  Time complexity => O(1)
// if(n%2==0)// 8 11 14 17 20 23
//      than n=n/2;
//           n=6*(n-1)
//           print n;
// else    // 3 6 9 12 15 18 21
//      than n=n/2+1;
//           n=3*n
//           print n

import java.util.Scanner;

public class Series3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    my(n);
 //   rachit(n); This logic will not work this question
}

    static void rachit(int n) {
        if (n % 2 == 0)// 0 2 4 8 10 12 14
        {
            n = n / 2;
            n = 6 * (n - 1);
            System.out.println(n);
        } else {  // 0 1 2 3 4 5 6 7
            n = n / 2 + 1;
            n = 7 * (n - 1);
            System.out.println(n);
        }

    }
    static void my(int n) {
        int ans = 0;
        if(n %2 == 0)
        {
            int a = 8;
            for (int i = 0; i < (n +1)/ 2; i++) {
                ans = a;
                a += 3;

            }
            System.out.println(ans);
        }
        else{
            int a = 1;
            for (int i = 0; i < (n+1)  / 2; i++) {
                ans = 3*a;
                a++;
            }
            System.out.println(ans);
        }

    }
}

