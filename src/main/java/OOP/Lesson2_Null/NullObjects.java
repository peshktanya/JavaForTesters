package OOP.Lesson2_Null;

public class NullObjects {
    private static Object myObj;

    public static void main(String[] args) {
        Object obj = null;
        System.out.println("What is value of myObject : " + myObj);

        String str = null; // null can be assigned to String
        Integer itr = null; // you can assign null to Integer also
        Double dbl = null; // null can also be assigned to Double
        String myStr = (String) null; // null can be type cast to String
        Integer myItr = (Integer) null; // it can also be type casted to Integer
        Double myDbl = (Double) null; // yes it's possible, no error

        //int i = null;    // type mismatch : cannot convert from null to int
        //short s = null;  // type mismatch : cannot convert from null to short
        //byte b = null;   // type mismatch
        //double d = null; // type mismatch
        int j = itr;        // this is ok, but NullPointerException in Runtime

        System.out.println(str + itr + dbl + myStr + myItr + myDbl);
    }
}