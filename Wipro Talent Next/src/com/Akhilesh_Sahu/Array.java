package com.Akhilesh_Sahu;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        average(arr);
    }

        static void average(int[] arr) {
        int sum=0;
            for (int i = 0; i < arr.length ; i++) {
                sum+=arr[i];
            }
            System.out.println((float)sum/arr.length);

    }
}
