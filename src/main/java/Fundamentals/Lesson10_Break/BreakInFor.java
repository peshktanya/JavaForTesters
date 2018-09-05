package Fundamentals.Lesson10_Break;

public class BreakInFor {
    public static void main(String[] args) {

        for(int i = 1; i < 100; i++) {
            if(i == 5) break; // выходим из цикла, если i равно 5
            System.out.println("i: " + i);
        }
        System.out.println("Цикл FOR завершён");

    }
}
