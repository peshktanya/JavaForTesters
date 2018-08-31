package Fundamentals.Lesson3_Operators;

public class Lesson3BooleanOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a && b = " + (a&&b));
        System.out.println("a || b = " + (a||b) );
        System.out.println("!(a && b) = " + !(a && b));
    }
}
