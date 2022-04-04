package com.akhil;
//

public class Generics {
    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,5};
        Double[] price={3.6,67.0,8.76,87.8};
        Character[] alpha={'A','K','H','I','L','E','S','H'};
        String[] surName={"Sahu","Yadav","Mishra"};
        get(arr);
        get(price);
        get(alpha);
        get(surName);
        System.out.println(getDisplay(arr));
        System.out.println(getDisplay(price));
        System.out.println(getDisplay(alpha));
        System.out.println(getDisplay(surName));
    }

    private static <T>void get(T[] array) {
        for (T i:array) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static <T> T getDisplay(T[] arrr){
        return arrr[0];

    }


}
