package OOP.Lesson5_ConstructorOverloading;

public class Overloading
{
    public void disp(char c)
    {
        System.out.println(c);
    }
    public void disp(int c)
    {
        System.out.println(c);
    }
}

class Sample
{
    public static void main(String args[])
    {
        Overloading obj = new Overloading();
        obj.disp('a');
        obj.disp(5);
    }
}
