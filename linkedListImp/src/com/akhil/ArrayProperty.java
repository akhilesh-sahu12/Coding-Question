package com.akhil;

import java.math.BigInteger;
import java.util.Arrays;

public class ArrayProperty {
    public static void main(String[] args){
        var size=(1_978_599_906_856_298_765_455_676_543_455_554_345_434_544_345_434_543_443_444D);
      //  double[] arr1=new double[(int) size];
        long[] arr= new long[1012345652];
        double[] arr1=new double[1012345699];
        BigInteger[] arr2=new BigInteger[1012345654];
        for (int i = 0; i < 10; i++) {
            arr[i]=2345678997899787678L;
            arr1[i]=(2_435_345_454_646_535_253_778_987_899_878_766_789_898_787_878_767_876_787_878_767_870_989_876_787_987_899_878_909_878_909_878_987_878_978D);
            arr2[i]= new BigInteger("2345456787654444444623456789098765432234567545678987654234565434563456543");
           // System.out.println(arr2[i] + (BigInteger) arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
