package com.company;
import java.util.*;
public class Main {
    public static int Sum(int n) {
       if (n == 1)
            return 1;
         else
         return (n+Sum(n-1));
       /*
        int sum = n * (n + 1) / 2;
        return sum;
        */
    }
    public static int Sum1(int a[],int n){
        int sum=0;
        for(int i=0; i<n; i++) {
            sum += a[i];
        }
        return sum;

    }

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int num=sc.nextInt();
	int a[]=new int[num];
        for(int i=0; i<n; i++)
            a[i]= sc.nextInt();
	int result=Sum(n);
	System.out.println(result);

        int result1=Sum1(a,n);
        System.out.println(result1);
    }
}
