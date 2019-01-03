package com.stackroute;

/*
Write a program where an array of strings is input and output is a Map<String,boolean>
 where each different string is a key
  and its value is true if that string appears 2 or more times in the array

        Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
        Output - {“a” : true,”b” :false ,”c” :true,”d” : false}
*/

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;
import static org.junit.Assert.*;

public class BooleanOccurenceTest {

    BooleanOccurence booleanOccurence = new BooleanOccurence();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        booleanOccurence = null;
    }

    @Test
    public void outputValidation() {
        String arr[] = new String[]{"a", "b", "c", "d", "a", "c", "c"};
        Map<String, Boolean> outputMap = new HashMap<String, Boolean>() {{
            put("a", true);
            put("b", false);
            put("c", true);
            put("d", false);
        }};
        assertEquals(outputMap, booleanOccurence.setInput(arr));
    }

    @Test
    public void inputValidation() {
        String arr[] = new String[]{"a", "b", "c", "d"};
        assertNull(booleanOccurence.setInput(arr));
    }

    @Test
    public void mapValidation() {
        String arr[] = new String[]{"a", "b", "c", "d", "a", "c", "c"};
        Map<Boolean, String> outputMap = new HashMap<Boolean, String>() {{
            put(true, "a");
            put(false, "b");
            put(true, "c");
            put(false, "d");
        }};
        assertNotEquals(outputMap, booleanOccurence.setInput(arr));
    }


}