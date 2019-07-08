package com.stackroute.pe5;

import java.util.Map;

public class ModifyMap {
    public static Map<String,String> modifyMap(Map<String,String> map)
    {
        map.put("val2",map.get("val1"));
        map.put("val1","");
        return map;
    }

}
