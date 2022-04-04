package com.akhil;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            arr1[i]=sc.nextInt();
        }
        //Arrays.sort(arr);
        //Arrays.sort(arr1);
        maxProfit(n, arr, arr1,x,y);

    }

    private static void maxProfit(int n, int[] arr, int[] arr1,int x,int y) {
        int max=0;
       int i=0;
        while(x!=0 && y!=0 && i<n) {
            if(arr[i]>=arr1[i]){
                max+=arr[i];
                x--;
                i++;
            }
            else {
                max+=arr1[i];
                y--;
                i++;
            }
        }
        if(i<n){
            if(x==0){
                while(i<n){
                    max+=arr1[i];
                    i++;
                }
            }
            else{
                while(i<n){
                    max+=arr[i];
                    i++;
                }
            }
        }
        System.out.println(max);
    }
}

