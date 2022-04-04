package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        sortArray(a, n);
    }
    static void printArray(int a[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
           }
    static void sortArray(int a[], int n) {
        int i, c0 = 0, c1 = 0, c2 = 0;
        for (i = 0; i < n; i++)
            switch (a[i]){
                case 0:
                    c0++;
                    break;
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
            }
        i=0;
        while(c0 > 0) {
            a[i++] = 0;
            c0--;
        }
        while (c1 > 0) {
            a[i++] = 1;
            c1--;
        }
        while (c2 > 0) {
            a[i++] = 2;
            c2--;
        }
        printArray(a,n);
    }
}


