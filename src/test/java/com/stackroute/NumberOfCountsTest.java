package com.stackroute;

/*
Write a program to find the number of counts in the following String. Store the output in Map<String,Integer> as key value pair.

        Input :  String str = “one one -one___two,,three,one @three*one?two”;
        Output : {"one":5 , "two":2, "three" :2}
*/


import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

public class NumberOfCountsTest {

    NumberOfCounts numberOfCounts = new NumberOfCounts();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
}