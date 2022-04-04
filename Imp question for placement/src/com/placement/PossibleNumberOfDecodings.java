package com.placement;

public class PossibleNumberOfDecodings {
    public static void main(String[] args) {
        char digit[]={'1','2','3'};
        int n=digit.length;
        System.out.println(countDecodingDP(digit,n));
    }

    private static int countDecodingDP(char[] digit, int n) {
        if(digit.length==0||digit[0]=='0')
            return 0;
        int dp[]=new int[n+1];
        dp[n]=1;


        for (int i = n-2; i>0; i--) {
            if (digit[i] != '0')
                dp[i] = dp[i + 1];
            if (digit[i] == '1'|| digit[i] == '2' && digit[i + 1] >= '0' && digit[i + 1] <= '6')
                dp[i] += dp[i + 2];
        }
            /*int curr_digit=digit[i];
            int doubleDigit=digit[i-1]*10+curr_digit;
            int count=0;
            if(curr_digit>0)
                count+=count2;
            if(doubleDigit>=10 && doubleDigit<=26)
                count+=count1;
            count1=count2;
            count2=count;
        }
        return count2;*/
        return dp[0];
    }
}
