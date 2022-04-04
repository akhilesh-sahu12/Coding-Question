package com.placement;

public class Iteration {
    public static void main(String[] args) {

        /*System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");*/
        // loop-:  while, do while, for, for each
        int i=1;
        while (i<=5){
            System.out.println(i);
            i++;
        }

        int m = 99;
        do {
            System.out.println("hello");
        } while (m <= 5);

        for (int j = 0; j < 99; j++) {
            System.out.print(j+", ");

        }

        System.out.println();
        int arr[]={0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int d:arr) {
            System.out.print(d+", ");
        }
    }
}
