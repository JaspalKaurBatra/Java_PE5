package com.stackroute;

/*
Write a Java program to update specific array element by given element and empty the array list.

        Input: [Apple, Grape, Melon, Berry]
        Output: [Kiwi, Grape, Mango, Berry]
        Array list after removing all elements []
 */

import java.util.ArrayList;
import java.util.List;

public class UpdateSpecificArrayElement {

   private List<String> input = new ArrayList<>();

   public List<String> getInput() {
        return input;
    }

    public List<String> setInput(List<String> input) {
        this.input = input;
        return input;
    }

}
