package Fundamentals.Lesson8_For;

public class ForEverySecondOut {
    public static void main(String[] args) {

        for (int kitten = 1; kitten < 10; kitten++) {
            System.out.println("Считаем котят: " + kitten);
        }

        for (int x = 0; x < 9; x += 2)
            System.out.println(" " + x); // вывод четных чисел

    }
}
