package com.String;

import java.util.Scanner;

 class PrintAllPermutationOfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ans=" ";
        printAllPermutationOfString(s,ans);

    }

     static void printAllPermutationOfString(String s, String ans) {

        if(s.length()==0) {
            System.out.print(ans + " ");
            return;
        }
         for (int i = 0; i <s.length() ; i++) {
             char ch=s.charAt(i);
             String left_substr=s.substring(0,i);
             String right_substr=s.substring(i+1);
             String res=left_substr+right_substr;
             printAllPermutationOfString(res,ans+ch);

         }
    }
}
