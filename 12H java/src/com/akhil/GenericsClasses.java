package com.akhil;

import java.util.ArrayList;

public class GenericsClasses {
    public static void main(String[] args) {
        /*MyIntegerClass my1 = new MyIntegerClass(1);
        MyDoubleClass my2 = new MyDoubleClass(2.7);
        MyCharacterClass my3 = new MyCharacterClass('A');
        MyStringClass my4 = new MyStringClass("Akhilesh Sahu");*/
        MyGenericClass<Integer> my1 = new MyGenericClass<>(1);
        MyGenericClass<Double> my2 = new MyGenericClass<>(2.7);
        MyGenericClass<Character> my3 = new MyGenericClass<>('A');
        MyGenericClass<String> my4 = new MyGenericClass<>("Akhilesh Sahu");

        System.out.println(my1.getValue1());
        System.out.println(my2.getValue1());
        System.out.println(my3.getValue1());
        System.out.println(my4.getValue1());

    }
}