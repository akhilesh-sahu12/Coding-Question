package com.Akhilesh_Sahu;

import java.util.Scanner;
// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 ......
public class printNumbersSeries1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start= sc.nextInt();
        int end= sc.nextInt();
        int arr[]=printNumbersSeries(start,end);
        for (int i=start; i<=end; i++)
            System.out.print(i+" ");

    }

     static int[] printNumbersSeries(int start, int end) {
         int arr[] = new int[end + 1];
         for (int i = start; i <= end; i++) {
             arr[i] = i;
         }
         return arr;
     }

}
