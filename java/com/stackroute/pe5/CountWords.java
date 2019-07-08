package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWords {

    public static String frequency(String s)
    {

        if(s.equals(""))
            return "";
        String regex="[^a-zA-Z0-9]";         //Regular expression for chars other than letters and digits
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(s);
        s=matcher.replaceAll(" ").trim();    // Replaces chars other than letters and digits with space
        Map<String, Integer> map = new HashMap<String, Integer>();
        String[] strings=s.split("\\s+");
        for (String i :strings)
        {
            Integer j = map.get(i);
            map.put(i,(j == null) ? 1 : j + 1);
        }
        System.out.println(map);
        return map.toString();
    }
}
