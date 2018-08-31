package Fundamentals.Lesson3_Operators;

public class Lesson3TernaryOperator {
    public static void main(String[] args) {
        /**
         * переменная x = (выражение) ? значение if true : значение if false
         */
        int a , b;
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println( "Значение b: " +  b );

        b = (a == 10) ? 20 : 30;
        System.out.println( "Значение b: " + b );
    }
}
