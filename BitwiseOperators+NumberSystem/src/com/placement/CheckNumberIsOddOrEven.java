package com.placement;
import java.util.*;
public class CheckNumberIsOddOrEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        checkNumberIsOddOrEven(n);
        System.out.println(isOdd(n));
    }

    private static void checkNumberIsOddOrEven(int n) {
     /*   if((n&1)==0)// 8->1000&1=0000
            System.out.println("Even");
        else //if(n&1==1)
            System.out.println("odd");*/
        System.out.println((n & 1) == 0 ? "Even" : "odd");
    }
    static boolean isOdd(int n){
        return (n&1)==1;
    }
}
