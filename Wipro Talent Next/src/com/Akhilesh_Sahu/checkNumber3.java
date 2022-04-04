package com.Akhilesh_Sahu;

import java.util.Scanner;

public class checkNumber3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String res=checkNumber(num);
        System.out.println(res);
    }

    static String checkNumber(int num) {
        if(num%2==0)
            return "EVEN";
        return "ODD";
    }


}
