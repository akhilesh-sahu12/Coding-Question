package com.placement;
public class Inheritance {
    public static void main(String[] args) {
     Student obj=new Student("Schi",987);
     obj.age=98;
        System.out.println(obj.age);
    }
}
class Parent{
    String name;
    int age;
    public Parent(String name, int age) {
        this.name=name;
        this.age=age;
        System.out.println(name);
        System.out.println(age);
    }
}
class Student extends Parent{
    public Student(String name, int age){
        super(name,age);
        System.out.println(age);
    }
}
