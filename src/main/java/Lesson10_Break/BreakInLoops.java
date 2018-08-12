package Lesson10_Break;

public class BreakInLoops {
    public static void main(String[] args) {

        for(int i = 1; i < 100; i++) {
            if(i == 5) break; // выходим из цикла, если i равно 5
            System.out.println("i: " + i);
        }
        System.out.println("Цикл FOR завершён");

/*
        int i = 1;
        while(true) {
            if(i == 5) break; // выходим из цикла, если i равно 5
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("Цикл WHILE завершён");
*/
 /*       for (int f = 1; f < 3; f++) {
            System.out.println("OUT: " + f);
            for (int j = 0; j < 100; j++) {
                if (j == 5)
                    break; // выходим из цикла, если j равно 5
                System.out.println("IN: " + j);
            }
            System.out.println();
        }
        */


    }
}
