package testPjt.src;

import java.util.ArrayList;

public class ForEachStatement {
    public static void main(String[] args) {
        String[] numbers = { "one", "two", "three" };

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        for (String number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        ArrayList<String> nums = new ArrayList<String>();
        nums.add("one");
        nums.add("two");
        nums.add("three");

        for (String num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
