package com.Placement;

import java.util.Scanner;

public class Main {


	public static int[] insert(int arr[], int position, int item ){
        for(int i= arr.length-1; i>position;i--){
            arr[i]=arr[i-1];

        }
        arr[position-1]=item;
        return arr;
    }
    public static int[] delete(int arr[],int position){
		for(int i=position-1; i< arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=0;
		return arr;
	}



    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[10];
	    arr[0]=10;
		arr[1]=10;
		arr[2]=10;
		arr[3]=10;
		arr[4]=10;
		Main.insert(arr,3,5);
		Main.delete(arr, 1);
		Main.delete(arr, 5);
		Main.delete(arr, 7);
		Main.insert(arr,3,67);
		Main.insert(arr,3,6455);
		Main.insert(arr,9,67);





		for(int i=0;i< arr.length;i++) {
			System.out.println(arr[i]);
		}
    }
}
