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
        Assert.assertEquals(4, 2+2); // Expected vs Actual in TESTNG and JUnit
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
    public void FloatingInfinityType(){

        // exception! java.lang.ArithmeticException: / by zero
        // System.out.println(5/0);
        double positive_infinity = 12.0 / 0;
        System.out.println(positive_infinity);
        assertEquals(String.valueOf(positive_infinity), "Infinity"); //Different data types
    }

    @Test
    public void FloatNaNType(){

        double positiveInfinity = 12.0 / 0;
        double negativeInfinity = -15.0 / 0;
        System.out.println(String.valueOf(positiveInfinity + negativeInfinity));
        assertEquals(String.valueOf(positiveInfinity + negativeInfinity), "NaN"); //Not a Number
    }

    @Test
    public void CharacterType(){
        char aChar = '\u0026';
        assertEquals(aChar, '&');
    }
}