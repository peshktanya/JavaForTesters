package Lesson22.DateTime;

import org.testng.annotations.Test;

import java.util.Calendar;
import java.util.Date;

import static org.testng.Assert.assertEquals;

public class CalendarTest {

    @Test
    public void calendarExploration(){

        Calendar cal = Calendar.getInstance();

        System.out.println(cal.getTime().getTime());
        System.out.println(System.currentTimeMillis());

        System.out.println(cal.toString());

        Calendar sameDate = Calendar.getInstance();
        sameDate.setTime(cal.getTime());
        assertEquals(cal.equals(sameDate), (true));
        assertEquals(cal.compareTo(sameDate), (0));

        System.out.println(cal.getTime().toString());
        Calendar oneWeekFromNow = Calendar.getInstance();
        oneWeekFromNow.setTime(cal.getTime());
        oneWeekFromNow.add(Calendar.DATE,7);
        System.out.println(oneWeekFromNow.getTime().toString());

        assertEquals(oneWeekFromNow.after(cal), (true));
        assertEquals(cal.before(oneWeekFromNow), (true));
        assertEquals(cal.compareTo(oneWeekFromNow), (-1));
        assertEquals(oneWeekFromNow.compareTo(cal), (1));
    }

    @Test
    public void setCalendarFields(){

        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.YEAR, 2013);
        cal.set(Calendar.MONTH, 11);  // starts at 0
        cal.set(Calendar.DAY_OF_MONTH, 15);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 39);
        cal.set(Calendar.SECOND, 54);
        cal.set(Calendar.MILLISECOND, 123);

        cal.set(Calendar.MONTH, Calendar.DECEMBER);

        System.out.println(cal.getTime().toString());

        cal.set(2013, 11, 15);
        cal.set(2013, Calendar.DECEMBER, 15);
        cal.set(2013, 11, 15, 23, 39);
        cal.set(2013, Calendar.DECEMBER, 15, 23,39, 54);

        assertEquals(cal.get(Calendar.YEAR), (2013));

        cal.setTimeInMillis(0L);
        assertEquals(cal.get(Calendar.YEAR), (1970));

        cal.setTime(new Date(0L));
        assertEquals(cal.get(Calendar.YEAR), (1970));

        cal.setWeekDate(2013, 3, Calendar.THURSDAY);
        assertEquals(cal.get(Calendar.MONTH), (Calendar.JANUARY));
        assertEquals(cal.get(Calendar.DAY_OF_MONTH), (17));
    }

    @Test
    public void getCalendarDetails(){
        Calendar cal = Calendar.getInstance();
        cal.set(2013, Calendar.DECEMBER, 15, 23,39, 54);

        assertEquals(cal.get(Calendar.MONTH), (Calendar.DECEMBER));
    }

    @Test
    public void addDaysToCalendar(){
        Calendar cal = Calendar.getInstance();
        cal.set(2013, Calendar.DECEMBER, 15, 23,39, 54);

        cal.add(Calendar.HOUR_OF_DAY, -1);
        assertEquals(cal.get(Calendar.HOUR_OF_DAY), (22));

        cal.add(Calendar.MINUTE, 10);
        assertEquals(cal.get(Calendar.MINUTE), (49));
    }
}