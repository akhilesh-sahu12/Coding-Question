package com.company;
import java.util.*;
public class Main{
    static void minIndexes(int[] arr, int[] qrr, int n,int q) {
        for(int i = 0 ; i<q;i++) {

            boolean is = false;

            for(int j=qrr[i] ; j<n ; j++) {

                if(arr[qrr[i] - 1] < arr[j] && (sumofdigits(arr[j])<sumofdigits(arr[qrr[i]-1]))) {

                    System.out.println(j+1);

                    is = true;

                    break;
                }
            }
            if(is == false) System.out.println(-1);

        }

    }

    static int sumofdigits(int num) {

        int sum =0;

        while(num!=0) {

            int digit = num%10;

            sum+= digit;

            num/=10;

        }

        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] qrr = new int[q];
        for (int j = 0; j < q; j++) {
            qrr[j] = sc.nextInt();
        }
        minIndexes(arr, qrr, n, q);

    }
}
