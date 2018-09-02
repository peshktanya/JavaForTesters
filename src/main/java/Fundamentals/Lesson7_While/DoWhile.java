package Fundamentals.Lesson7_While;

public class DoWhile {
    public static void main(String[] args) throws InterruptedException {

        int i = 3;
        do {
            System.out.println(i);
            i++;
            Thread.sleep(100);
        } while (i<3);

        i = 3;
        while (i<3)
            {
                System.out.println(i);
                i++;
                Thread.sleep(100);
            }
    }
}
