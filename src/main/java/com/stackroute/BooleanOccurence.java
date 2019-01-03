package com.stackroute;

/*
Write a program where an array of strings is input and output is a Map<String,boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array

        Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
        Output - {“a” : true,”b” :false ,”c” :true,”d” : false}
*/

public class BooleanOccurence {

    String input[];

    public String[] getInput() {
        return input;
    }

    public String[] setInput(String[] input) {
        this.input = input;
        return input;
    }
}
