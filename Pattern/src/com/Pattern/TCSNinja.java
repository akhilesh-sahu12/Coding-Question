package com.Pattern;
import java.util.*;
public class TCSNinja {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();

        }
        sol(arr,n);
    }

    private static void sol(int[] arr, int n) {
        // 12 3 5 0 6 3 0 6
        // 12 3 5 0 6 6 0 0
        // 12 3 5 6 3 6 0 0
       /* int count=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]==0)
                count++;
        }*/
        int temp[]=new  int[n];
        int j=0;
        for (int i = 0; i <n; i++) {
            if(arr[i]!=0) {
                temp[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
