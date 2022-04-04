package com.company;
import java.util.*;

public class Main {
    public static int fact(int n) {
        if (n == 0) //5*4*3*2*1=120 base condition
        //if (n == 0 || n == 1)// 5*4*3*2=120
            return 1;
        else
            System.out.print(n+" ");//5*4*3*2*1=120
            return (n * fact(n - 1));
    }

        public static int facti(int n){
        int facti=1;

        for (int i=1; i<=n; i++)
        {
            facti=facti*i;//1  2  6  24  120  720  5040
            System.out.print(facti+" ");

        }
        return facti;//5040


    }

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int result=fact(n);
	System.out.println(result);
            int result1=facti(n);
            System.out.println(result1);
    }
}
