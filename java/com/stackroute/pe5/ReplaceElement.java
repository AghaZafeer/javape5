package com.stackroute.pe5;

import java.util.ArrayList;

public class ReplaceElement {
    public static ArrayList<String> replace(ArrayList<String> arr, int index, String value)
    {
        arr.set(index, value);
        return arr;
    }
}
