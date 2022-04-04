package com.Series;
// 0 0 2 1 4 2 6 3 8 4 10 5 12 6 14 7 16 8 18 9 20 10 22
//  Time complexity => O(1)
// if(n%2==0)// 0 2 4 8 10 12 14
//      than n=n/2;
//           n=2*(n-1)
//           print n/2;
// else    // 0 1 2 3 4 5 6 7
//      than n=n/2+1;
//           n=2*(n-1)
//           print n

import java.util.*;
public class Series1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
     //   my(n);
        rachit(n);
    }

     static void rachit(int n) {
         if (n % 2 == 0)// 0 2 4 8 10 12 14
         {
             n = n / 2;
             n = 2 * (n - 1);
             System.out.println(n / 2);
         } else {  // 0 1 2 3 4 5 6 7
             n = n / 2 + 1;
             n = 2 * (n - 1);
             System.out.println(n);
         }

     }
    static void my(int n) {
        int ans = 0;
        if(n %2 == 0)
          {
            int a = 0;
            for (int i = 0; i < n / 2; i++) {
                ans = a;
                a += 1;

            }
            System.out.println(ans);
        }
        else{
            int a = 0;
            for (int i = 0; i < (n + 1) / 2; i++) {
                ans = 2 * a;
                a++;
            }
            System.out.println(ans);
        }

    }
}
