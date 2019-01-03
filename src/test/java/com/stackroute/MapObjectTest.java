package com.stackroute;

/*
Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2. Modify and return the given map as follows:

a. If the key `val1` has a value, set the key `val2` to have that value, and
b. Set the key `val1` to have the value `"  "` (empty string).
Example 1:
The map {"val1": "java", "val2": "c++"} should return {"val1": " ", "val2": "java"}
Example 2:
The map {"val1": "mars", "val2": "saturn"}  should return {"val1": " ", "val2": "mars"}
*/

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapObjectTest {

    MapObject mapObject = new MapObject();
    Map<String,String> outputMap;
    Map<String,String> inputMap;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
        mapObject = null;
    }

    @Test
    public void twoInputValidate(){ //It should throw an exception here
        inputMap = new HashMap<String, String>(){{
            put("val1","mars");        //there is no value for key1, so it should perform nothing and return null
            put("val2","saturn");
            put("val3","jupiter");
        }};
        assertNull(mapObject.setInputMap(inputMap));
    }

    @Test
    public void checkFirstKeyValueValidate(){
        inputMap = new HashMap<String, String>(){{
            put("val1","java");       //If first key has some value then it should implement the logic and should return notNull
            put("val2","c++");
        }};
        assertNotNull(mapObject.setInputMap(inputMap));
    }

    @Test
    public void checkFirstKeyNullValidate(){
        inputMap = new HashMap<String, String>(){{
            put("val1","java");        //there is no value for key1, so it should perform nothing and return null
            put("val2","c++");
        }};
        assertNotNull(mapObject.setInputMap(inputMap));
    }

    @Test
    public void keysNameValidation(){
        //it should be val1 and val2 only
        inputMap = new HashMap<String, String>(){{
            put("val1","java");
            put("val3","c++");
        }};
        outputMap = new HashMap<String, String>(){{
            put("val1"," ");
            put("val3","java");
        }};
        //Even though the logic is right, the keys should only be val1 and val2
        assertNotEquals(outputMap,mapObject.setInputMap(inputMap));
    }

    @Test
    public void programValidate(){
        inputMap = new HashMap<String, String>(){{
            put("val1","java");
            put("val2","c++");
        }};
        outputMap = new HashMap<String, String>(){{
            put("val1"," ");
            put("val2","java");
        }};
        assertEquals(outputMap,mapObject.setInputMap(inputMap));

        //input should not be equal to input..that means no value at first key--it should return null not the same input.
        assertNotEquals(inputMap,mapObject.setInputMap(inputMap));
    }
}