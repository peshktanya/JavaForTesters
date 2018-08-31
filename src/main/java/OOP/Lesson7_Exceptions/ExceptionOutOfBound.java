package OOP.Lesson7_Exceptions;

public class ExceptionOutOfBound {

        public static void main (String[] args) {

            // array of size 4.
            int[] arr = new int[4];

            // this statement causes an exception
            int i = arr[4];

            // the following statement will never execute
            System.out.println("Hi, I want to execute");
        }

}
