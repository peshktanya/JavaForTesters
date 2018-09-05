package Fundamentals.Lesson12_Arrays;

import java.util.Arrays;
import java.util.Collections;

public class WorkingWithSearchArray {
    public static void main(String[] args)
    {
        byte byteArr[] = {10,20,15,22,35,24,7};
        Arrays.sort(byteArr);
        byte byteKey = 35;
        System.out.println(byteKey + " found at index = " +Arrays.binarySearch(byteArr,byteKey));

    }
}
