package com.company;
import java.util.*;
public class Main {
    public static int removeStudents(int[] H, int N) {
        int count = 0;
        for(int i=0; i<N-1; i++) {
            int low=H[i];
            int high=H[i+1];
          //  System.out.println(low + " " + high + " " );

            if (low > high) {
                count++;

                System.out.println(count + " ");

            } else
                continue;
        }
        return count;
    }

    /*    for(int i=0; i<n; i++)
        {
            int a=H[0];
            if(a>H[i+1])
            {
                count+=1;
            }

*/


            public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int H[]=new int[n];
      for(int i=0;i<n;i++)
          H[i]=sc.nextInt();
      int result=removeStudents(H,n);
      System.out.println(result);



    }
}
