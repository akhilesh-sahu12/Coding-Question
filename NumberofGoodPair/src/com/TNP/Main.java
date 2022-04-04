package com.TNP;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int[] nums = {2,2,2,2};
        int res=goodPair(nums);
        System.out.println(res);
    }

    static int goodPair(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;  // to store the frequency of pairs
        for (int num : nums) {
            if (map.containsKey(num)) {
                int prev_freq = map.get(num);
                count += prev_freq;
                map.put(num, prev_freq + 1);
            } else {
                map.put(num, 1);
            }
        }
        return count;
    }
}
