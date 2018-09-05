package Fundamentals.Lesson1_Class;

import org.testng.annotations.Test;

public class ASysOutTestNgTest {

    @Test
    public void canOutputHelloWorldToConsole(){
        AClassWithAMethod myClass = new AClassWithAMethod();
        myClass.aMethodOnAClass();
    }
}
