package com.stackroute;

/*
Write a program to find the number of counts in the following String. Store the output in Map<String,Integer> as key value pair.

        Input :  String str = “one one -one___two,,three,one @three*one?two”;
        Output : {"one":5 , "two":2, "three" :2}
*/

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;


public class NumberOfCountsTest {

    private NumberOfCounts numberOfCounts = new NumberOfCounts();
    private String inputString;
    private Map<String, Integer> outputMap;

    @Before
    public void setUp() throws Exception {
        inputString = "one one -one___two,,three,one @three*one?two";
        outputMap = new HashMap<String, Integer>() {{
            put("One", 5);
            put("Two", 2);
            put("Three", 2);
        }};
    }

    @After
    public void tearDown() throws Exception {
        numberOfCounts = null;
    }

    @Test
    public void testNumberOfCounts(){
       /* Map<String,Integer> outputMap = new HashMap<String, Integer>() {{
            put("One", 5);
            put("Two", 2);
            put("Three", 2);
        }};*/
        assertEquals(outputMap,numberOfCounts.setInput(inputString));

    }

    @Test
    public void testInput(){
        //Check if it accepts only String input
        //assertNotNull(numberOfCounts.setInput(inputString));

    }

}