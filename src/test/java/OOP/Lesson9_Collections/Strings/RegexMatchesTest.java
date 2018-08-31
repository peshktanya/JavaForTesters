package OOP.Lesson9_Collections.Strings;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class RegexMatchesTest {

    @Test
    public void checkMatchesFunction(){

        String mustIncludeADigit = ".*[0123456789]+.*";

        assertEquals("invalid".matches(mustIncludeADigit), (false));
        assertEquals("Invalid".matches(mustIncludeADigit), (false));
        assertEquals("".matches(mustIncludeADigit), (false));
        assertEquals("   ".matches(mustIncludeADigit),(false));

        assertEquals("12345678".matches(mustIncludeADigit), (true));
        assertEquals("1nvalid".matches(mustIncludeADigit), (true));
        assertEquals("1nval1d".matches(mustIncludeADigit), (true));
        assertEquals("inval1d".matches(mustIncludeADigit), (true));
        assertEquals("invali6".matches(mustIncludeADigit), (true));


        String mustIncludeUppercase = ".*[A-Z]+.*";

        assertEquals("invalid".matches(mustIncludeUppercase), (false));
        assertEquals("".matches(mustIncludeUppercase), (false));
        assertEquals("   ".matches(mustIncludeUppercase), (false));
        assertEquals("12345678".matches(mustIncludeUppercase), (false));

        assertEquals("Valid".matches(mustIncludeUppercase), (true));
        assertEquals("val1D".matches(mustIncludeUppercase), (true));
        assertEquals("vaL1d".matches(mustIncludeUppercase), (true));
        assertEquals("vaLid".matches(mustIncludeUppercase), (true));
        assertEquals("VALID".matches(mustIncludeUppercase), (true));
    }

}