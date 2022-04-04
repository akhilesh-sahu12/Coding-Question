package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n;
        while(t-->0){
            n= sc.nextInt();
        }
        boolean[] a=seiveoferatosthenes(n);
        for(int i=0; i<=n; i++)
        {
          //  System.out.println(i+" "+ a[i]);
            if(a[i]==true)
            {
                System.out.print(i+" ");
            }
        }
    }

    private static boolean[] seiveoferatosthenes(int n) {
        boolean[] a=new boolean[n+1];
        Arrays.fill(a,true);
        a[0]=false;
        a[1]=false;
        for(int i=2; i*i<=n; i++){
            for(int j=2*i; j<=n; j+=i)
            {
                a[j]=false;
            }
        }
        return a;

    }
}
