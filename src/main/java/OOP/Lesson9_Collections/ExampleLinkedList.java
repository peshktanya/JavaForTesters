package OOP.Lesson9_Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ExampleLinkedList {
    public static void main(String args[]){
        LinkedList<String> list =new LinkedList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("z");
        list.add("x");

        //displaying elements
        System.out.println("Initial LinkedList Content: " +list);

        /*Add First and Last Element*/
        list.addFirst("y");
        list.addLast("y");
        System.out.println("LinkedList Content after addition: " +list);

        /*This is how to get and set Values*/
        list.set(0, "Q");
        System.out.println("First element after update by set method: " +list.get(0));

        /*Remove first and 2 last elements*/
        list.remove();
        list.remove(list.size()-2);
        list.removeLast();
        System.out.println("LinkedList after deletion of 2 last elements: " +list);

    }
}