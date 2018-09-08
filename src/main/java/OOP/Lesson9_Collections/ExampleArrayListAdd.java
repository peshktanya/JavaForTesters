package OOP.Lesson9_Collections;

import java.util.*;
public class ExampleArrayListAdd {
    public static void main(String args[]){
        ArrayList<String> arrList=new ArrayList<>();
      //  ArrayList<int> arrInt=new ArrayList<int>();
      //  ArrayList<Integer> arrInt=new ArrayList<Integer>();

        arrList.add("Bond");
        arrList.add("James");
        arrList.add("John");
        arrList.add("Smith");
        arrList.add("Lady");
        arrList.add("Gaga");

        //displaying elements
        System.out.println(arrList);

        //Adding "Steve" at the fourth position
        arrList.add(3, "Steve");
        arrList.add(4, "Jobs");

        //displaying elements
        System.out.println(arrList);

        // Update element
        arrList.set(arrList.size()-1, "GaGaGa");
        //displaying elements
        for(String str:arrList)
            System.out.print(str+" ");

}
}