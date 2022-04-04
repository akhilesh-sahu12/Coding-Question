package com.Sorting;

import java.util.*;

public class MissingAllElement {
    public static void main(String args[]){
        int arr[]={1,3,2,5,2,7,3,8,6};
        System.out.println(cyclicSort(arr));
        System.out.print(Arrays.toString(arr));
    }
    static List<Integer> cyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
                int correct = arr[i] -1;
                if(arr[i] > 0 && arr[i] <arr.length && arr[correct] != arr[i]){
                    swap(arr, correct, i);
                }
                else{
                    i++;
                }
            }
        List<Integer>list=new ArrayList<>();
            for(int j = 0; j < arr.length; j++){
                if (arr[j] != j +1){
                   list.add(j+1);
                }
            }
            return list ;
        }
    static void swap(int arr[], int first, int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;

    }
}
