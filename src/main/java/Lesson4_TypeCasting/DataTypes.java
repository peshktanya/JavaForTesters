package Lesson4_TypeCasting;

public class DataTypes {
    public static void main(String[] args) {
        // What about booleans?
        String areYouHappy = "true";
        boolean ishappy = Boolean.parseBoolean(areYouHappy);
        System.out.println(ishappy);

        // Or String to double?
        String gpa = "3.96";
        Double realgpa = Double.parseDouble(gpa);
        System.out.println(realgpa - 1.0);
    }
}
