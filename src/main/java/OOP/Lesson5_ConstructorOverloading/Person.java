package OOP.Lesson5_ConstructorOverloading;

public class Person
{
    // constructor with no argument
    Person()
    {

        System.out.println("Constructor with no arguments");
    }

    // constructor with one argument
    Person(String name)
    {
        System.out.println("Constructor with one " +
                "argument - String : " + name);
    }

    // constructor with two arguments
    Person(String name, int age)
    {
        System.out.println("Constructor with two arguments : " +
                " String and Integer : " + name + " "+ age);

    }

    // Constructor with one argument but with different
    // type than previous..
    Person(long id)
    {
        System.out.println("Constructor with one argument : " +
                "Long : " + id);
    }
}

class Main
{
    public static void main(String[] args)
    {
        Person person1 = new Person();

        // Invoke the constructor with one argument of
        // type 'String'.
        Person person2 = new Person("Petro");

        // Invoke the constructor with two arguments
        Person person3 = new Person("Dmytro", 26);

        // Invoke the constructor with one argument of
        // type 'Long'.
        Person person4 = new Person(325614567);
    }
}
