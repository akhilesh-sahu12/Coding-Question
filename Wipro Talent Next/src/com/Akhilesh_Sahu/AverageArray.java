package com.Akhilesh_Sahu;

import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={3,5,2,7,8,4,1,2,10,9};
        average(arr);
    }

    static void average(int[] arr) {
        int sum=0;
        for (int i = 0; i < arr.length ; i++) {
            sum+=arr[i];
        }
        float avg= (float)sum/arr.length;
        int lessThanAvg=0;
        System.out.println(avg);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<avg) {
                System.out.print(arr[i]+" ");
                lessThanAvg++;
            }

        }
        System.out.println();
        System.out.println(lessThanAvg);

    }
}
