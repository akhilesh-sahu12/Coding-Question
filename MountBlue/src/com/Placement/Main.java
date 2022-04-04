package com.Placement;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static int maxStrength(int n) {
        int count = 1;
        int sum = 0;
        boolean stop = true;
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while (stop) {
           /* if (n < 10) {
                int res = fact(n);
              //  System.out.println(res);
                if (list.contains(res)) {
                  //  System.out.println("dupli");
                    stop = false;
                } else {
                    n = sum;
                    list.add(res);
                  //  System.out.println(list);
                    count++;
                }
            }
            else {*/
                while (n > 0) {
                    int d = n % 10;
                    int res = fact(d);
                    sum = sum + res;
                    System.out.println(sum);
                    n = n / 10;
                }
            if (list.contains(sum)) {
                System.out.println("h");
                stop = false;
            }
            else {
                n = sum;
                list.add(sum);
                count++;

            }

        //    }

        }
        System.out.println(list);
        return count;
    }

    static int fact(int m) {
        if (m<=1)
            return 1;
        return (m * fact(m - 1));
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int result=maxStrength(n);
        System.out.println(result);

    }
}
