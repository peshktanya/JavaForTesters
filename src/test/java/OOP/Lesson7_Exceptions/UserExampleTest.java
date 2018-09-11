package OOP.Lesson7_Exceptions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserExampleTest {

    @Test//(expectedExceptions = IllegalArgumentException.class)
    public void passwordMustBeGreaterThan6Chars(){

        User user = new User("username", "123456");
    }


    @Test(expectedExceptions = IllegalArgumentException.class)
    public void passwordMustHaveADigit(){

        User user = new User("username", "qwertyui");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void passwordMustHaveUppercase(){
         User user = new User("username", "qwertyui123");
    }

    @Test //(expectedExceptions = IllegalArgumentException.class)
    public void passwordSetSuccessfully(){
        String password = "ABCabc123";
        //String password = "123";
        User user = new User("John Smith", password);
        Assert.assertEquals(user.getPassword(), password);
    }
}