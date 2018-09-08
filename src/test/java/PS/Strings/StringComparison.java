package PS.Strings;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringComparison {

    @Test
    public void canCompareToString(){
        String hello = "Hello";
        Assert.assertTrue(hello.compareTo("Hello")==0);

        Assert.assertTrue(hello.compareTo("hello") < 0);
        Assert.assertTrue(hello.compareTo("Helloo") < 0);
        Assert.assertTrue(hello.compareTo("Hemlo") < 0);

        Assert.assertTrue(hello.compareTo("H") > 0);
        Assert.assertTrue(hello.compareTo("Helln") > 0);
        Assert.assertTrue(hello.compareTo("HeLlo") > 0);

        Assert.assertTrue(hello.compareToIgnoreCase("hello")==(0));
        Assert.assertTrue(hello.compareToIgnoreCase("Hello")==0);
        Assert.assertTrue(hello.compareToIgnoreCase("HeLlo")==0);
    }

    @Test
    public void canCheckContainsOnString(){
        String hello = "Hello";
        Assert.assertTrue(hello.contains("He"));
        Assert.assertTrue(hello.contains("Hello"));

        Assert.assertFalse(hello.contains("LL"));

        Assert.assertFalse(hello.contains("z"));
        Assert.assertFalse(hello.contains("world"));
        Assert.assertFalse(hello.contains("Helloo"));
    }

    @Test
    public void canCheckContentEquals(){
        String hello = "Hello";
        Assert.assertTrue(hello.contentEquals("Hello"));
        Assert.assertFalse(hello.contentEquals("hello"));

        Assert.assertTrue(hello.equalsIgnoreCase("hello"));
    }

    @Test
    public void canCheckEndsWithStartsWith(){
        String hello = "Hello";
        Assert.assertTrue(hello.endsWith("Hello"));
        Assert.assertTrue(hello.endsWith(""));
        Assert.assertTrue(hello.endsWith("lo"));

        Assert.assertTrue(hello.startsWith("Hello"));
        Assert.assertTrue(hello.endsWith(""));
        Assert.assertTrue(hello.startsWith("He"));

        Assert.assertFalse(hello.startsWith("he"));
        Assert.assertFalse(hello.startsWith("Lo"));
    }

    @Test
    public void canCheckEmpty(){

        String empty = "";
        Assert.assertTrue(empty.isEmpty());
        Assert.assertTrue(empty.length()==0);

        String notEmpty = " ";
        Assert.assertTrue(!notEmpty.isEmpty());
        Assert.assertTrue(notEmpty.length()==(1));
    }


}
