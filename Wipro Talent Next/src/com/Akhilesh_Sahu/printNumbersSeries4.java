package com.Akhilesh_Sahu;

import java.util.Scanner;

public class printNumbersSeries4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start= sc.nextInt();
        int end= sc.nextInt();
     //   int arr[]=printNumbersSeries(start,end);
        for (int i=start; i>=end; i--)
            System.out.print(i+" ");

    }

    static int[] printNumbersSeries(int start, int end) {
        int arr[] = new int[end + 1];
        for (int i = end; i >= start; i--) {
            arr[i] = i;
        }
        return arr;
    }

}

