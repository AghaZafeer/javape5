package com.stackroute.pe5;

import java.util.*;

public class NamesInAscendingOrder {
    public static ArrayList<String> namesInAscendingOrder(String input)
    {
     TreeSet<String> set=new TreeSet<String>();
        List<String> arr=Arrays.asList(input.split(" "));
     set.addAll(arr);
     return new ArrayList<String>(set);
    }
}
