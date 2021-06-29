package codeUpPjt.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        for (int i = 0; i < nums.length; i++) {
            if (Integer.parseInt(nums[i]) % 2 == 0) {
                System.out.println(nums[i]);
            }
        }
    }
}
