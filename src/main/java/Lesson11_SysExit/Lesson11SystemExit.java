package Lesson11_SysExit;

public class Lesson11SystemExit {
    public static void main(String[] args)
    {
        for (int i = 1; i < 5; i++)
        {
            if (i >= 3)
            {
                System.out.println("exit...");
                // Terminate JVM
                System.exit(0);
            }
            else
                System.out.println("i = " + i);
        }
        System.out.println("End of Program"); // is never executed
    }
}
