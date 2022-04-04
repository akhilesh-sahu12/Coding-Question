package com.akhilesh;

import java.util.Scanner;

/*
The function accepts string str of size n as an argument.
Implement the function which returns 1 if given string str is valid password else 0.

str is a valid password if it satisfies the below conditions.

– At least 4 characters
– At least one numeric digit
– At Least one Capital Letter
– Must not have space or slash (/)
– Starting character must not be a number
*/


public class PasswordChecker {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=sc.nextInt();
        System.out.println(check(str,n));
    }
    public  static  int check(String s, int n){
        if(s.length()<5){
            return 0;
        }
        if(s.contains(" ") || s.contains("/")){
            return 0;
        }
        if(s.charAt(0)-'0'>=0 && s.charAt(0)-'0'<=9 ){
            return 0;
        }
        int countChar=0;
        int countDigit=0;
        boolean upperCase=false;
        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)-'0'>=0 && s.charAt(i)-'0'<=9 ){
                countDigit+=1;
            }
            else if(Character.isUpperCase(s.charAt(i))){
                countChar+=1;
                upperCase=true;

            }
        }
        if(s.length()-countDigit>3 && upperCase && countDigit>0){
            return 1;
        }
        return 0;
    }
}
