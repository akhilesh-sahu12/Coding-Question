package com.company;

import java.util.*;
class Main{
    static int ispalindrome(char ch[],int l,int r){
        int count=0;
        while (l<r) {
          if (ch[l] == ch[r])
          {   l++;
              r--;
          }
          else {
              count++;
              l++;
              r--;
          }
}
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=Integer.toBinaryString(n);
            System.out.println(s);

            int l=0;
            int r=s.length()-1;
           // r=r-1;
            char[] ch=s.toCharArray();
         int result=ispalindrome(ch,l,r);
            if(result==0) {
                System.out.println(result);
            }
            else {
                if(ch[l]!=ch[r] & ch[l+1]!=ch[r-1]) {
                    ch[r] = '1';
                    result = ispalindrome(ch, l, r);
                    System.out.println(result );
                    break;
                }
                else
                    ch[r-1]='0';
                    ch[r]='1';
                result = ispalindrome(ch, l, r);
                System.out.println(result );

            }

        }
    }
}

