package com.company;
import java.util.*;
public class Main {
     static void findMissing(int arr[],int n){
         int sum=0;
         for (int i=0;i<n-1; i++){
             sum^=arr[i];}
         for (int i=1;i<=n;i++){
             sum^=i;
     }
     System.out.println(sum);}
      /*   int sum=0;
         int min=arr[0];
         int max=arr[0];
         for (int i=0;i<n-1; i++){
             sum+=arr[i];
           //  if(arr[i]>max)
           //      max=arr[i];
             if(arr[i]<min)
                 min=arr[i];
         }
         int sum1=(n*(2*min+(n-1)))/2;

         System.out.println(sum1-sum);

     }*/
         
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        findMissing(arr,n);
    }
}