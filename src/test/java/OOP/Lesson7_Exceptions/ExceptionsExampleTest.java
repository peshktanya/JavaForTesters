package OOP.Lesson7_Exceptions;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ExceptionsExampleTest {

    @Test
    public void catchANullPointerException(){
        Integer age=null;
        String ageAsString;

        // Null pointer Exception
        //ageAsString = age.toString();

        try{
           ageAsString = age.toString();

        }catch(NullPointerException e){
            age = 18;
            ageAsString = age.toString();
        }

        System.out.println(age);
        System.out.println(ageAsString);

        String yourAge = "You are " + age.toString() + " years old";
        assertEquals("You are 18 years old", yourAge);
    }

    @Test
    public void catchMultipleExceptions(){
        Integer age=null;
        String ageAsString;

        try{
            ageAsString = age.toString();

        }

        catch(NullPointerException e){
            System.out.println("NullPointer: " +
                    e.getMessage());
            age = 18;
            ageAsString = age.toString();

        }
        catch(Exception e){
            System.out.println("Exception: " +
                    e.getMessage());
            age = 18;
        }


        String yourAge =
               "You are " + age.toString() + " years old";

        assertEquals("You are 18 years old", yourAge);
    }

    @Test
    public void tryCatchFinallyANullPointerException(){
        Integer age=null;
        String ageAsString;
        String yourAge="";

        try{
            ageAsString = age.toString();

        }catch(NullPointerException e){

            age = 18;
            ageAsString = age.toString();

        }finally{

            yourAge = "You are " + age.toString() + " years old";
        }
        assertEquals("You are 18 years old", yourAge);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void nullPointerExceptionExpected(){
        Integer age=null;
        age.toString();
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void throwANullPointerException(){
        Integer age=null;
        System.out.println("Code before exception");
        String ageAsString = age.toString();
        System.out.println("Code after exception");
        String yourAge = "You are " + ageAsString + " years old";
        assertEquals("You are 18 years old", yourAge);
        System.out.println("Test finished");

    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void exampleTryCatchFinally(){
        Integer age=null;

        try{
            System.out.println("1. generate a null pointer exception");
            System.out.println(age.toString());

        }catch(NullPointerException e){
            System.out.println("2. handle null pointer exception");
            throw new IllegalArgumentException
                      ("Null pointer became Illegal", e);
        }finally{
            System.out.println("3. run code in finally section");
        }
    }

    @Test//(expectedExceptions = NullPointerException.class)
    public void useWrongExceptionNullPointerThrown(){
        Integer age=null;

        String ageAsString;

        try{
            ageAsString = age.toString();

        }catch(ArithmeticException e){
            age = 18;
            ageAsString = age.toString();
        }

        // No need for any code because a NullPointerException
        System.out.println("Some code");
    }


}