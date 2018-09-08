package OOP.Lesson9_Collections;

import java.util.ArrayList;

public class ExampleArrayListRemove {
    public static void main(String args[]){
        ArrayList<String> arrList=new ArrayList<>();

        arrList.add("Bond");
        arrList.add("James");
        arrList.add("John");
        arrList.add("Smith");
        arrList.add("Lady");
        arrList.add("Gaga");

        //displaying elements
        System.out.println(arrList);

        //Removing
        arrList.remove("Lady");
        arrList.remove("Gaga");

        //Removing 3rd element
        arrList.remove(2);

        //displaying elements
        System.out.println(arrList);
    }
}