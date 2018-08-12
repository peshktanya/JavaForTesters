package Lesson17_Static;

public class StaticFinal {
}

// Java program to illustrate the behavior of
// final static variable
class FinalNotInit {
    //final static int x;
    public static void main(String[] args)
    {
    }
}

// Java program to illustrate that final
// static variable can be initialized
// at the time of declaration
class FinalDeclaration {
    final static int x = 10;
    public static void main(String[] args)
    {
        System.out.println(x);
    }
}

// Java program to illustrate that final
// static variable can be initialized
// inside static block
class FinalStaticBlock {
    final static int x;
    static
    {
        x = 10;
    }
    public static void main(String[] args)
    {
        System.out.println(x);
    }
}

class MainClass {
    final static String company = "MainAcademy";
    String name;
    int rollno;
    public static void main(String[] args)
    {
        MainClass ob = new MainClass();

        // If we create a database for GFG org
        // then the company name should be constant
        // It can’t be changed by programmer.
        //ob.company = "SomeCoolCompany";

        ob.name = "Bishal";
        ob.rollno = 007;
        System.out.println(ob.company);
        System.out.println(ob.name);
        System.out.println(ob.rollno);
    }
}