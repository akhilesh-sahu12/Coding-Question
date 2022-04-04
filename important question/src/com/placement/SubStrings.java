package com.placement;

public class SubStrings {
    public static void main(String[] args) {
        String sentence="Hello, I am Akhilesh Sahu. I am from Rewa. Currently, I am pursuing my bachelors in Computer Science and Engineering from Technocrats Institute of Technology & Science, Bhopal";
        String name=sentence.substring(12,25);
        System.out.println(name);
        System.out.println(sentence.substring(37,41));
        System.out.println(sentence.contains("R"));//true or false
    }
}
