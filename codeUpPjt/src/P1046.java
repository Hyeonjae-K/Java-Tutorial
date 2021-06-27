package codeUpPjt.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        int a = Integer.parseInt(nums[0]), b = Integer.parseInt(nums[1]), c = Integer.parseInt(nums[2]);
        System.out.println((long) a + b + c);
        System.out.printf("%.1f", (float) (a + b + c) / 3);
    }
}
