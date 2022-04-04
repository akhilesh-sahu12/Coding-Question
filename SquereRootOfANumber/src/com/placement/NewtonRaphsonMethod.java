package com.placement;

public class NewtonRaphsonMethod {
    public static void main(String[] args) {
        int n=40;
        double res=sqrt(n);
        System.out.println(res);
    }

    private static double sqrt(int n) {
        double x=n;
        double root;
        while (true) {
            root = 0.5 * (x + (x / n));
            if (Math.abs(root - x) < 0.5) {
                break;
            }
            x=root;
        }
        return root;
    }
}
