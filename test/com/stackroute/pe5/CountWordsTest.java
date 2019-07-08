package com.stackroute.pe5;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class CountWordsTest {

        @Test
    public void test1()
        {
            String res=CountWords.frequency("two one abc -one___two,,three,one @three*one?two");
            assertEquals("{abc=1, one=4, two=3, three=2}",res);
        }

    @Test
    public void test2()
    {
        String res=CountWords.frequency("1..678{0-6 678");
        assertEquals("{0=1, 1=1, 6=1, 678=2}",res);
    }

    @Test
    public void test3()
    {
        String res=CountWords.frequency("");
        assertEquals("",res);
    }

}