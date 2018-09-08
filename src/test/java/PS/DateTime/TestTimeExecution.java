package PS.DateTime;


import org.apache.commons.lang3.time.StopWatch;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.Instant;

import static java.lang.Thread.sleep;

public class TestTimeExecution {

    @Test
    public void getExecutionTimeUsingInstantNow() throws InterruptedException {

        Instant start = Instant.now();
        long total = 0;
        for (int i = 0; i < 10; i++) {
            sleep(1);
            total += i;
        }
        Instant finish = Instant.now();
        long elapsedTime = Duration.between(start, finish).toMillis();
        System.out.println("Time Elapsed: " + elapsedTime);
        Assert.assertTrue(elapsedTime < 20, "Elapsed time more than expected");

    }

    @Test
    public void getExecutionTimeUsingSystemCurrent() throws InterruptedException{

        long startTime = System.currentTimeMillis();

        long total = 0;
        for (int i = 0; i < 10; i++) {
            sleep(1);
            total += i;
        }

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Execution time in msec is: " + elapsedTime);
        Assert.assertTrue(elapsedTime < 20, "Elapsed time more than expected");
    }

    @Test
    public void getExecutionTimeUsingStopWatch()throws InterruptedException{

        StopWatch watch = new StopWatch();
        watch.start();
        long total = 0;
        for (int i = 0; i < 10; i++) {
            sleep(1);
            total += i;
        }
        watch.stop();
        System.out.println("Time Elapsed: " + watch.getTime());
        Assert.assertTrue(watch.getTime() < 20, "Elapsed time more than expected");

    }

}

