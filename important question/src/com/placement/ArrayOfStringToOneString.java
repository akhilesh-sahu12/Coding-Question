package com.placement;
import java.util.*;
/*Take an array of Strings input from the user & find the cumulative (combined)
length of all those strings.*/

public class ArrayOfStringToOneString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String arr[]=new String[n];
        for (int i = 0; i < n; i++) {
               arr[i]=sc.nextLine();
        }
        String combineString=combiningString(arr,n);
        System.out.println(combineString);
    }

    private static String combiningString(String[] arr, int n) {
     String res="";
        for (int i = 0; i <n; i++) {
            res+=arr[i];
        }
        return res;
    }
}
