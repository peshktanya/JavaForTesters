package Fundamentals.Lesson12_Arrays;

import java.util.Arrays;

public class EqualsIntArray {
    public static void main(String[] args) {

        // initiliazing three object arrays
        int[] arr1 = new int[] { 192, 168 };
        int[] arr2 = new int[] { 192, 168, 0, 1 };
        int[] arr3 = new int[] { 192, 168 };
        int[] arr4 = new int[] { 192, 168, 0, 0 };

        // comparing arr1 and arr2
        System.out.println("arr1 and arr2 equal: " + Arrays.equals(arr1, arr2));

        // comparing arr1 and arr3
        System.out.println("arr1 and arr3 equal: " + Arrays.equals(arr1, arr3));

        Arrays.fill(arr4, 0);
        System.out.println("Array completely filled" + Arrays.toString(arr4));
        Arrays.fill(arr4, 1, 3, 1);
        System.out.println("Array partly filled" + Arrays.toString(arr4));
    }
}
