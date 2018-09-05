package OOP.Lesson3_methodDeclaration.This;

class Person{

    String name;    // имя
    int age;        // возраст

    //Три конструктора, которые выполняют идентичные действия: устанавливают поля name и age.
    // 1. Без параметров, вызывает  третий конструктор Person(String name, int age)
    Person()
    {
        this("John Smith", 18);
    }
    //2. с одним параметром, вызывает  третий конструктор Person(String name, int age)
    Person(String name)
    {
        this(name, 18);
    }


    // 3. с двумя параметрами
    //параметры называются так же, как и поля класса
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}
