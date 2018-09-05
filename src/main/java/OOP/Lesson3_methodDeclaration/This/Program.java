package OOP.Lesson3_methodDeclaration.This;

public class Program{

    public static void main(String[] args) {

        Person johnSmith = new Person();
        johnSmith.displayInfo();

        Person tom = new Person("Tom");
        tom.displayInfo();

        Person sam = new Person("Sam", 25);
        sam.displayInfo();
    }
}

