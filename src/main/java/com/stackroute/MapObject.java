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

import java.util.Map;

public class MapObject {

    private Map<String,String> inputMap;

    public Map<String, String> getInputMap() {
        return inputMap;
    }


    //I should be calling get in testcases as it returns the value and not set, because if set returns a value then it will mean that
    //all logic is written in set function

    public Map<String,String> setInputMap(Map<String, String> inputMap) {
        this.inputMap = inputMap;
        return inputMap;
    }



}
