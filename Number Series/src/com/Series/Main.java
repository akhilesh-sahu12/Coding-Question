package com.Series;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        if((n&1)==0) {
            int a = 1;
            for (int i = 0; i < n / 2; i++) {
                ans = 3 * a;
                a++;
            }
            System.out.println(ans);
        }
        else {
            int a = 8;
            for (int i = 0; i < (n+1) / 2; i++) {
                ans=a;
                a+=3;
            }
            System.out.println(ans);
        }

    }
}
