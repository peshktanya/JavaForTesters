package Fundamentals.Lesson12_Arrays;

import java.util.Arrays;
import java.util.Collections;

public class WorkingWithSortStringArray {
    public static void main(String[] args)
    {
        String searchEngines[] = {"google", "yahoo", "yandex", "bing"};

        // Sorts arr[] in ascending order
        Arrays.sort(searchEngines);
        System.out.printf("Sort ascending : \n%s\n\n",
                Arrays.toString(searchEngines));

        // Sorts arr[] in descending order
        Arrays.sort(searchEngines, Collections.reverseOrder());

        System.out.printf("Sort descending : \n%s\n\n",
                Arrays.toString(searchEngines));

    }
}
