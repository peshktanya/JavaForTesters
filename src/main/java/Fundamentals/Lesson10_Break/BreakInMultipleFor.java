package Fundamentals.Lesson10_Break;

public class BreakInMultipleFor {
    public static void main(String[] args) {


       for (int f = 1; f < 3; f++) {
            System.out.println("OUT: " + f);
            for (int j = 0; j < 100; j++) {
                if (j == 5)
                    break; // выходим из цикла, если j равно 5
                System.out.println("IN: " + j);
            }
            System.out.println();
        }

    }
}
