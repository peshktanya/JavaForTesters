package Lesson2_DataTypes.datatype2;

public class DataTypes {

    public static void main(String[] args) {
        // 1 + 2 equals 12? Whaaaaaaat??!?!?!?
        String x = "1";
        String y = "2";
        System.out.println(x + y);  // not what you expect;
        int i = Integer.parseInt(x);
        int j = Integer.parseInt(y);

        System.out.println(i + j);
    }
}
