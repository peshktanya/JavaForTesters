package OOP.Lesson6_Static;

public class StaticBlock {
    // static variable
    static int a = 10;
    static int b;

    /**
     * Static block is used for initializing the static variables.
     * This block gets executed when the class is loaded in the memory.
     * A class can have multiple Static blocks,
     * which will execute in the same sequence in which they have been written into the program.
     */

    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }

    public static void main(String[] args)
    {
        System.out.println("from main");
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
    }
}
