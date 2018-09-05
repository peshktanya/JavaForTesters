package OOP.Lesson1_AccessModifiers;

public class Program{

    public static void main(String[] args) {

        Person john = new Person("John", 22, "Baker Street", "+12334567");
        john.displayName();     // норм, метод public
        john.displayAge();      // норм, метод имеет модификатор по умолчанию
        //john.phone;
        john.displayPhone();    // норм, метод protected
        //kate.displayAddress();  // ! Ошибка, метод private

        System.out.println(john.name);      // норм, модификатор по умолчанию
        System.out.println(john.address);   // норм, модификатор public
        System.out.println(john.age);       // норм, модификатор protected
        //System.out.println(kate.phone);   // ! Ошибка, модификатор private
    }
}
