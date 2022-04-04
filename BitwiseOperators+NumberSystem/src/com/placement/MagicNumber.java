package com.placement;

public class MagicNumber {
    public static void main(String[] args) {
        int n=7;
        int ans=0;
        int base=5;
        while (n>0){// 6-> 110
            // 110>>1=11  11>>1=1 1>>1 0
            //6/2=3       3/2=1   1/2=0
            int last=n&1;
            n=n>>1;
          //  n/=2;
            ans+=last*base;
            base=base*5;
        }
        System.out.println(ans);
    }


}
