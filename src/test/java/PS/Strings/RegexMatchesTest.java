package PS.Strings;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class RegexMatchesTest {

    @Test
    public void checkMatchesFunction(){

        String mustIncludeADigit = ".*[0123456789]+.*";

        assertEquals("invalid".matches(mustIncludeADigit), (false));
        assertEquals("Invalid".matches(mustIncludeADigit), (false));
        assertEquals("".matches(mustIncludeADigit), (false));
        assertEquals("   ".matches(mustIncludeADigit),(false));

        assertTrue("12345678".matches(mustIncludeADigit));
        assertTrue("1nvalid".matches(mustIncludeADigit));
        assertTrue("1nval1d".matches(mustIncludeADigit));
        assertTrue("inval1d".matches(mustIncludeADigit));
        assertTrue("invali6".matches(mustIncludeADigit));


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