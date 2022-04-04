package com.placement;
/*
 Linear Search: It is a Sequential search. We compare all element one by one until end of data collection.
          if element equal to search element we return that element index.
          else we return element not found.
 */

public class LinearSearchIterativeMethod {
    public static void main(String[] args){
        int arr[]={4,87,8,987,69,98};
        int search=6;
        linearSearch(arr, search);
        linearSearch1(arr,search);
        System.out.println(linearSearch2(arr, search));
    }

    private static void linearSearch(int[] arr, int search) {
        boolean flag=true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==search) {
                flag=false;
                System.out.println(i);

            }
        }
        if(flag)
        System.out.println("Element not found");
    }
    private static void linearSearch1(int[] arr, int search) {

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==search) {
                System.out.println(i);
              return;
            }
        }
            System.out.println("Element not found");
    }
    private static int linearSearch2(int[] arr, int search) {

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==search) {
                return i;
            }
        }
        return -1;
    }
}
