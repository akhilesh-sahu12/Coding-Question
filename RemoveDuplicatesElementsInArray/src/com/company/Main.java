package com.company;

import java.util.*;
public class Main
 {
    public static int removeDuplicates(int[] arr) {
        if(arr.length<2)
            return arr.length;
        int j=1;//arr[j=0]=arr[i=0];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[j++]=arr[i+1];// arr[j=1]=arr[i=1];if element are not duplicate
            }
        }
        return j;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
            arr[i]=sc.nextInt();
        int res=removeDuplicates(arr) ;
        for(int i=0; i<res; i++)
            System.out.print(arr[i]+" ");
    }
}