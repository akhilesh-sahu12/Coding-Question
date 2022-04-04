package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++)
            a[i]=sc.nextInt();
        int start=0;
        int end=n-1;
      //  for (int i=0;i<=n;i++)
            while(start<=end)
            {   int temp;
                temp=a[start];
                a[start]=a[end];
                a[end]=temp;
                start++;
                end--;
            }
        for (int i=0;i<n;i++)

            System.out.print(a[i]+" ");


    }
}
