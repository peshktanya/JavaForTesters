package Fundamentals.Lesson12_Arrays;

public class MultiDimentionalArray {
    public static void main(String[] args) {

        int[][] a = {
                {1, 2, 3, 5},
                {4, 5, 6, 9},
                {7, 5, 0, 6},
        };

        System.out.println("Using For loop:");
        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nUsing ForEach loop:");
        for (int[] innerArray: a) {
            for (int data : innerArray) {
                System.out.print(data + " ");
            }
            System.out.println();
        }

    }
}
