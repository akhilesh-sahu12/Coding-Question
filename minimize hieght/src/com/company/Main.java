package com.company;
/*
Given heights of n towers and a value k. 
We need to either increase or decrease the 
height of every tower by k (only once) 
where k > 0. The task is to minimize the 
difference between the heights of the longest 
and the shortest tower after modifications and 
output this difference.

Input  : arr[] = {1, 15, 10}, k = 6
Output :  Maximum difference is 5.
Explanation : We change 1 to 7, 15 to 
9 and 10 to 4. Maximum difference is 5
(between 4 and 9). We can't get a lower
difference.

*/
import java.util.*;
public class Main {
       public static int getMinDiff(int[] arr, int n, int k) {
           Arrays.sort(arr);
           int ans=arr[n-1]-arr[0];
           int smallest=arr[0]+k;
           int largest=arr[n-1]-k;
           for(int i=0; i<n-1; i++)
           {
               int min=Math.min(smallest, arr[i+1]-k);
               int max=Math.max(largest, arr[i+1]+k);
               if(min<0)
                   continue;
              ans=Math.min(ans, max-min);
           }
           return ans;

       }
     /*      int result;
            for(int i=0; i<n; i++) {
                if (arr[i] - k >= 0)
                {
                    arr[i]-= k;
                }
                else {
                    arr[i] += k;
                }
                System.out.print(arr[i]+" ");
            }
               Arrays.sort(arr);
            System.arraycopy(arr, 0, arr, 0, n);
           for(int i=0; i<n; i++) {
               System.out.print(arr[i]+" ");

           }
           {
                result=( (arr[n-1])-(arr[0]));
            }
            return result;
    }
*/

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
    {
        int k=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0; i<n; i++)
            arr[i]=sc.nextInt();
        int result=getMinDiff(arr,n,k);
        System.out.println(result);
    }

    }
}
