package com.stackroute;

/*
Write a program to find the number of counts in the following String. Store the output in Map<String,Integer> as key value pair.

        Input :  String str = “one one -one___two,,three,one @three*one?two”;
        Output : {"one":5 , "two":2, "three" :2}
*/

public class NumberOfCounts {

    String input;

    public String getInput() {
        return input;
    }

    public String setInput(String input) {
        this.input = input;
        return input;
    }

    ///[!@#$%^&*(),.?":{}|<>]/g
}
