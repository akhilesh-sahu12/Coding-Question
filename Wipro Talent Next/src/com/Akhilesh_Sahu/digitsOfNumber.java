package com.Akhilesh_Sahu;

import java.util.Scanner;

public class digitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findDigit(n);
        findDigit1(n);
    }

    static void findDigit(int n) {
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            System.out.print(d+" ");

        }
        System.out.println();

    }

    static void findDigit1(int n) {
        if (n < 10)
            System.out.print(n+" ");
        else {
            int d = n % 10;

            findDigit1(n / 10);
            System.out.print(d+" ");
        }

    }
}