package com.Akhilesh_Sahu;

import java.util.Scanner;

public class SumLastDigitNumbers {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int res = sum(num1, num2);
    System.out.println(res);
}
    static int sum(int num1, int num2) {
        return Math.abs(num1%10)+Math.abs(num2%10);
    }



}
