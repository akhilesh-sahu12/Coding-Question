package com.Sorting;

import java.util.*;
class CyclicSort{
  public static void main(String args[]){
   int arr[]={1,3,2,5,4,7,9,8,6};
   cyclicSort(arr);
  System.out.print(Arrays.toString(arr));
   }
   static void cyclicSort(int arr[]){
     for(int i=0; i<arr.length; i++){
       if(arr[i]-1==i)
         {
           i++;
         }
         else
         swap(arr, i,arr[i]-1);
       
     }
     
   }
   static void swap(int arr[], int first, int last){
     int temp=arr[first];
     arr[first]=arr[last];
     arr[last]=temp;
     
   }
 }
 //[1, 2, 3, 4, 5, 7, 6, 8, 9]