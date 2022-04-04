package com.akhilesh;
import java.util.*;
// Stack -: LIFO
//        -: plate of buffer
//        -: 1 2 3 4 5 6 ->6 
//        -: 

public class Stacks {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        Stack<Integer>stack = new Stack<>();
        stack.push(6);
        stack.push(9);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
        stack.push(10);
        stack.push(945);
        stack.push(7898);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.toString());


    }
}
