package com.stackroute.pe5;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ReplaceElementTest {


    ArrayList<String> fruits=new ArrayList<String>(Arrays.asList("banana","apple","mango"));
    ArrayList<String> res;



    @Test
    public void test1()
    {
        res=ReplaceElement.replace(fruits,0, "melon");
        ArrayList<String> dummy=new ArrayList<String>(Arrays.asList("melon","apple","mango"));
        assertEquals(dummy, res);
    }

    @Test
    public void test2()
    {
        test1();
        res=ReplaceElement.replace(res,1, "grape");
        ArrayList<String> dummy=new ArrayList<String>(Arrays.asList("melon","grape","mango"));
        assertEquals(dummy, res);
    }

    @Test
    public void test3()
    {
        test2();
        res=ReplaceElement.replace(res,2, "litchi");
        ArrayList<String> dummy=new ArrayList<String>(Arrays.asList("melon","grape","litchi"));
        assertEquals(dummy, res);
    }

}