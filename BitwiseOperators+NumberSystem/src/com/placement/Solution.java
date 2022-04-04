package com.placement;

class Solution {
    public static void main(String[] args) {
        int image[][] ={{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int image1[][]=flipAndInvertImage1(image);
        for (int i=0; i< image1.length; i++) {
            for (int j=0; j<image1[i].length; j++) {
                System.out.print(image1[i][j]+" ");
                // System.out.print((image[i][j]^1)+" ");
            }
            System.out.println();
        }

    }
   static int[][] flipAndInvertImage1(int[][] image) {
        int n= image[0].length;
       for(int row=0; row<image.length; row++){
           for(int col=0; col< (image.length+1)/2; col++){
               int temp=image[row][col];
               image[row][col]=image[row][n-col-1];
               image[row][n-col-1]=temp;
            }
            
        }
       /* for (int i=0; i< image.length; i++) {
                for (int j=0; j<image.length; j++) {
                    image[i][j]^=1;
                }
        }
        return  image;
        */
       return  image;
    }
}