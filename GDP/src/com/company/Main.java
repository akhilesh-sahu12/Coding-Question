package com.company;
import java.util.*;
public class Main {
    public static int GDC(int a, int b) {
        if (b == 0)
            return a;
        else
         return GDC(b,a%b);
    }

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in) ;
     int a=sc.nextInt();
     int b=sc.nextInt();
     int result=GDC(a,b);
     System.out.println(result);
    }}
