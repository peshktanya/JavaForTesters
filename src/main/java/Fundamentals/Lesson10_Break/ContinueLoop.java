package Fundamentals.Lesson10_Break;

public class ContinueLoop {
    public static void main(String[] args) {
        /***
         *  Если значение чётное,
         *  выполнение цикла продолжится дальше,
         *  а если нечётное, то произойдёт переход на новую строку
         */
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0)
                continue;
            System.out.print("\n");
        }
    }
}
