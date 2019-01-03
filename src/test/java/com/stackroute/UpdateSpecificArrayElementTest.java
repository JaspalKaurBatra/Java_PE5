package com.stackroute;

/*
Write a Java program to update specific array element by given element and empty the array list.

        Input: [Apple, Grape, Melon, Berry]
        Output: [Kiwi, Grape, Mango, Berry]
        Array list after removing all elements []
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateSpecificArrayElementTest {

    UpdateSpecificArrayElement updateSpecificArrayElement = new UpdateSpecificArrayElement();
    List<String> input;

    @Before
    public void setUp() throws Exception {
        input= new ArrayList<String>(Arrays.asList(new String[]{"Apple", "Grape", "Melon","Berry"}));
    }

    @After
    public void tearDown() throws Exception {
        updateSpecificArrayElement = null;
    }

    @Test
    public void outputValidation(){
        List<String> expected= new ArrayList<String>(Arrays.asList(new String[]{"Kiwi", "Grape", "Mango","Berry"}));
        assertEquals(expected,updateSpecificArrayElement.setInput(input));
    }

    @Test
    public void outputValidation2(){
        assertEquals(input,updateSpecificArrayElement.setInput(input));
        assertNull(updateSpecificArrayElement.setInput(input));
    }

    @Test
    public void nullArrayListValidation(){
        List<String> expected = new ArrayList<>();  //empty List
        input.clear();
        assertEquals(expected,updateSpecificArrayElement.setInput(input));
        assertNull(updateSpecificArrayElement.setInput(input));
    }

    @Test
    public void programValidation(){
        List<String> expected = new ArrayList<String>(Arrays.asList(new String[]{"Apple","Berry","Melon","Berry"}));  //empty List
        assertEquals(expected,updateSpecificArrayElement.setInput(input));
        input.clear();
        assertEquals(expected,updateSpecificArrayElement.setInput(input));
    }

    @Test
    public void emptyInputStringReturnValidation(){
        List<String> expected = new ArrayList<>();  //empty List
        //if no changes are asked for it should not return null arrayslist but should return the same string
        assertNotEquals(expected,updateSpecificArrayElement.setInput(input));
    }

    @Test
    public void emptyInputStringValidation(){
        input.clear();
        //if ArraysList is not initialized, it should return NUll.
        assertNull(updateSpecificArrayElement.setInput(input));
    }


   // expectedUpdatedArrayList is null

}