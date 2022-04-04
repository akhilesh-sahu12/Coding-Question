package com.placement;

class FreqCount {
    public static void main(String[] args) {
    String s="abc";
    String s1="aba";
    boolean res= isAnagram(s,s1);
    System.out.println(res);
    // write your code here
}
   static boolean isAnagram(String s, String s1) {
     int freq[]=new int[26];
        if(s.length()!=s1.length())
            return false;
        else {

            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i)-'a']++;
                freq[s1.charAt(i)-'a']--;
            }
           // System.out.println(Arrays.toString(freq));
        }
        for (int i = 0; i < s.length(); i++) {
            if(freq[s.charAt(i)-'a']!=0)
                return false;
        }
        return true;
    }
}