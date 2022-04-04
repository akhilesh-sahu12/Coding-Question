package com.Akhilesh_Sahu;

import java.util.Scanner;
// 100 97 94 91 88 85 82 79 76 73 70 67 64 61 58 55 52 49 46 43 40 37 34 31 28 25 22 19 16 13 10 7 4 1
public class printNumbersSeries5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start= sc.nextInt();
        int end= sc.nextInt();
       // int arr[]=printNumbersSeries(start,end);
        for (int i=start; i>=end; i-=3)
            System.out.print(i+" ");

    }

    static int[] printNumbersSeries(int start, int end) {
        int arr[] = new int[end/3+1];
        for (int i = start; i <=end; i-=3) {
            arr[i] = i;
        }
        return arr;
    }

}
