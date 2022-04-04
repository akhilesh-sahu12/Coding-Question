package com.Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        selectionSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    public static void selectionSort(int[] array) { //6 3 9 2 5 6
        for (int i = 0; i < array.length -1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length ; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;

            }
        }
    }
}
