package com.akhilesh;


public class Main
{
	public static void main(String[] args) {
		System.out.println(countPalindrome("011"));
	}
	static long countPalindrome(String str) 
    { 
        // code here
        long count=0;
        for (int i = 0 ; i < str.length(); i++) {
      for (int j = i + 1; j <= str.length(); j++) {
        // i -> starting point of substring, j-> ending point of substring
        if (isPalindrome(str.substring(i, j))) {
          count+=1;
        }
      }
    }
    return count;
    }
    public static boolean isPalindrome(String str) {
    int i = 0, j = str.length() - 1;
    int ones=0;
    while (i < j) {
        if(str.charAt(i)=='1'){
            ones+=1;
        }
      if (str.charAt(i) != str.charAt(j) || ones>2) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
}
