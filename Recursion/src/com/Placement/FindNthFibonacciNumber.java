package com.Placement;
// fibonacci Series-> 0 1 1 2 3 5 8 13 21 34 55 89
//                 -> fib(1)=0
//                 -> fib(2)=1
//                 -> fib(3)=fib(1)+fib(2)
//                 -> fib(n)=fib(n-1)+fib(n-2)
//                             fib(5)
//                           /   +    \
//                      fib(4)         fib(3)
//                     /  +  \          /  + \
//                fib(3)     fib(2)  fib(2)   fib(1)
//               /  +  \    /  +  \     / + \
//           fib(2) fib(1) fib(1) fib(0)fib(1) fib(0)
//          / +  \
//      fib(1)   fib(0)
//***       ->Break it down into smaller problem
//          ->Identify if you can break down problem into smaller problems
//          ->Write the recurrence relation if needed
//          ->Draw the recursive tree
//  About the tree ->
//                 -> See the flow of function, how they are getting in stack
//                 -> identify and focused left tree calls and right tree calls
//                 -> Draw the tree and pointers again and again using pen & paper
//                 -> Use a debugger to see the flow
//          ->See how the value are returned at each step.
//          ->See where the function call will come out
//          ->And, You will come out of the value

public class FindNthFibonacciNumber {
    public static void main(String[] args) {
        int ans=fib(50);
        System.out.println(ans);
    }
    static int fib(int n){
        // base condition
        if(n<2)   //if(n==0 || n==1)
            return n;
        return fib(n-1)+fib(n-2);
    }
}
