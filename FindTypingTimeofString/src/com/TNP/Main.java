package com.TNP;

import java.util.Scanner;
//Input: keyboard = "abcdefghijklmnopqrstuvwxy", text = "cba"
//Output: 4
//Explanation:
//Initially your finger is at index 0. First you have to type 'c'. The time taken to type 'c' will be abs(2 - 0) = 2 because character 'c' is at index 2.
//The second character is 'b' and your finger is now at index 2. The time taken to type 'b' will be abs(1 - 2) = 1 because character 'b' is at index 1.
//The third character is 'a' and your finger is now at index 1. The time taken to type 'a' will be abs(0 - 1) = 1 because character 'a' is at index 0.
//The total time will therefore be 2 + 1 + 1 = 4.

public class Main {

    public static void main(String[] args) {
      String keyboard="abcdefghijklmnopqrstuvwxy";
      String text="akhilesh";
      int res=minTime(text);
      System.out.println(res);
    }
    public static int minTime(String str) {
        int prev = 97, time = 0;                                  // ASCII code of 'a' = 97 to start with
        for(int i = 0; i < str.length(); i++) {
            int we=str.charAt(i);
            System.out.println(we);
            time += Math.abs(str.charAt(i) - prev);

            prev = str.charAt(i);
        }
        return time;
    }
}
