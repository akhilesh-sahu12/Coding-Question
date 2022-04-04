package com.akhil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest{
    public static void main(String[] args) {

        HashMap<String, Integer> mapA = new HashMap<>();
        System.out.println(" mapA is empty (true)==:" + mapA.isEmpty());
        mapA.put("A1", 124);
        mapA.put("A2", 125);
        mapA.put("A3", 124);
        mapA.put("A5", 1022);
       /* for (String s : mapA.keySet()) {
            System.out.println(s);
        }*/
       for(String i:mapA.keySet()){
           System.out.println(i);
       }

      //  System.out.println("Entries inside mapA: " + mapA.keySet());

    }
}
