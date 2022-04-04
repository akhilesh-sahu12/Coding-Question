package com.Sorting;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	int n=sc.nextInt();
	int[] array=new int[n];
	for( int i=0; i<n; i++)
	    array[i]=sc.nextInt();
    insertionSort(array);
    for(int i:array){
		System.out.print(i+ " ");
	}

    }

	public static void insertionSort(int[] array) { //6 3 9 2 5 6
		for (int i = 0; i < array.length; i++) {//6
			int temp = array[i]; //temp=6
			System.out.println(temp);
			int j = i - 1;     // j=0-1=-1
			while (j >= 0 && array[j] > temp) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = temp;//

		}

	}}
