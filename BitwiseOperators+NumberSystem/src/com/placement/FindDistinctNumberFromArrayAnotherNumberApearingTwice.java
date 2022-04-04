package com.placement;

public class FindDistinctNumberFromArrayAnotherNumberApearingTwice {
    public static void main(String[] args) {
        int arr[]={1,5,6,3,6,1,8,3,8};
        findDistinctNumberFromArrayAnotherNumberApearingTwice(arr);
    }

    private static void findDistinctNumberFromArrayAnotherNumberApearingTwice(int[] arr) {
        int distinctNum=0;
        for (int i = 0; i < arr.length; i++) {// X-OR all the arr
            distinctNum^=arr[i];
        }
        System.out.println(distinctNum);
    }
}
