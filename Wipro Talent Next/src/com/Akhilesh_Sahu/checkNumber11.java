package com.Akhilesh_Sahu;

import java.util.Scanner;

public class checkNumber11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int res=checkNumber(num);
        System.out.println(res);
    }

    static int checkNumber(int num) {
        if(num%2==0)
            return 2;
        return 1;
    }
}

