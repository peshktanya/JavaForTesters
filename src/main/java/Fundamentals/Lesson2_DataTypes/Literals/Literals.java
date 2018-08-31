package Fundamentals.Lesson2_DataTypes.Literals;

public class Literals {

    //INTEGER LITERALS
    //===============================
    // The number 26, in decimal
    int decVal = 26;
    //  The number 26, in hexadecimal
    int hexVal = 0x1a;
    // The number 26, in binary
    int binVal = 0b11010;

    //Floating-Point Literals
    //==============================
    double d1 = 123.4;
    // same value as d1, but in scientific notation
    double d2 = 1.234e2;
    float f1  = 123.4f;

    //Character and String Literals
    //==============================
    String s1 = "\b (backspace)";
    String s2 = "\t (tab)";
    // \n (line feed), \f (form feed), \r (carriage return), \" (double quote), \' (single quote), and \\ (backslash).

    // Invalid: cannot put underscores
    // adjacent to a decimal point
    //float pi1 = 3_.1415F;
    // Invalid: cannot put underscores
    // adjacent to a decimal point
    //float pi2 = 3._1415F;
    // Invalid: cannot put underscores
    // prior to an L suffix
    //long socialSecurityNumber1 = 999_99_9999_L;

    // OK (decimal literal)
    int x1 = 5_2;
    // Invalid: cannot put underscores
    // At the end of a literal
    //int x2 = 52_;
    // OK (decimal literal)
    int x3 = 5_______2;

    // Invalid: cannot put underscores
    // in the 0x radix prefix
    //int x4 = 0_x52;
    // Invalid: cannot put underscores
    // at the beginning of a number
    //int x5 = 0x_52;
    // OK (hexadecimal literal)
    int x6 = 0x5_2;
    // Invalid: cannot put underscores
    // at the end of a number
    //int x7 = 0x52_;
}
