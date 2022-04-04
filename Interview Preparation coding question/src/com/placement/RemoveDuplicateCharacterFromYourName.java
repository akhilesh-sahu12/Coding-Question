package com.placement;
//we can use Set ->
//                 TC-> O(n) SC-> O(n)
// we can Sort Array then remove duplicate character
import java.util.Arrays;

public class RemoveDuplicateCharacterFromYourName {
    public static void main(String[] args) {
        String name="AkhileshSahu";
        removeDuplicate(name);

    }

    private static void removeDuplicate(String name) {
      //  String arr[]=name.split(" ");
       // System.out.println(Arrays.toString(arr));
        StringBuilder sb=new StringBuilder();
        int j;
        sb.append(name.charAt(0));
        for (int i = 1; i < name.length(); i++) {
            for ( j =i-1; j >=0 ; j--) {
                if(name.charAt(i)==name.charAt(j))
                    break;
            }
            if(name.charAt(i)==(name.charAt(j)) {
                continue;
            }
            else
                 sb.append(name.charAt(i))

        }
        System.out.println(sb);
    }
}
