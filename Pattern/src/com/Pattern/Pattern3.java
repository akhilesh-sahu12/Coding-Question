package com.Pattern;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printPattern(n);
    }

    static void printPattern(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++){
                System.out.print("  ");
            }

           for (int j = 1; j<=i; j++) {
               System.out.print(j+" ");

            }
           int k;
            for ( k = i-1; k>0;k--){
                System.out.print(k+" ");
            }

            System.out.println();
        }

    }
}
