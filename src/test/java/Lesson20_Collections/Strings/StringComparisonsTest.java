package Lesson20_Collections.Strings;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringComparisonsTest {

    @Test
    public void canCompareToString(){
        String hello = "Hello";
        Assert.assertEquals(hello.compareTo("Hello"), (0));

        Assert.assertTrue(hello.compareTo("hello") < 0);
        Assert.assertTrue(hello.compareTo("Helloo") < 0);
        Assert.assertTrue(hello.compareTo("Hemlo") < 0);

        Assert.assertTrue(hello.compareTo("H") > 0);
        Assert.assertTrue(hello.compareTo("Helln") > 0);
        Assert.assertTrue(hello.compareTo("HeLlo") > 0);

        Assert.assertEquals(hello.compareToIgnoreCase("hello"), (0));
        Assert.assertEquals(hello.compareToIgnoreCase("Hello"), (0));
        Assert.assertEquals(hello.compareToIgnoreCase("HeLlo"), (0));
    }

    @Test
    public void canCheckContainsOnString(){
        String hello = "Hello";
        Assert.assertEquals(hello.contains("He"), (true));
        Assert.assertEquals(hello.contains("Hello"), (true));

        Assert.assertEquals(hello.contains("LL"), (false));

        Assert.assertEquals(hello.contains("z"), (false));
        Assert.assertEquals(hello.contains("world"), (false));
        Assert.assertEquals(hello.contains("Helloo"), (false));
    }

    @Test
    public void canCheckContentEquals(){
        String hello = "Hello";
        Assert.assertEquals(hello.contentEquals("Hello"), (true));
        Assert.assertEquals(hello.contentEquals("hello"), (false));

        Assert.assertEquals(hello.equalsIgnoreCase("hello"), (true));
    }

   @Test
    public void canCheckEndsWithStartsWith(){
        String hello = "Hello";
        Assert.assertEquals(hello.endsWith("Hello"), (true));
        Assert.assertEquals(hello.endsWith(""), (true));
        Assert.assertEquals(hello.endsWith("lo"), (true));

        Assert.assertEquals(hello.startsWith("Hello"), (true));
        Assert.assertEquals(hello.endsWith(""), (true));
        Assert.assertEquals(hello.startsWith("He"), (true));

        Assert.assertEquals(hello.startsWith("he"), (false));
        Assert.assertEquals(hello.startsWith("Lo"), (false));
    }

    @Test
    public void canCheckEmpty(){

        String empty = "";
        Assert.assertEquals(empty.isEmpty(), (true));
        Assert.assertEquals(empty.length(), (0));

        String notEmpty = " ";
        Assert.assertEquals(notEmpty.isEmpty(), (false));
        Assert.assertEquals(notEmpty.length(), (1));
    }

    @Test
    public void checkRegionMatches(){

        String hello = "Hello fella";
        Assert.assertEquals(
                hello.regionMatches(true, 6, "fez", 0, 2),
                (true));

        // case insensitive search
        Assert.assertEquals(
                hello.regionMatches(true, 0, "he", 0, 2),
                (true));

        // case sensitive search
        Assert.assertEquals(
                hello.regionMatches(false, 0, "hE", 0, 2),
                (false));
        Assert.assertEquals(
                hello.regionMatches(0, "hE", 0, 2),
                (false));
        Assert.assertEquals(
                hello.regionMatches(0, "He", 0, 2),
                (true));

        Assert.assertFalse(
                hello.regionMatches(true, 3, "lady", 0, 2));
        Assert.assertFalse(
                hello.regionMatches(true, 3, "young lady", 6, 2));

        // search for lo
        Assert.assertTrue(
                hello.regionMatches(true, 3, "lololo", 0, 2));
    }


}