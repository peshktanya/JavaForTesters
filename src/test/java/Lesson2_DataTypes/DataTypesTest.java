package Lesson2_DataTypes;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class DataTypesTest {

    @Test
    public void canAddTwoPlusTwo(){
        int answer = 2+2;
        Assert.assertEquals(4, 2+2);
    }

    @Test
    public void BooleanType(){
        boolean truthy = true;
        boolean falsey = false;

        assertTrue(truthy);
        assertFalse(falsey);

        truthy = Boolean.TRUE;
        falsey = Boolean.FALSE;

        assertTrue(truthy);
        assertFalse(falsey);
    }

    @Test
    public void FloatingPointType(){
        float singlePrecision32bit;
        double doublePrecision64bit;

        System.out.println("* `float` range: " +
                Float.MIN_VALUE + " to " +
                Float.MAX_VALUE);

        System.out.println( "* `double` range: " +
                Double.MIN_VALUE + " to " +
                Double.MAX_VALUE);

        singlePrecision32bit = 10.0F; // suffix F to get a float
        assertEquals(10F, singlePrecision32bit);

        doublePrecision64bit = 20.0;  // default to double
        assertEquals(20D, doublePrecision64bit);
    }

    @Test
    public void CharacterType(){
        char aChar = '\u0026';
        assertEquals(aChar, '&');
    }
}