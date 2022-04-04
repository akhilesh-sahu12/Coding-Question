package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0, min = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
       /* Arrays.sort(a);
        for(int i=0; i<n;i++)
        {
            min+=a[i];
            max+=a[i];

        }
        min=min-a[n-1];
        max=max-a[0];
        System.out.println(min+ " " +max);*/
      /*  for(int i=1; i<n;i++)
        {
            max+=a[i];
        }
        System.out.println(max);
*/
        MinMax_Sum(a, n);
    }
    static void  MinMax_Sum(int a[], int N) {
        int min=a[0];
        int max=a[0];
        int sum=0;

        if (N == 1)
            System.out.println(a[0]);
        else{
            for (int i=0; i<N; i++)
                if(a[i]<min)
                { sum+=a[i];
                    min=a[i];}
                else if(a[i]>max)
                {  sum+=a[i];
                    max=a[i];}
                else
                    sum+=a[i];

        }
        System.out.println((sum-max)+" "+(sum-min));

        

    }
}
