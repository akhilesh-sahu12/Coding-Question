package com.Akhilesh_Sahu;

public class ReverseTheArray {
    public static void main(String[] args) {
        int[] arr={2,76,44,3,5,6,45,65,332,1};
        reverseTheArray(arr);
    }

     static void reverseTheArray(int[] arr) {
        int i=0;
        int j=arr.length-1;
         for (i=0; i< arr.length/2; i++){
             int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
             j--;

         }
         for (int k:arr) {
             System.out.print(k+" ");
         }

    }
}
