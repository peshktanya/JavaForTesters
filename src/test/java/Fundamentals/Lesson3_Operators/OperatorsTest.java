package Fundamentals.Lesson3_Operators;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class OperatorsTest {
    @Test
    public void traditionalOperatorsExplored(){
        assertEquals(4, 2+2);
        assertEquals(5L, 10L - 5L);
        assertEquals(25.0F, 12.5F * 2F, 0);
        assertEquals(30.2D, 120.8D / 4D, 0);
        assertEquals("abcd", "ab" + "cd");
        assertEquals(1, 9%2);
    }

    @Test
    public void assignmentOperatorsExplored(){
        String title = "title";
        assertEquals("title", title);

        int count = 10;
        assertEquals(10, count);

        count += 2; // count = count + 2;
        System.out.println("+= increments by");
        assertEquals( 12, count);

        count -= 4;
        System.out.println("-= decrements by");
        assertEquals( 8, count);

        count *= 2;
        System.out.println("-= multiplies by");
        assertEquals(16, count);

        count /= 4;
        System.out.println("-= divides by");
        assertEquals( 4, count);

    }

    @Test
    public void incrementDecrementOperatorsExplored(){
        int num = 10;
        assertEquals(11, ++num);
        assertEquals(10, --num);
        assertEquals(10, num++);
        assertEquals(11, num);
        assertEquals(11, num--);
        assertEquals(10, num);
    }

    @Test
    public void booleanOperatorsExplored(){
        assertTrue( 4 == 4 );
        assertTrue(4 != 5);
        assertTrue(3 < 4);
        assertTrue(5 > 4);
        assertTrue( 6 >= 6);
        assertTrue( 7 >= 6);
        assertTrue( 8 <= 8);
        assertTrue( 8 <= 9);

        assertTrue(!false);

        boolean truthy = true;
        assertFalse(!truthy);
    }

    @Test
    public void conditionalOperatorsExplored(){
        assertTrue( true && true);
        assertTrue( true || false);
        assertTrue( false || true);
        assertFalse( false || false);
        assertFalse( false && true);
    }

    @Test
    public void ternaryOperatorsExplored(){
        int x;
        x = 4>3 ? 2 : 1;
        assertEquals(2, x);

        assertTrue( 5>=4 ? true : false );
    }


    @Test
    public void bitwiseOperatorsExplored(){
        assertEquals(0b0001,
                0b1001 & 0b0101);

        assertEquals(0b1101,
                0b1001 | 0b0101);

        assertEquals(0b1100,
                0b1001 ^ 0b0101);

        int x = 0b0001;
        assertEquals("11111111111111111111111111111110",
                Integer.toBinaryString(~x));
    }

    @Test
    public void bitwiseAssignmentOperatorsExplored(){
        byte x = 0b0001;

        x &= 0b1011;
        assertEquals(0b0001, x);

        x |= 0b1001;
        assertEquals(0b1001, x);

        x ^= 0b1110;
        assertEquals(0b0111, x);
    }

    @Test
    public void bitwiseShiftOperatorsExplored(){
        int x = 56;

        assertEquals(x*2, x<<1);
        assertEquals(x*4, x<<2);
        assertEquals(x*8, x<<3);

        x <<=3;
        assertEquals(56*8, x);

        x = Integer.MAX_VALUE;
        assertEquals(Integer.MAX_VALUE/2, x>>1);
        assertEquals(Integer.MAX_VALUE/4, x>>2);
        assertEquals(Integer.MAX_VALUE/8, x>>3);

        x = Integer.MIN_VALUE; // -ve
        assertEquals((Integer.MAX_VALUE/2)+1, x>>>1);
    }

    @Test
    public void operatorPrecedence(){
        assertEquals(8, 4+2*6/3 );
        assertEquals(12, (((4+2)*6)/3) );
    }


    /*
    bitwise:
    others: ~ invert
    shift: << >> >>>
    bitwise & and ^ xor | or
    ternary ? :
    assignment &= ^= |= <<= >>= >>>=
     */
}
