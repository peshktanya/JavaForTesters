package OOP.Lesson9_Collections;

import java.util.List;
import java.util.LinkedList;

public class ExampleListNumbers {
    public static void main(String[] args) {

        List<Number> linkedNumbers = new LinkedList<>();
        linkedNumbers.add(new Integer(123));
        linkedNumbers.add(new Float(3.1415));
        linkedNumbers.add(new Double(299.988));
        linkedNumbers.add(new Long(67000));

        System.out.println(linkedNumbers);
    }

}
