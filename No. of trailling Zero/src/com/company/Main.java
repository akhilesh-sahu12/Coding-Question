package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result =traillingzeros(n);
        System.out.println(result);
    }

    static int traillingzeros(int n) {
            int res = 0;
            for (int i = 5; i <= n; i = i * 5) {
                res = res + n / i;
            }
            return res;
        }
    }

