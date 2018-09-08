package OOP.Lesson8_Generics;


import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertFalse;

public class CollectionInterfacesTest {


    @Test
    public void collectionDeclarationAndInitializationExplored(){

        Collection<String> cola = new ArrayList<String>();
        Collection<String> colb = new <String>ArrayList();
        Collection<String> colc = new ArrayList<>();

    }

    @Test
    public void hashSetDoesNotAllowDupes(){

        Collection workdays = new HashSet();

        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");

        assertEquals(1, workdays.size());
    }

    @Test
    public void arrayListDoesAllowDupes(){

        Collection workdays = new ArrayList();

        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");

        assertEquals(5, workdays.size());
    }

    @Test
    public void canRemoveElementAndContainsReturnsFalse(){

        Collection<String> weekendDays = new <String>ArrayList();

        // setup the weekend days
        weekendDays.add("Saturday");
        weekendDays.add("Funday");

        assertEquals(2, weekendDays.size());
        assertTrue(weekendDays.contains("Funday"), "Bug, Funday exists but it should really be Sunday");

        // fix the bug and replace Funday with Sunday
        weekendDays.remove("Funday");

        assertFalse(weekendDays.contains("Funday"));
        assertEquals(1, weekendDays.size());

        weekendDays.add("Sunday");

        assertEquals(2, weekendDays.size());
        assertTrue(
                weekendDays.contains("Sunday"), "Bug Fixed, Sunday is in the collection now");
    }

}