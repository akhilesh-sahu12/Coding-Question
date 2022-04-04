package com.placement;

public class Main {

    public static void main(String[] args) {
	int n=100;
	for(int i=0; i<=n; i++){
	    System.out.println(i+" "+ isPrime(i));
    }
    }

    private static boolean isPrime(int i) {
        if(i<=0)
            return false;
        else{
            int c=2;
            while (c*c<=i){// sqrt n
                if(i%c==0) {
                    return false;
                }
                c++;
            }
            return true;

        }

    }
}
