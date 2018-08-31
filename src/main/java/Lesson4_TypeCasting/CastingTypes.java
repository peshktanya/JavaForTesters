package Lesson4_TypeCasting;

public class CastingTypes {
    public static void main(String[] args) {
        double d = 100.04;
        long l = (long)d;  //explicit type casting required
        int i = (int)d;	//explicit type casting required

        System.out.println("Double value "+d);
        System.out.println("Long value "+l);
        System.out.println("Int value "+i);
    }
}
