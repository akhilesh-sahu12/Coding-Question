package com.company;
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int d, sum=0, num=0,count =1,c=2;
        while(t-->0) {
            int n = sc.nextInt();
            int m = n;
            if (n == 1 || n == 2) {
                System.out.print("12");
            }
            else if (num %3==0) {
                System.out.print(n);
            }
            else {
                while (m > 0) {
                    d = m % 10;
                    sum = sum + d;
                    count *= 10;
                    c *= 10;

                    m = m / 10;
                }
            }
            ) {

                System.out.println(n + count);
            }
            else
                {
                    System.out.println(n + c);
                }
        }
        }
    }










