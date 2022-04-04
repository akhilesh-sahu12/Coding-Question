package com.company;

import java.util.*;
class ArrayTest {

    public static void insert(char[] ar, int pos) {
        //Traversing the array from the last position to the position where the element has to be inserted
        char item = 'A';
        for (int i = ar.length - 1; i >= pos; i--) {
            //Moving each element one position to its right
            ar[i] = ar[i - 1];
        }

        //Inserting the data at the specified position
        ar[pos - 1] = item;
    }
}

    class Main {

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);

            // int n=sc.nextInt();
            // String s=sc.next();
            //   char[] ch=s.toCharArray();

            String s1 = sc.nextLine();
            char arr[] = s1.toCharArray();
	/*	arr[0]='A';
		arr[1]='B';
		arr[2]='C';
		arr[3]='D';
		arr[4]='E'; */
            for (int i = 0; i < arr.length; i++)


                //Make changes and try to insert elements at different positions
                ArrayTest.insert(arr, 6);
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i]);
        }

    }
