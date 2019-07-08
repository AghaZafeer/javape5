package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainTest {

    public static String implementer(ArrayList<Student> students) {
        Comparator<Student> studentComparator=new StudentSorter();// creation of comparator reference
        Collections.sort(students,studentComparator);  //sorting the array
        return students.toString();
    }
}
