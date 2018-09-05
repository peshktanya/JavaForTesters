package OOP.Lesson6_Static;

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

public class StaticFinal {
    final static String company = "British Movie";
    String name;
    int no;

    public static void main(String[] args)
    {
        StaticFinal ob = new StaticFinal();

        // If we create a database for GFG org
        // then the company name should be constant
        // It can’t be changed by programmer.
        //ob.company = "SomeCoolCompany";

        ob.name = "Bond";
        ob.no = 007;

        System.out.println(company); // because it is static
        System.out.println(ob.company);
        System.out.println(ob.name);
        System.out.println(ob.no);
    }
}