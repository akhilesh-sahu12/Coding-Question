package com.Akhilesh_Sahu;

import java.util.Scanner;

public class checkNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int res = checkNumber(num1, num2);
        System.out.println(res);
    }

     static int checkNumber(int num1, int num2) {
        if(num1>num2)
            return num1;
        return num2;
     }
}
