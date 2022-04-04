package com.Placement;

import java.util.Scanner;

public class Main {
    public static int power(int n, int p){
        int mid;
        if(p==0)
            return 1;
        mid=power(n,p/2);
        if(p%2==0)
            return mid*mid;
        else
            return n*mid*mid;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	int n= sc.nextInt();
	int p= sc.nextInt();
	int result=power(n,p);
        System.out.println(result);
        System.out.println(Math.pow(n,p));
    }
}
