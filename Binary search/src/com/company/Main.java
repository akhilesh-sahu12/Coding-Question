package com.company;
import java.util.*;


public class Main {
    public static int binarysearch(int[] a, int x) {
        int first = 0;
        int last = a.length - 1;
        int mid;

        while (first <= last) {
            mid = (first + last) / 2;

            if (a[mid] == x)
                return mid;
             else if (a[mid] < x)
                first = mid + 1;
             else
                last = mid - 1;


        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr = new int[n1];
        for (int i = 0; i < n1; i++)
            arr[i] = sc.nextInt();
        int x1 = sc.nextInt();
    /*    Arrays.sort(arr);  //if array is not sort then not applicable binary search
        System.arraycopy(arr, 0, arr, 0, n1);
         for(int j=0; j<n1; j++)
         System.out.print(arr[j]+" ");*/
        //  int f = 0;
        //  int l = n1 - 1;
        //   int m = (f + l) / 2;
        int result = binarysearch(arr, x1);
        if (result == -1)
            System.out.print("Element not present in the array");
        else
            System.out.print(result);

    }
}

 /*
import java.util.Scanner;

import static java.lang.System.*;

public class Main
{
    public static void main(String args[])
    {
        int c, num, item, first, last;
        Scanner x = new Scanner(in);
        out.println("Enter number of elements:");
        num = x.nextInt();


        int array []= new int[num];
        out.println("Enter the all elements");
        for (c = 0; c<num; c++)
            array[c] = x.nextInt();

        out.println("Enter the search value:");
        item = x.nextInt();
     //   Arrays.sort(array);
      //  System.arraycopy(array,0,array,0,num);
        first = 0;
        last = num - 1;
        int middle = (first + last)/2;

        while( first <= last )
        {
            if ( array[middle] < item )
                first = middle + 1;
            else if ( array[middle] == item )
            {
                out.println(item + " found at location " + middle  + ".");
                break;
            }
            else
            {
                last = middle - 1;
            }
            middle = (first + last)/2;
        }
        if ( first > last )
            out.println(item + " is not found.\n");
    }
}*/