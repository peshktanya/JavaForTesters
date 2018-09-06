package OOP.Lesson6_Static;

public class MethodStatic {
    // static method
    static void m1()
    {
        System.out.println("from m1");
    }

    public static void main(String[] args)
    {
        MethodStatic method1 = new MethodStatic();
        method1.m1();
        // calling m1 without creating
        // any object of class Test
        m1();
    }
}
