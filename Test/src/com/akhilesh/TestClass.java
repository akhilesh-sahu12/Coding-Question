package com.akhilesh;

//import for Scanner and other utility classes
import java.util.*;
import java.lang.Math;

public class TestClass {
    public static void main(String args[] ) throws Exception {

        //Scanner
        Scanner s = new Scanner(System.in);
        int q=s.nextInt();
        while(q-->0){
            String str = s.next();                 // Reading input from STDIN
            String cip=s.next();
            System.out.println(check(str, cip));
        }
        // Write your code here

    }
    static int check(String str, String cip){
        int k=(str.charAt(0)-64)-(cip.charAt(0)-64);
        if(k>0){
            k=26-k;
        }
        for(int i=1; i<str.length(); i++){
            int t=(str.charAt(i)-64)-(cip.charAt(i)-64);
            if(t>0){
                t=26-t;
            }
            if(Math.abs(t)!=Math.abs(k)){
                return -1;
            }

        }
        return Math.abs(k);
    }
}
