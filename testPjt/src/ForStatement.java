package testPjt.src;

public class ForStatement {
    public static void main(String[] args) {
        String[] numbers = { "one", "two", "three" };
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int[] scores = { 90, 25, 67, 45, 80 };
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 60) {
                System.out.println((i + 1) + ": Pass");
            } else {
                System.out.println((i + 1) + ": Fail");
            }
        }
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 60) {
                continue;
            } else {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}
