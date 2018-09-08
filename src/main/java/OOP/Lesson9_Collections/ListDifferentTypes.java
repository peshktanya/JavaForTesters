package OOP.Lesson9_Collections;

import java.util.ArrayList;
import java.util.List;

public class ListDifferentTypes
{
    public static void main (String[] args)
    {
        // Let us create a list
        List list = new ArrayList();
        list.add(0, 1);  // adds 1 at 0 index
        list.add(1, "Two");  // adds 2 at 1 index
        list.add('c');
        list.add(3, null);
        list.add(4, 0.25);
        list.add(5, true);
        list.add(false);

        System.out.println(list);  // [1, 2]

        list.set(0, "One");   // replace 0th element with 5
        System.out.println(list);  // [5, 2, 3, 2]
    }
}
