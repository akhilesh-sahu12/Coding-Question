package com.akhilesh;
import java.util.*;
 class BadDay{
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int m=sc.nextInt();
         int n= sc.nextInt();
         int arr[]=new int[3*(m+1)];
         int ind=0;
         int count=0;
         for(int i=0; i<=m; i++) {
             for (int j = 0; j <3; j++) {
                 arr[ind] = i;
                 ind++;
             }
                     }
                     for (int i = 0; i<3*(m+1)-2; i+=3) {
                         for (int j = i+1; j < 3*(m+1)-1; j+=3) {
                             for (int k = j+1; k < 3*(m+1); k+=3) {
                                 if(arr[i]+arr[j]+arr[k]==n){
                                     System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                                     if(arr[i]!=arr[j] && arr[i]!=arr[k] && arr[j]!=arr[k])
                                     count+=6;
                                     else if (arr[i]==arr[j] && arr[j]!=arr[k] || arr[i]==arr[k] && arr[j]!=arr[k] || arr[j]==arr[k] && arr[i]!=arr[k]){
                                         count+=3;
                                     }
                                     else{
                                         count++;
                                     }
                     }
                 }
             }
         }
         System.out.println(count);

     }
 }