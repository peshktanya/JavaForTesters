package Lesson22.DateTime;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;

import static org.testng.Assert.assertEquals;


public class DateTest {

    @Test
    public void dateExploration(){

        Date date = new Date();

        Date equivDate1 = new Date();
        Date equivDate2 = new Date(System.currentTimeMillis());
        System.out.println(date.getTime());
        System.out.println(System.currentTimeMillis());

        assertEquals(equivDate1, equivDate2);


        System.out.println(new Date().getTime());
        System.out.println(System.currentTimeMillis());

        System.out.println(date.toString());

        long oneWeekFromNowTime = date.getTime();
        oneWeekFromNowTime = oneWeekFromNowTime +
                             (1000 * 60 * 60 * 24 * 7);
        Date oneWeekFromNow = new Date(oneWeekFromNowTime);
        System.out.println(oneWeekFromNow.toString());

        assertEquals(oneWeekFromNow.after(date), (true));
        assertEquals(date.before(oneWeekFromNow), (true));
        assertEquals(date.compareTo(oneWeekFromNow), (-1));
        assertEquals(oneWeekFromNow.compareTo(date), (1));

        Date sameDate = new Date();
        sameDate.setTime(date.getTime());
        assertEquals(date.equals(sameDate), (true));
        assertEquals(date.compareTo(sameDate), (0));
    }

}