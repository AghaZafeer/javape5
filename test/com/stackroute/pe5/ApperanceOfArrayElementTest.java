package com.stackroute.pe5;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ApperanceOfArrayElementTest {

    @Test
    public void test1()
    {
        String arr[]=new String[]{"apple","mango","apple"};
        Map<String,Boolean> map=ApperanceOfArrayElement.appearanceOfArrayElement(arr);
        assertEquals(Map.of("apple",true,"mango",false),map);
    }

    @Test
    public void test2()
    {
        String arr[]=new String[]{"a","b","c","d","a","c","c"};
        Map<String,Boolean> map=ApperanceOfArrayElement.appearanceOfArrayElement(arr);
        assertEquals(Map.of("a",true,"b",false,"c", true,"d",false),map);
    }

    @Test
    public void test3()
    {
        String arr[]=new String[]{"agha","heisenberg","anshuman"};
        Map<String,Boolean> map=ApperanceOfArrayElement.appearanceOfArrayElement(arr);
        assertEquals(Map.of("agha",false,"anshuman",false,"heisenberg",false),map);
    }


}