package com.akhil;

import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        // ArrayList-: Dynamic memory allocation
        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("hamburger");//add element in end of the list
        food.add("Noodles");
        food.add("chicken biryani");
        food.add("Chocolate");
        food.add(1,"Rice");// add element specific position
        System.out.println(food);
        food.set(0, "sushi");// add element specific position
        food.remove("Noodles");// remove specific position element
        food.remove(2);// remove specific position element
        food.remove("chicken biryani");
        //food.clear();// remove all elements in ArrayList
        int len = food.size();// size of list
        for (int i = 0; i < food.size(); i++) {// traverse the list through for loop
            System.out.println(food.get(i));
        }
    }
    }
