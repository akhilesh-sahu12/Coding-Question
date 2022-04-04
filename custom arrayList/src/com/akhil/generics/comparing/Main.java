package com.akhil.generics.comparing;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student akhi=new Student(12,9.9f);
        Student sachi=new Student(14,89.09f);
        Student rasi=new Student(12,90.9f);
        Student masi=new Student(14,67.09f);
        Student[] list={akhi,sachi,rasi,masi};
        System.out.println(list.toString());
      //  Arrays.sort(list);
       /* if(akhi.compareTo(sachi)<0){
            System.out.println(akhi.compareTo(sachi));
            System.out.println("Sachi has more marks");
        }*/
    }
}
