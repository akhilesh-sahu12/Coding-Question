package com.placement;

public class ObjectsClasses {
    public static void main(String[] args) {
        Person obj1=new Person();// constructor called
        Person obj2=new Person(45,"shahrukh");// constructor called
        obj1.name="Akhilesh";
        //System.out.println(obj1.name);
        obj1.age=21;
        //System.out.println(obj1.age);
        //obj2.name="Sachin Sahu";
        //obj2.age=98;
        //System.out.println(obj2.name);
        //System.out.println(obj2.age);
        obj2.walk();
        obj2.eat();
       // System.out.println(obj1.count);

        obj1.eat();
        obj1.walk();
        System.out.println(Person.count);
    }
}
class Person{
    String name;
    int age;
    static  int count;
    public  Person(){
        count++;
        System.out.println("creating an object");
    }
    public  Person(int newAge, String newName){
        this();
        System.out.println("creating an object2");
        count++;
        this.name=newName;
        this.age=newAge;
        System.out.println(name);
        System.out.println(age);
    }
    void eat(){
        System.out.println(name+" is eating");
    }
    void walk(){
        System.out.println("this is age "+ age);
        // System.out.printf("this is %d everyone",age);
    }
}
