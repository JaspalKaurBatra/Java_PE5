package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

   /*
    * Write a program to implement set interface which sorts the given randomly ordered names in ascending order.
    * Convert the sorted set in to an array list
    *
    * Input : Harry  Olive  Alice  Bluto  Eugene
    * Output :
    * Sorted Set :  Alice  Bluto  Eugene  Harry  Olive
    * Array list from Set :  Alice Bluto Eugene Harry Olive
    */

public class SortUsingSetInterfaceTest {

    private SortUsingSetInterface sortUsingSetInterface = new SortUsingSetInterface();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        sortUsingSetInterface = null;
    }

    @Test
    public void testCase(){
        Set<String> input = new HashSet<String>(Arrays.asList(new String[]{"Harry","Olive","Alice","Bluto","Eugene"}));
        List<String> expectedArrayList= new ArrayList<String>(Arrays.asList(new String[]{"Alice","Bluto","Eugene","Harry","Olive"}));
        Set<String> expectedSortedOutput = new HashSet<String>(Arrays.asList(new String[]{"Alice","Bluto","Eugene","Harry","Olive"}));
        sortUsingSetInterface.setInput(input);
        assertEquals(expectedSortedOutput,sortUsingSetInterface.getInput());
        assertEquals(expectedArrayList,sortUsingSetInterface.getInput());
    }

    @Test
    public void inputValidation(){
        Set<String> input = new HashSet<>();
        sortUsingSetInterface.setInput(input);
        assertNull(sortUsingSetInterface.getInput());
        input.add("Harry");
        assertNotNull(sortUsingSetInterface.getInput());
    }
}