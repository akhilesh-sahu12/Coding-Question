package com.Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        bubbleSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    public static void bubbleSort(int[] array) { //6 3 9 2 5 6
        boolean swapped;
        for (int i = 0; i < array.length; i++) {
            swapped=false;
            for (int j = 1; j <= array.length - i -1; j++) {
                if (array[j] < array[j - 1]) {
                    int temp=array[j];
                   array[j]=array[j-1];
                   array[j-1]=temp;
                   swapped=true;
                }

            }
            // if you did not
            if(!swapped){
                break;
            }

        }
    }

}


