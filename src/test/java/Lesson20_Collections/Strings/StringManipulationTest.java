package Lesson20_Collections.Strings;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringManipulationTest {

    @Test
    public void canUseReplace(){
        String hello = "Hello fella fella fella";

        Assert.assertEquals( hello.replace("fella", "World"),
                    ("Hello World World World"));

        Assert.assertEquals( hello.replaceFirst("fella", "World"),
                    ("Hello World fella fella"));

        Assert.assertEquals( hello.replaceAll("fella", "World"),
                    ("Hello World World World"));

        Assert.assertEquals("1,2,3".replaceFirst("[0-9]","digit"),
                    ("digit,2,3"));

        Assert.assertEquals("1,2,3".replaceAll("[0-9]", "digit"),
                    ("digit,digit,digit"));
    }

    @Test
    public void canConvertToUpperCaseAndLowerCase(){
        String text = "In the lower 3rd";

        Assert.assertEquals( text.toUpperCase(),
                    ("IN THE LOWER 3RD"));

        Assert.assertEquals( text.toLowerCase(),
                    ("in the lower 3rd"));
    }

    @Test
    public void canTrimAString(){
        String padded = "    trim me    ";
        Assert.assertEquals(padded.length(), (15));

        String trimmed = padded.trim();

        Assert.assertEquals(trimmed.length(), (7));
        Assert.assertEquals(trimmed, ("trim me"));
    }

    @Test
    public void canCreateSubStrings(){

        String digits = "0123456789";

        Assert.assertEquals( digits.substring(5), ("56789"));

        Assert.assertEquals(digits.substring(5, 6), ("5"));

        Assert.assertEquals( digits.substring(5,9), ("5678"));

        Assert.assertEquals( digits.substring(5,digits.length()),
                    ("56789"));

    }

    @Test
    public void canUseStringFormat(){

        int value = 4;
        String output = "The value " + value + " was used";
        Assert.assertEquals(output, ("The value 4 was used"));

        String template = "The value %d was used";
        String formatted = String.format(template, value);
        Assert.assertEquals(formatted, ("The value 4 was used"));

        String use = "%s %s towards %d large %s";
        Assert.assertEquals(
            String.format(use, "Bob", "ran", 6, "onions" ),
            ("Bob ran towards 6 large onions"));

        String txt = "%2$s %4$s towards %3$d large %1$s";
        Assert.assertEquals(
                String.format(txt, "Bob", "ran", 6, "onions" ),
                ("ran onions towards 6 large Bob"));

        String txt2 = "%1$s %1$s towards %3$d large %1$s";
        Assert.assertEquals(
                String.format(txt2, "Bob", "ran", 6, "onions" ),
                ("Bob Bob towards 6 large Bob"));
    }

    @Test
    public void canSplitStrings(){
        String csv="1,2,3,4,5,6,7,8,9,10";
        String[] results = csv.split(",");

        Assert.assertEquals(results.length, (10));
        Assert.assertEquals(results[0], ("1"));
        Assert.assertEquals(results[9], ("10"));
    }


}