package com.akhilesh;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    // store 5 roll nos
	int[] numbers=new int[5];

    // store 5 names
    String[] names=new String[5];

    // data of 5 student : {roll no, name, marks}
        int[] rno=new int[5];
        String[] name=new String[5];
        float[] marks=new float[5];

       Student[] students=new Student[5];

       Student student1=new Student();
        Student student2=new Student();


//       student1.rno=90;
//       student1.name="Hello";
//       student1.marks= (float) 0899.9;

        System.out.println(student1.marks);
        System.out.println(student1.rno);
        System.out.println(student1.name);

        System.out.println(student2.marks);
        System.out.println(student2.rno);
        System.out.println(student2.name);
    }

}
class Student{
    int rno;
    String name;
    float marks;

    // we need a way to add the values of the above
    // properties object by object

    Student(){
        this.rno=90;
        this.name="Hello";
        this.marks=0899.9f;
    }
}
