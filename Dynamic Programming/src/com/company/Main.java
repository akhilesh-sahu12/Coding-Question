package com.company;
import java.util.*;
public class Main {
    public static int fibnocci_tabulation(int num,int dp[]){
        for (int i=0; i<=num;i++){
            if(i<=1){
                dp[i]=i;
                continue;
            }
            dp[i]=dp[i-1]+dp[i-2];

        }
        return  dp[num];}
  public static int fibnocci_recursion(int num){
      if(num<=1){
          return num;
      }
      return (fibnocci_recursion(num-1)+fibnocci_recursion(num-2));

  }
    public static int fibnocci_memoization(int num,int dp[]){
        if(num<=1){
            return dp[num]= num;
        }
        if(dp[num]!=0){
        return dp[num];
       }
        return dp[num]=(fibnocci_memoization(num-1,dp)+fibnocci_memoization(num-2,dp));

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int dp[]=new int[num+1];
        /*long start=System.currentTimeMillis();
        System.out.println(fibnocci_recursion(num));
        long end=System.currentTimeMillis();
        System.out.println(end-start);*/

       /* long start=System.currentTimeMillis();
        System.out.println(fibnocci_memoization(num,dp));
        long end=System.currentTimeMillis();
        System.out.println(end-start);*/

        long start=System.currentTimeMillis();
        System.out.println(fibnocci_memoization(num,dp));
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        for(int i=0; i< dp.length; i++){
            System.out.print(dp[i]+" ");
        }
    }
}
