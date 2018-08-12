package Lesson19_Generics;


import org.testng.annotations.Test;
import java.util.HashSet;
import java.util.Set;

import static org.testng.Assert.assertEquals;

public class SetTest {

    @Test
    public void setExplored(){

        Set<String> seta = new HashSet<String>();
        Set<String> setb = new <String>HashSet();
        Set<String> setc = new HashSet<>();
    }

    @Test
    public void setDoesNotAllowDuplicateElements(){
        Set workdays = new HashSet();

        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");

        assertEquals(1, workdays.size());
    }
}