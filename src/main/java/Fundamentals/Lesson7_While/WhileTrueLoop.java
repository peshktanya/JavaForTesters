package Fundamentals.Lesson7_While;

public class WhileTrueLoop {
    public static void main(String args[]) throws InterruptedException {
        int i=1;
        while(true)
        {
            System.out.println(i);
            i++;
            Thread.sleep(500);
        }
    }
}
