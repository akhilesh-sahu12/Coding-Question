package com.company;
import java.util.Scanner;
public class Main {
    public static int linear_search(int arr[],int n,int x){
        for(int i=0; i<n; i++)
        {
            if(arr[i]==x)
                return i;
        }
                return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0; i<n; i++)
	    a[i]=sc.nextInt();
	    int x=sc.nextInt();
	    int index=linear_search(a,n,x);
	    if(index==-1)
        {
            System.out.println("element not present in the array");
        }
	    else
            System.out.println(x+ " present in index " +(index+1));

    }
}
