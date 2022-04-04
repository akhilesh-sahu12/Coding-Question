package com.placement;
import  java.util.*;
/*Input an email from the user. You have to create a username from the email
by deleting the part that comes after ‘@’. Display that username to the user.
        Example :
        email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
        email = “helloWorld123@gmail.com”; username = “helloWorld123”*/


public class DisplayUserNameFromEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        int idx=findIndex(email);
        System.out.println(email.substring(0,idx));
    }

    private static int findIndex(String email) {
        int endIndex=0;
        for (int i = 0; i <email.length() ; i++) {
            if(email.charAt(i)=='@'){
                return i;
            }
        }
        return email.length();
    }

}
