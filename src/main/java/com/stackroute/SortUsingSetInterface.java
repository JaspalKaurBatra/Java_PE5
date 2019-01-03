package com.stackroute;

/*
 * Write a program to implement set interface which sorts the given randomly ordered names in ascending order.
 * Convert the sorted set in to an array list
 *
 * Input : Harry  Olive  Alice  Bluto  Eugene
 * Output :
 * Sorted Set :  Alice  Bluto  Eugene  Harry  Olive
 * Array list from Set :  Alice Bluto Eugene Harry Olive
 */

import java.util.Set;

public class SortUsingSetInterface {

    private Set<String> input;

    public Set<String> getInput() {
        return input;
    }

    public void setInput(Set<String> input) {
        this.input = input;
    }

}
