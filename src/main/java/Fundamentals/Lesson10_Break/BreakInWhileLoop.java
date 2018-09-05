package Fundamentals.Lesson10_Break;

public class BreakInWhileLoop {
    public static void main(String[] args) {


        int i = 1;
        while(true) {
            if(i == 5) break; // выходим из цикла, если i равно 5
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("Цикл WHILE завершён");


    }
}
