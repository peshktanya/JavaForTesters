package Fundamentals.Lesson8_For;

public class ForEach {
    public static void main(String[] args) {

        //foreach
        int[] nums = { 1, 2, 3, 4, 5 };
        int sum = 0;

        for(int i : nums)   //  for(int i = 0; i < 5; i++)
            sum += i;       //  sum += nums[i];
        System.out.println("sum: " + sum);
    }
}
