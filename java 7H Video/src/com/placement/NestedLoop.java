package com.placement;

public class NestedLoop {
    public static void main(String[] args) {
        int row=5;
        int col=5;
        /*
A @ @ @ @
@ A @ @ @
@ @ A @ @
@ @ @ A @
@ @ @ @ A
         */
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < col; j++) {
                if(i==j)
                System.out.print("A ");
                else
                    System.out.print("@ ");
            }
            System.out.println();
        }

/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9 10
*/
        row=10;
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

/*
$ $ $ $
$     $
$     $
$ $ $ $
 */
        row=4;
        col=4;
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=col; j++) {
                if(i==1 || i==row)
                System.out.print("$ ");
                else
                    if(j==1 || j==col)
                        System.out.print("$ ");
                    else
                        System.out.print("  ");
            }
            System.out.println();
        }

/*
A
A B
A B C
A B C D
A B C D E
 */

        row=5;
       // char ch='A';
        int start=65;
        for (int i = 1; i <=row ; i++) {
            for (int j = start; j <start+i; j++) {
                System.out.print((char)j+" ");
            }
            System.out.println();
        }

    }
}
