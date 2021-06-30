package codeUpPjt.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1091 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        long a = Integer.parseInt(nums[0]);
        int r = Integer.parseInt(nums[1]);
        int d = Integer.parseInt(nums[2]);
        int n = Integer.parseInt(nums[3]);
        for (int i = 1; i < n; i++) {
            a = a * r + d;
        }
        System.out.print(a);
    }
}
