package com.TNP;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();}
        rotate(arr,k);
    }

        public static void rotate(int[] a, int k) {
            int n=a.length;
            if(k>n)
            {
                k=k%n;
            }
            int temp[]=new int[n];
            for(int i=0;i<k;i++)
            {
                temp[i]=a[n-k+i];
                //temp[i]=a[j++];
            }
            int j=0;
            for(int i=k; i<n; i++){
                //   temp[i]=a[n-k+i];
                temp[i]=a[j++];
            }

            for(int i=0; i<n; i++)
            {
                System.out.print(temp[i]+" ");
            }
        }
    }

