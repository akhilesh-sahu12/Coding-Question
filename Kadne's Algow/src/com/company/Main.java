package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a[] = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = sc.nextInt();
        }
        int result = maxSum(a);
        System.out.println(result);

    }

    static int maxSum(int a[]) {
        int max_Sum=Integer.MIN_VALUE;
        int cur_Sum = 0;
        for (int i = 0; i < a.length; i++) {
            cur_Sum = cur_Sum + a[i];
            if (cur_Sum > max_Sum) {
                max_Sum = cur_Sum;
            }
            if (cur_Sum < 0)
                cur_Sum = 0;
        }

        return max_Sum;
    }
}