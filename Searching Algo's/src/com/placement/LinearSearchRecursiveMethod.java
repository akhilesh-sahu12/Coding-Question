package com.placement;

public class LinearSearchRecursiveMethod {
    public static void main(String[] args) {
        String arr[]={"Akhilesh", "Sachin", "Pooja", "Khushboo","Rajneesh"};
        String search="Khushboo";
        int start=0;
        System.out.println(linearSearch(arr, search,start));
      linearSearch1(arr, search,start);
    }

    private static int linearSearch(String[] arr, String search,int start) {
        if(start>=arr.length) {
            return -1;
        }
        if(arr[start]==search) {
            return start;
        }
        return linearSearch(arr,search,start+1);
        //return start;
    }
    private static void linearSearch1(String[] arr, String search,int start) {
        if(start>=arr.length) {
            System.out.println(-1);
            return;
        }
        if(arr[start]==search) {
            System.out.println(start);
            return;
        }
        linearSearch1(arr,search,start+1);
        //return start;
    }
}
