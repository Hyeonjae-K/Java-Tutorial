package testPjt.src;

public class MultipleOf3and5 {
    public static boolean isMulOf3(int a) {
        if (a % 3 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int result = 0;

        for (int i = 3; i < 1000; i += 3) {
            result += i;
        }
        for (int i = 5; i < 1000; i += 5) {
            if (i % 3 != 0) {
                result += i;
            }
        }

        System.out.println(result);
    }
}
