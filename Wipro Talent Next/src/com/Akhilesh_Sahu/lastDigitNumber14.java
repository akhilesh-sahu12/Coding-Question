package com.Akhilesh_Sahu;

import java.util.Scanner;

public class lastDigitNumber14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int res=lastDigitNumber(num);
        System.out.println(res);
    }

    static int lastDigitNumber(int num) {
        int d=num%10;
        num=num/10;
        return (num%10);

    }

}
