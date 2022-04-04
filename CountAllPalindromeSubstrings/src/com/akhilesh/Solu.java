package com.akhilesh;
import java.util.*;

public class Solu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        for (int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }
        System.out.println(minCost(n, k, list));
    }
    public static int minCost(int N, int K, List<Integer>X) {
        System.out.println(X);
        int minC = Integer.MAX_VALUE;
        Collections.sort(X);
        System.out.println(X);
        for (int i = 0; i <= N - K; i++) {
            int diff = 0;
            for (int j = i + 1; j < i + K; j++) {
                diff = diff + (Math.abs(X.get(i) - X.get(j)));
            }
            System.out.println("diff: " + diff);
            minC = Math.min(minC, diff);
            System.out.println(minC);
            int l = i;
            int it = K - 1;
            while (l >= 0 && it >= 0) {
                minC = Math.min(minC, Math.abs(diff - X.get(l + K - 1) + X.get(l - 1)));
                System.out.println(minC);
                l--;
                it--;
            }
        }
        return minC;
    }
}