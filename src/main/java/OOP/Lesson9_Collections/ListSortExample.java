package OOP.Lesson9_Collections;

import java.util.*;

public class ListSortExample {

    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) ints.add(random.nextInt(1000));

        //natural sorting using Collections class
        Collections.sort(ints);
        System.out.println("Natural Sorting: "+ints);

        //My custom sorting, reverse order
        ints.sort((o1,o2) -> {return (o2-o1);});
        System.out.println("Reverse Sorting: "+ints);
    }

}