package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++)
            a[i]=sc.nextInt();
        int q=sc.nextInt();
        Arrays.sort(a);
        for(int i=0; i<q; i++)
        {
            int c=0,d=0;
            int pow=sc.nextInt();
            for (int j=0; j<n; j++)
                if(a[j]<=pow) {
                    c+= 1;
                    d+=a[j] ;
                }
                else
                    break;
            System.out.println(c+" "+d);

        }

    }
}
