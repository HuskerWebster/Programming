package com.company;

public class Main {

    public static void main(String[] args) {
        MyString word = new MyString(new char[]{'c', 'a', 't'});
        System.out.println(word);
        System.out.println(word.length());

        word.replace('t', 'r');
        System.out.println(word);


    }
}
