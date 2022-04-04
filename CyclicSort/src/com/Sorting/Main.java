package com.Sorting;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int arr[]={0,3,1,2,4};
        int res=cyclicSort(arr);
        System.out.println (res);

    }
    static int cyclicSort(int nums[]){
        for(int i=0; i<nums.length; i++){
            if(nums[i]< nums.length && nums[i]!=i)
            {
                swap(nums, i,nums[i]);
            }
            else
                i++;

        }
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length;i++) {
            if (nums[i] != i)
                return i;
        }
            return nums.length;

    }
    static void swap(int arr[], int first, int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;

    }
}
