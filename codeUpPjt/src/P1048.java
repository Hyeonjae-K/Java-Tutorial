package codeUpPjt.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1048 {
    public static int power(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (b == 1) {
            return a;
        } else if (b % 2 == 0) {
            return power(a * a, b / 2);
        }
        return a * power(a * a, b / 2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        int a = Integer.parseInt(nums[0]), b = Integer.parseInt(nums[1]);
        System.out.print(a * power(2, b));
    }
}
