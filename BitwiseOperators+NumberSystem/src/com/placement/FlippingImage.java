package com.placement;
/*Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].


Example 1:

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
Example 2:

Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]*/
import java.util.Arrays;

public class FlippingImage {
    public static void main(String []args) {
        int image[][] ={{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        flipAndInvertImage(image);

        //System.out.println(Arrays.toString(arr1));

    }
        public static void flipAndInvertImage(int[][] image) {
        int n= image.length;
            for(int row=0; row<image.length; row++){
                for(int col=0; col< (image.length+1)/2; col++){
                    int temp=image[row][col]^1;
                    image[row][col]=image[row][n-col-1]^1;
                    image[row][n-col-1]=temp;
                }
            }
            for (int i=0; i< image.length; i++) {
                for (int j=0; j<image.length; j++) {
                    System.out.print((image[i][j]^1)+" ");
                    //System.out.print(image[i][j]+" ");
                }
                System.out.println();
            }
        }
    }

