package testPjt.src;

import java.util.Arrays;

public class SelfNumber {
    public static int getSelfNum(int n) {
        int result = n;
        while (n != 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        boolean[] A = new boolean[5000];
        Arrays.fill(A, false);

        for (int i = 1; i < 5000; i++) {
            int selfNum = getSelfNum(i);
            if (selfNum < 5000) {
                A[selfNum] = true;
            }
        }

        for (int i = 1; i < 5000; i++) {
            if (A[i] == false) {
                System.out.println(i);
            }
        }
    }
}
