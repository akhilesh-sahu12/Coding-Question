package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t,sum=0;
        t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            while (n>0)
            {
               // sum=sum+(n%10);
              //  n=n/10;
                int d=n%10; sum=sum+d; n=n/10;

            }
            System.out.println(sum);

        }

    }
}
