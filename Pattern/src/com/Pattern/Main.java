package com.Pattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern6(n);
    }
    static void printPattern6(int n) {
        int i=1;
        for (int row = 0; row < 2 * n; row++) { //0 1 2 3 4 5 6 7 8 9
            int totalColsInRow=row>n?2*n-row:row;//0 1 2 3 4 ? 0 1 2 3 4:
            int noOfSpaces=n-totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col <totalColsInRow; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

          /*
          1
          1 2
          1 2 3
          1 2 3 4
          1 2 3 4 5
          1 2 3 4
          1 2 3
          1 2
          1
          */
    static void printPattern5(int n) {
        int i=1;
        for (int row = 0; row < 2 * n; row++) { //0 1 2 3 4 5 6 7 8 9
          int totalColsInRow=row>n?2*n-row:row;//0 1 2 3 4 ? 0 1 2 3 4:
                for (int col = 0; col <totalColsInRow; col++) {
                    System.out.print(col + " ");
                }
                System.out.println();
            }
    }
           /*
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
            1 2 3 4
            1 2 3
            1 2
            1
            */
    static void printPattern4(int n) {
        int i=1;
        for (int row = 1; row < 2 * n; row++) { //
            if (row <= n) {
                for (int col = 1; col <= row; col++) {
                    System.out.print(col + " ");
                }
                System.out.println();
            } else {
                for (int col = 1; col <=row-1-i; col++) {
                    System.out.print(col + " ");
                }
                i+=2;
                System.out.println();
            }
        }
    }
           /* 1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
            1 2 3 4 5 6
            1 2 3 4 5 6 7
            1 2 3 4 5 6 7 8
            1 2 3 4 5 6 7 8 9
            1 2 3 4 5 6 7 8 9 10*/

    static void printPattern1(int n) {
        for (int row = 1; row <= n; row++) { //
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    /*  1 2 3 4 5 6 7 8 9 10
        1 2 3 4 5 6 7 8 9 10
        1 2 3 4 5 6 7 8 9 10
        1 2 3 4 5 6 7 8 9 10
        1 2 3 4 5 6 7 8 9 10
        1 2 3 4 5 6 7 8 9 10
        1 2 3 4 5 6 7 8 9 10
        1 2 3 4 5 6 7 8 9 10
        1 2 3 4 5 6 7 8 9 10
        1 2 3 4 5 6 7 8 9 10
        */

    static void printPattern2(int n) {
        for (int row = 1; row <= n; row++) { //
            for (int col = 1; col <= n; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

 /* @ @ @ @ @ @ @ @ @ @
    @ @ @ @ @ @ @ @ @
    @ @ @ @ @ @ @ @
    @ @ @ @ @ @ @
    @ @ @ @ @ @
    @ @ @ @ @
    @ @ @ @
    @ @ @
    @ @
    @
    */
     static void printPattern3(int n){
        for (int row = 1; row <= n; row++) { //
            for (int col = 1; col <= n - row+1; col++) {// if row start from 0 then col<=n-row
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}

