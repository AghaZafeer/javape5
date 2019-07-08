package com.stackroute.pe5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NamesInAscendingOrderTest {

    @Test
    public void test1()
    {
        ArrayList<String> arr=NamesInAscendingOrder.namesInAscendingOrder("sabya agha amit");
        assertEquals("[agha, amit, sabya]",arr.toString());
        assertNotEquals("",arr.toString());
    }

    @Test
    public void test2()
    {
        ArrayList<String> arr=NamesInAscendingOrder.namesInAscendingOrder("anshuman sabya agha amit");
        assertEquals("[agha, amit, anshuman, sabya]",arr.toString());
        assertNotEquals("",arr.toString());
    }

    @Test
    public void test3()
    {
        ArrayList<String> arr=NamesInAscendingOrder.namesInAscendingOrder("This is a bottle");
        assertEquals("[This, a, bottle, is]",arr.toString());
        assertNotEquals("",arr.toString());
    }

    @Test
    public void test4()
    {
        ArrayList<String> arr=NamesInAscendingOrder.namesInAscendingOrder("4 3 2 1");
        assertEquals("[1, 2, 3, 4]",arr.toString());
        assertNotEquals("",arr.toString());
    }
}