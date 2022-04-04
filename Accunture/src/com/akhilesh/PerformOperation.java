package com.akhilesh;

public class PerformOperation {
    public int operationsBinaryString(String str){
        if(str == null || str.length()==0){
            return -1;
        }
        int res=Character.getNumericValue(str.charAt(0));
        int curr=0;
        for(int i=1; i<str.length()-1; i+=2){
            int nextDigit = Character.getNumericValue(str.charAt(i + 1));
            if(str.charAt(i)=='A'){
               res&= nextDigit;

            }
            else if(str.charAt(i)=='B'){
                res|= nextDigit;
            }
            else{
                res^= nextDigit;
            }
        }
        return res;
    }
    public int operationsBinaryString1(String str){
        if(str == null || str.length()==0){
            return -1;
        }
        int res=str.charAt(0)-'0';
        int curr=0;
        for(int i=1; i<str.length()-1; i+=2){
            int nextDigit = str.charAt(i + 1)-'0';
            if(str.charAt(i)=='A'){
                res&= nextDigit;

            }
            else if(str.charAt(i)=='B'){
                res|= nextDigit;
            }
            else{
                res^= nextDigit;
            }
        }
        return res;
    }
}
