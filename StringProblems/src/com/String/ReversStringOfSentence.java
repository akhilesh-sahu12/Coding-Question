package com.String;

import java.util.Scanner;

public class ReversStringOfSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        reversStringOfSentence(arr);
    }

     static void reversStringOfSentence(String[] arr) {
         for (int i = 0; i < arr.length; i++) {
             char[] str=arr[i].toCharArray();
             for (int j = str.length-1; j >=0; j--) {
                 System.out.print(str[j]);
             }
             System.out.print(" ");

             }
         }
    }
