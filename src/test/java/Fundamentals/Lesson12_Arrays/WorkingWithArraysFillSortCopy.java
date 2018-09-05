package Fundamentals.Lesson12_Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class WorkingWithArraysFillSortCopy {

    String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

    @Test
    public void integerArrayDefaultsOnIncrease(){

        int[] three = {1, 2, 3};

        int[] five = Arrays.copyOf(three,5);
        Assert.assertEquals(3, five[2]);
        Assert.assertEquals(0, five[3]);
    }

    @Test
    public void sortArrayOfInt(){
        int[] outOfOrder = {2,4,3,1,5,0};

        Arrays.sort(outOfOrder);

        Assert.assertEquals(0, outOfOrder[0]);
        Assert.assertEquals(1, outOfOrder[1]);
        Assert.assertEquals(2, outOfOrder[2]);
        Assert.assertEquals(3, outOfOrder[3]);
        Assert.assertEquals(4, outOfOrder[4]);
        Assert.assertEquals(5, outOfOrder[5]);
    }

    @Test
    public void fillAnArray(){

        int[] minusOne = new int[30];
        Arrays.fill(minusOne,-1);

        for(int arrayInt : minusOne){
            Assert.assertEquals(-1, arrayInt);
        }
    }

    @Test
    public void fillPartOfAnArray(){
        int[] tenItems = {0,0,0,0,0,1,1,1,1,1};

        // fill cells 5 - 9 with '2'
        Arrays.fill(tenItems,5,10,2);

        // 0 - 4 are untouched
        Assert.assertEquals(0, tenItems[0]);
        Assert.assertEquals(0, tenItems[4]);

        // 5 - 9 now equal 2
        Assert.assertEquals(2, tenItems[5]);
        Assert.assertEquals(2, tenItems[6]);
        Assert.assertEquals(2, tenItems[7]);
        Assert.assertEquals(2, tenItems[8]);
        Assert.assertEquals(2, tenItems[9]);
    }

    @Test
    public void copyOfRange(){

        String[] weekDays = Arrays.copyOfRange(workdays, 2, 5);

        Assert.assertEquals(3, weekDays.length);
        Assert.assertEquals("Wednesday", weekDays[0]);
        Assert.assertEquals("Thursday", weekDays[1]);
        Assert.assertEquals("Friday", weekDays[2]);
    }

    @Test
    public void copyOfRangeResize(){
        String[] weekDays = Arrays.copyOfRange(workdays, 2, 7);

        Assert.assertEquals(5, weekDays.length);
        Assert.assertEquals("Wednesday", weekDays[0]);
        Assert.assertEquals("Thursday", weekDays[1]);
        Assert.assertEquals("Friday", weekDays[2]);
        Assert.assertEquals(null, weekDays[3]);
        Assert.assertEquals(null, weekDays[4]);
        Assert.assertEquals(weekDays[0], workdays[2]);
        Assert.assertEquals(weekDays[1], workdays[3]);
        Assert.assertEquals(weekDays[2], workdays[4]);
    }

    @Test
    public void arraysCopyOfAndResize(){

        String[] weekDays;
        weekDays = Arrays.copyOf(workdays, 7);

        weekDays[5] = "Saturday";
        weekDays[6] = "Sunday";

        String days="";
        for(String day: weekDays){
            days = days + "|" + day;
        }

        Assert.assertEquals(7, weekDays.length);
        Assert.assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday|Saturday|Sunday",days);
    }

    @Test
    public void arraysCopyOfSameSize(){
        String[] weekDays;

        weekDays = Arrays.copyOf(workdays, workdays.length);

        String days="";
        for(String day: weekDays){
            days = days + "|" + day;
        }

        Assert.assertEquals(5, weekDays.length);
        Assert.assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday",days);
    }
}