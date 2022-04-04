package com.akhil;

public class SuperKeyWord {
    public static void main(String[] args) {
        // super = keyword refers to the superclass (parent) of an object
        //         very similar to the "this" keyword

        Hero hero=new Hero("Batman",42,"$$");
        Hero hero2=new Hero("Superman",43,"Everything");

        System.out.println(hero2.toString());
        System.out.println(hero.name);
        System.out.println(hero.age);
        System.out.println(hero.power);


    }
}
