package com.Akhilesh_Sahu;

import java.util.Scanner;

public class SmallestExactDivisor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        SmallestExactDivisor1(num);
    }

     static void SmallestExactDivisor1(int num) {
        if(num==1)
            System.out.println(num);
        else {
            boolean check=true;
            for (int i = 2; i * i < num; i++) {
                if (num % i == 0) {
                    System.out.println(i);
                    check=false;
                    break;
                }
            }
            if(check) {
                System.out.println(num);
            }
        }
    }
}
