package OOP.Lesson9_Collections;

import java.util.*;

public class ListSortExample {

    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>();
        Random random = new Random();
        // Fill the list with random integers
        for (int i = 0; i < 10; i++)
            ints.add(random.nextInt(100));
        System.out.println("Initial list: "+ints);

        //natural sorting using Collections class
        Collections.sort(ints);
        System.out.println("Natural Sorting: "+ints);
    }

}