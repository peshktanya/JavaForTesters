package OOP.Lesson4_VarArgs;

public class Arguments {
    // A method that takes variable number of integer
    // arguments.
    static void items(String ...a)
    {
        System.out.println("Number of arguments: " + a.length);
        // using for each loop to display contents of a
        for (String i: a)
            System.out.print(i + " ");
        System.out.println();
    }

    // Driver code
    public static void main(String args[])
    {
        // Calling the varargs method with different number
        // of parameters
        items("one");         // one parameter
        items("one", "two", "three", "four");  // four parameters
        items();            // no parameter
    }
}
