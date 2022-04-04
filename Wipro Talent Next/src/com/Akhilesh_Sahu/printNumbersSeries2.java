package com.Akhilesh_Sahu;

import java.util.Scanner;
//1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 51 ......
public class printNumbersSeries2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int start= sc.nextInt();
        int start=1;
      //  int end= sc.nextInt();
        int end=99;
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
