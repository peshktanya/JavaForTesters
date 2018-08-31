package OOP.Lesson1_AccessModifiers;

public class Person{

    String name;            //default
    protected int age;
    public String address;
    private String phone;

    //Constructor
    public Person(String name, int age, String address, String phone){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public void displayName(){
        System.out.printf("Name: %s \n", name);
    }

    //Default
    void displayAge(){
        System.out.printf("Age: %d \n", age);
    }

    private void displayAddress(){
        System.out.printf("Address: %s \n", address);
    }

    protected void displayPhone(){
        System.out.printf("Phone: %s \n", phone);
    }
}