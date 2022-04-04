package com.akhil;

import java.util.*;
public class Main{
    public static int findThreeDigitOddNumber(int num) {
        int arr[] = new int[100];
        int count = 0;
        int temp = 0;
        while (num >= 100)   //6478434
        {
            int rem = num % 1000; //434>843>784>478>647
          //  System.out.println(rem);
            arr[count] = rem;
           // System.out.println(arr[count]);
            count++;

            num = num / 10;
           // System.out.println(num);
        }
        int i;
        for (i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j] && arr[i] % 2 == 1) {
                    temp = arr[i];
                 //   System.out.println(temp);
                    arr[i] = arr[j];
                 //   System.out.println(arr[i]);
                    arr[j] = temp;
                 //   System.out.println(arr[j]);
                }
            }
        }

     //  System.out.println(arr[arr.length-1]);
        return arr[arr.length - 1];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int num=sc.nextInt();
            int res=findThreeDigitOddNumber(num);
            System.out.println(res);
        }
    }

}



