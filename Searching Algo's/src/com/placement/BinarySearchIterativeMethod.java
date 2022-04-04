package com.placement;
/*
 Binary Search: also known as half interval search.
                data collection should be sorted than apply binary search.

                In binary search, we compare mid element of collection
                mid=(start+end)/2
                if element==search
                  return mid;

                if mid element is greater than the search element then the search element sub-array
                to the left of the mid element
                else if element>search
                   end=mid-1

                if mid element is less than the search element then the search element sub-array
                to the right of the mid element
                else
                   start=mid+1

                if element not found we return -1

 */

public class BinarySearchIterativeMethod {
    public static void main(String[] args) {
        int arr[]={1,2,6,8,44,65};
        int search=65;
        binarySearch(arr, search);
        System.out.println(binarySearch1(arr, search));
    }

    private static void binarySearch(int[] arr, int search) {
        int s=0;
        int e=arr.length-1;
        int mid=0;
        while (s<=e){
           mid=(s+e)/2;
           if(arr[mid]==search){
               System.out.println(mid);
               return;
           }
           else if(arr[mid]>search)
               e=mid-1;
           else
               s=mid+1;
        }
        System.out.println(-1);
    }
    private static int binarySearch1(int[] arr, int search) {
        int s=0;
        int e=arr.length-1;
        int mid=0;
        while (s<=e){
            mid=(s+e)/2;
            if(arr[mid]==search){
                return mid;
            }
            else if(arr[mid]>search)
                e=mid-1;
            else
                s=mid+1;
        }
        return -1;
    }
}
