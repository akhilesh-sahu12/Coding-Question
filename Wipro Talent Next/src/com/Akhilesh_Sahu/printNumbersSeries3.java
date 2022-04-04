package com.Akhilesh_Sahu;

import java.util.Scanner;

public class printNumbersSeries3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int start= sc.nextInt();
        int start=0;
        //  int end= sc.nextInt();
        int end=100;
        int arr[]=printNumbersSeries(start,end);
        for (int i=start; i<=end; i+=2)
            System.out.print(i+" ");

    }

    static int[] printNumbersSeries(int start, int end) {
        int arr[] = new int[end + 1];
        for (int i = start; i <= end; i+=2) {
            arr[i] = i;
        }
        return arr;
    }

}

