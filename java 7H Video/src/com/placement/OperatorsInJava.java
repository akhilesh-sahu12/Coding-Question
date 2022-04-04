package com.placement;

class OperatorsInJava {
    public static void main(String[] args) {
        // Operators-: Arithmetic +,-,*,/,%
        //             Bitwise << >>
        //             Relational
        //             Logical- || &&
        //             Increment & Decrement
        int a=9;
        int b=7;
        char arr[]={'+','-','*','/','%'};
        for (char ch:arr) {
            int res=(int)ch;
            System.out.println(res);
        }
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println((float) a/b);
        System.out.println((double) a/b);


    }
}
