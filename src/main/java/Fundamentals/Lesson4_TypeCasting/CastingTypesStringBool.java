package Fundamentals.Lesson4_TypeCasting;

public class CastingTypesStringBool {
    public static void main(String[] args) {
        //  booleans?
        String areYouHappy = "true";
        boolean ishappy = Boolean.parseBoolean(areYouHappy);
        System.out.println(ishappy);

        //  String to double?
        String Pi = "3.14";
        Double realPi = Double.parseDouble(Pi);
        System.out.println(2 * realPi - 1.0);
    }
}
