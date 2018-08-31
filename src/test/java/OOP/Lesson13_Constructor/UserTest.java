package OOP.Lesson13_Constructor;

import OOP.Lesson5_ConstructorOverloading.User;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class UserTest {

    @Test
    public void canConstructANewUser(){
        User user = new User();
    }

    @Test
    public void userHasDefaultUsernameAndPassword(){

        User user = new User();

        assertEquals("default username expected",
                "username",
                user.getUsername());

        assertEquals("default password expected",
                "password",
                user.getPassword());
    }

    @Test
    public void canConstructWithUsernameAndPassword(){

        User user = new User("admin", "pA55w0rD");

        assertEquals("given username expected",
                "admin",
                user.getUsername());

        assertEquals("given password expected",
                "pA55w0rD",
                user.getPassword());
    }

    @Test
    public void canSetPasswordAfterConstructed(){

        User user = new User();

        user.setPassword("PaZZwor6");

        assertEquals("setter password expected",
                "PaZZwor6",
                user.getPassword());
    }
}