package com.placement;
import java.util.*;
/*Input a string from the user. Create a new string called ‘result’
in which you will replace the letter ‘e’ in the original string with letter ‘i’.
        Example :
        original = “eabcdef’ ; result = “iabcdif”
        Original = “ xyz” ; result = “xyz”*/

public class ReplaceSpecificCharToAnotherChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String original=sc.nextLine();
        String result=original.replace('e','i');
        System.out.println(result);
        System.out.println(original.repeat(2));// how many times String print
    }
}
