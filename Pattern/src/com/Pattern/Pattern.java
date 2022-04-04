package com.Pattern;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    printPattern(n);
}

    static void printPattern(int n) {
        for (int i = 0; i <n; i++) {
            for (int j = 1; j<=n-i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }
}
