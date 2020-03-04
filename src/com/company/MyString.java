package com.company;

import java.util.Arrays;

public class MyString {

    char[] word;

    public MyString(char[] word){
        this.word = word;
    }

    public int length(){
        return word.length;
    }

    public void replace(char c, char r){
        char current = c;
        char replace = r;
        for(int i = 0; i < word.length; i++) {

            if (word[i] == current) {
                word[i] = replace;

            }
        }
    }

    @Override
    public String toString() {
        return new String(word);
    }
}
