package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class ApperanceOfArrayElement {
    public static Map<String,Boolean> appearanceOfArrayElement(String []arr)
    {
        Map<String,Boolean> map=new HashMap<String,Boolean>();
        Map<String, Integer> maparr = new HashMap<String, Integer>();
        for (String i :arr)
        {
            Integer j = maparr.get(i);
            maparr.put(i, (j == null) ? 1 : j + 1);
            int k=maparr.get(i);
            map.put(i,(k>1) ? true: false);
        }
        return map;


    }

}
