package Lesson22.DateTime;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TimeTest {

    @Test
    public void createAUniqueUserID(){

        String userID = "user" + System.currentTimeMillis();

        System.out.println(userID);
        Assert.assertTrue(userID.startsWith("user"));
        Assert.assertTrue(Long.valueOf(userID.replace("user",""))>1000L);
    }

    @Test
    public void getExecutionTime(){

        long startTime = System.currentTimeMillis();

        long total = 0;
        for (int i = 0; i < 1000000; i++) {
            total += i;
        }

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Execution time in msec is: " + elapsedTime);
        Assert.assertTrue(elapsedTime < 5, "Elapsed time more than expected");
    }
}