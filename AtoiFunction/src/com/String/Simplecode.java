package com.String;

import java.util.Scanner;
public class Simplecode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int len=s.length();
        int res=0;
        atoiFun(s,res,0,len);

    }

    static void atoiFun(String s,int res ,int ind, int len){
        // int res1=0;
        //base case
        if (ind == len){
            if(s.charAt(0)=='-')
                System.out.println(res*-1);
            else System.out.println(res);
            return;
           }
        if (s.charAt(ind) >= '0' && s.charAt(ind) <= '9') {
            res = (s.charAt(ind) - '0' + (res * 10));

        }
        // System.out.println(res);

        atoiFun(s, res,ind + 1, len);

    }

}
