package Lesson22.DateTime;


import org.apache.commons.lang3.time.StopWatch;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.Instant;

public class TimeStopWatch {

    @Test
    public void getExecutionTime1() {

        Instant start = Instant.now();
        long total = 0;
        for (int i = 0; i < 1000000; i++) {
            total += i;
        }
        Instant finish = Instant.now();
        long elapsedTime = Duration.between(start, finish).toMillis();
        System.out.println("Time Elapsed: " + elapsedTime);
        Assert.assertTrue(elapsedTime < 5, "Elapsed time more than expected");

    }

    @Test
    public void getExecutionTime2(){

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

    @Test
    public void getExecutionTime3(){

        StopWatch watch = new StopWatch();
        watch.start();
        long total = 0;
        for (int i = 0; i < 1000000; i++) {
            total += i;
        }
        watch.stop();
        System.out.println("Time Elapsed: " + watch.getTime());
        Assert.assertTrue(watch.getTime() < 5, "Elapsed time more than expected");

    }

}

