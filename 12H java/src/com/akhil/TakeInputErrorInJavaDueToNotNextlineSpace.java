package com.akhil;

import java.util.Scanner;

public class TakeInputErrorInJavaDueToNotNextlineSpace {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
         System.out.println("What is your name");
    String name = sc.nextLine();
         System.out.println("How old are you");
    int age = sc.nextInt();
           sc.nextLine();// because not take user input of next line.
         System.out.println("What is your favorite food");
    String food = sc.nextLine();
         System.out.println("Your name is "+name +" "+"your are "+age+" years old "+"you like "+food);
}
}
