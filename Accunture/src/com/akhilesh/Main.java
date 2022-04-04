package com.akhilesh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PerformOperation obj1=new PerformOperation();
        System.out.println(obj1.operationsBinaryString("1C0C1C1A0B1"));
        System.out.println(obj1.operationsBinaryString1("1C0C1C1A0B1"));
        System.out.println(obj1.operationsBinaryString("0C1A1B1C1C1B0A0"));
        System.out.println(obj1.operationsBinaryString1("0C1A1B1C1C1B0A0"));

	// write your code here
     /*
     * Input:
             r: 7
             unit: 2
             n: 8
             arr: 2 8 3 5 7 4 1 2
             */
        Scanner sc=new Scanner(System.in);

        int r= sc.nextInt();
        int unit= sc.nextInt();
        int n= sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println(sum(r, unit, n, arr));
    }

    private static int sum(int r, int unit, int n, int[] arr) {
        if (n == 0)
            return -1;
        int sum=0;
        int count=0;
        int req=r*unit;
        int i=0;
        while(sum<req && i< arr.length){
            sum+=arr[i];
            count++;
            i++;
        }
        if(sum>=req){
            return count;
        }
        return 0;
    }
}
