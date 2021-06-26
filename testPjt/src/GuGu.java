package testPjt.src;

public class GuGu {
    public static void printMul(int a, int b) {
        System.out.printf("%d * %d = %2d\n", a, b, a * b);
    }

    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                printMul(i, j);
            }
        }
    }
}
