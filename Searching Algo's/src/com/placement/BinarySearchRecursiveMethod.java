package com.placement;

public class BinarySearchRecursiveMethod {
    public static void main(String[] args) {
        int arr[]={1,7,88,98,876,9876};
        int search=2;
        int s=0;
        int e=arr.length-1;
        int mid=(s+e)/2;
        binarySearch(arr,search,s,e,mid);
        System.out.println(binarySearch1(arr,search,s,e,mid));

    }

    private static void binarySearch(int[] arr, int search, int s, int e, int mid) {
        if(s>e){
            System.out.println(-1);
            return;
        }
        if(arr[mid]==search) {
            System.out.println(mid);
            return;
        }
        else if(arr[mid]>search) {
            e=mid-1;
            mid=(s+e)/2;
            binarySearch(arr, search, s, e,mid );
        }
        else {
            s=mid+1;
            mid=(s+e)/2;
            binarySearch(arr, search, s, e, mid);
        }
    }
     static int binarySearch1(int[] arr, int search, int s, int e, int mid) {
        if(s>e){
            return -1;
        }
        if(arr[mid]==search) {
            return mid;
        }
        else if(arr[mid]>search) {
            e=mid-1;
            mid=(s+e)/2;
          return binarySearch1(arr, search, s, e,mid );
        }
        else {
            s=mid+1;
            mid=(s+e)/2;
            return binarySearch1(arr, search, s, e, mid);
        }
    }
}
