package com.akhilesh;

public class StackMain {
    public static void main(String[] args) throws StackException {
        //Stack stack=new CustomStack(5);
        DynamicStack stack=new DynamicStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(6);
        stack.push(6);
        stack.push(6);
        stack.push(6);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}