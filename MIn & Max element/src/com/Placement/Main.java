package com.Placement;

public class Main {

    public static void main(String[] args) {
		int arr[] = {3, 3, 3, 3, 3, 3, 3, 3, 3,6,6,6,};
		minMax(arr);
	}
	static void minMax(int arr[]){
		int min =arr[0] ;
		int max = arr[0];
		if (arr.length == 1) {

			System.out.println(min + " " + max);
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < min)
					min = arr[i];
				else if(arr[i]>max)
					max = arr[i];
				else
					continue;
			}
			System.out.println(min + " " + max);

		}
	}
}
