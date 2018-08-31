package OOP.Lessons.PS.RandomGenerator;

import java.util.Random;
public class RandomGen
{
    public static void main(String args[])
    {
        // create instance of Random class
        Random rand = new Random();

        int rand_int1 = rand.nextInt(100000000);
        int rand_int2 = rand.nextInt(100000000);

        // Print random integers
        System.out.println("Random Integers: "+rand_int1);
        System.out.println("Random Integers: "+rand_int2);



        }
}
