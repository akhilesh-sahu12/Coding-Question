package com.akhilesh;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int c,r;
    static int[][] dir={{-1, -1}, {-1, 1}, {1,1}, {1, -1},{-1, -1}, {-1, 1}, {1,1}, {1, -1}};

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int m= sc.nextInt();
    int[][] mat=new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        sumOfDiagonal(mat);
    }
    static void sumOfDiagonal(int[][] mat){
        c= mat.length;
        r= mat.length;
       //System.out.println(r+" "+c);
        for (int i = 0; i <r; i++) {
            for (int j = 0; j <c; j++) {
                if(i==j){
                    mat[i][j]=0;
                }
            }
        }
        for (int i = 0; i < r; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }

    }
}
