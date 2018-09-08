package OOP.Lessons.PS_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    private static Pattern emailNamePtrn = Pattern.compile(
            "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

// Chars or Digits or . + @ + Chars or Digits + . + Chars
    public static boolean validateEmailAddress(String userName){

        Matcher mtch = emailNamePtrn.matcher(userName);
        if(mtch.matches()){
            return true;
        }
        return false;
    }

    public static void main(String a[]){
        String email = "hello@gmail.com";
        System.out.println("Valid email address? : ");
        System.out.println(email + " - "+ validateEmailAddress(email));
        email = "cric*7*&@yahoo.com";
        System.out.println(email + " - "+ validateEmailAddress(email));
        email = "hello.gmail.com";
        System.out.println(email + " - "+ validateEmailAddress(email));
        email = "qweqwe.1@gmail.qq";
        System.out.println(email + " - "+ validateEmailAddress(email));
    }
}