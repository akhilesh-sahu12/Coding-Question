package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n, m,i,j,flag,s;
        while (t-- > 0) {
            n = sc.nextInt();
            m = sc.nextInt();
            ArrayList<Integer>prime=new ArrayList< Integer>();
            for (i = n; i <= m; i++) {
                if (i == 1 || i == 0)
                    continue;
                flag = 1;

                for (j = 2; j <= i / 2; ++j) {
                    if (i % j == 0) {
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1)
                {

                    prime.add(i);
                }


            }
            s=prime.size();
            if(s==0) {
                System.out.println("-1");
            }
            else if(s==1){
                System.out.println("0");
        }
            else{
                int first=prime.get(0);
                int last=prime.get(prime.size()-1);
                System.out.println(last-first);

            }
    }
}}