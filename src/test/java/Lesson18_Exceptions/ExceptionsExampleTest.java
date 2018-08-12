package Lesson18_Exceptions;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ExceptionsExampleTest {

    @Test
    public void tryCatchFinallyPseudoCode(){

        try{
            // try and do something

        }catch(NullPointerException e){
            // handle the exception here

        }finally{
            // perform the code here
            // regardless of whether an
            // exception was thrown or not
        }
    }

    @Test
    public void catchANullPointerException(){
        Integer age=null;
        String ageAsString;

        try{
           ageAsString = age.toString();

        }catch(NullPointerException e){
            age = 18;
            ageAsString = age.toString();
        }

        String yourAge = "You are " + age.toString() + " years old";
        assertEquals("You are 18 years old", yourAge);
    }

    @Test
    public void catchMultipleExceptions(){
        Integer age=null;
        String ageAsString;

        try{
            ageAsString = age.toString();

        }catch(NullPointerException e){

            age = 18;
            ageAsString = age.toString();

        }catch(IllegalArgumentException e){
            System.out.println("Illegal Argument: " +
                                e.getMessage());
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
    public void throwANullPointerException(){
        Integer age=null;
        String ageAsString = age.toString();
        String yourAge = "You are " + ageAsString + " years old";
        assertEquals("You are 18 years old", yourAge);
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

    @Test(expectedExceptions = NullPointerException.class)
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
    }


    @Test(expectedExceptions = NullPointerException.class)
    public void nullPointerExceptionExpected(){
        Integer age=null;
        age.toString();
    }


    @Test
    public void noExceptionThrown(){
        IllegalArgumentException e =
                new IllegalArgumentException("never thrown");
    }


    @Test(expectedExceptions = IllegalArgumentException.class)
    public void passwordMustBeGreaterThan6Chars(){
        User aUser = new User("username", "I23456");
    }

}