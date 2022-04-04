package com.company;
import java.lang.Math;
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); //instead of nextLine()
        String arr[] = s.split(":");
        int hh = Integer.parseInt(arr[0]);
        int mm = Integer.parseInt(arr[1]);
        if (hh <= 12) {
            double t = (double) 2 * 30 * hh / 11;
            int tt = (int) Math.ceil(t);
            // System.out.println(t+" "+tt);
            int count = hh;

            if (hh == 00 && mm<=59) {
                System.out.print("1");
            } else if (hh == 12 && mm<=59) {
                System.out.print("12");
            } else if
            (mm >= tt) {
                count += 1;
            }
            System.out.print(count);
        } else {
            hh = hh - 12;
            double t = (double) 2 * 30 * hh / 11;
            int tt = (int) Math.ceil(t);
            // System.out.println(t+" "+tt);
            int count = hh -1;
            if (mm >= tt) {
                count += 1;
            }
            System.out.print(count + 12);
        }
    }
}




