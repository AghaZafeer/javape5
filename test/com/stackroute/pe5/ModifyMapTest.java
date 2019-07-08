package com.stackroute.pe5;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ModifyMapTest {

    @Test
    public void test1()
    {
        Map<String,String> map=new HashMap<>();
        map.put("val1","java");
        map.put("val2","c++");
        Map<String,String> res=ModifyMap.modifyMap(map);
        assertEquals(map,res);
    }

    @Test
    public void test2()
    {
       Map<String,String> map=new HashMap<>();
        map.put("val1","agha");
        map.put("val2","amit");
        Map<String,String> res=ModifyMap.modifyMap(map);
        assertEquals(map,res);
    }

    @Test
    public void test3()
    {
        Map<String,String> map=new HashMap<>();
        map.put("val1","anshuman");
        map.put("val2","amit");
        Map<String,String> res=ModifyMap.modifyMap(map);
        assertEquals(map,res);
    }
}