package com.akhil;

public class MyGenericClass<T> {
    T x;
    MyGenericClass(T x){
        this.x=x;
    }
    public T getValue1(){
        return x;
    }

}
