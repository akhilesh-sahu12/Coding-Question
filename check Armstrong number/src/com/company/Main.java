package com.company;
import java.util.*;
public class Main {
    // Armstrong number is a number that is equal to sum of cubes of its digits.
  public static boolean armstrong(int n){
      int sum=0;
      int temp=n;
      while(n>0){
          int d=n%10;
          sum=sum+d*d*d;// cube of digits and sum all digit
          n=n/10;
      }
      return sum == temp;// if(sum==temp) return true;  else return false;
//return sum;
    }
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println(armstrong(n));
    }
}
