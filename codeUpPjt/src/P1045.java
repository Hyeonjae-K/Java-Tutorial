package codeUpPjt.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1045 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        int a = Integer.parseInt(nums[0]), b = Integer.parseInt(nums[1]);
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.printf("%.2f", (float) a / b);
    }
}
