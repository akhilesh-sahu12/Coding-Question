package com.Placement;
// Recursion             -> Function calling itself.
// Why Recursion ?       -> It help us in solving bigger/complex problem in a simple way.
//                       -> You can convert recursion solution into iteration & vice versa.
// When Use Recursion -> It helps in breaking down bigger problem into smaller problems.
// Base condition in Recursion -> Condition where are recursion will stop making new calling
//      No base condition =   1 ->  function calls will keep happening
//                            2 -> Stack filled again and again
//                            3 -> Every call of function will take some memory
//                          = Memory of Computer will exceed the limit -> stack
//                          -> StackOverFlow
// *** we will visualise recursion through Recursion Tree.
// Disadvantage -> Space Complexity is not constant because of recursive calls.
import java.util.*;
public class PrintNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printNumber(n);
        printNumber2(n);
        printNumber1(1);
    }

    private static void printNumber(int n) {
        if(n==1) {
            System.out.println(n);// 1
            return;
        }
       // System.out.println(n);// 5 4 3 2
        printNumber(n-1);
        System.out.println(n);// 2 3 4 5
    }

    static void printNumber1(int n) {
        if(n==5) {
            System.out.println(n);// 5
            return;
        }
       // System.out.println(n);// 1 2 3 4
        // this is tail recursion
        // this is the last function calls
        printNumber1(n+1);
       System.out.println(n);// 4 3 2 1
    }
    static void printNumber2(int n){
        if(n==0)
            return ;
        printNumber2(n-1);// 1 2 3 4 5
        System.out.print(n+" ");
        // a(n-1);//5 4 3 2 1
    }
}
