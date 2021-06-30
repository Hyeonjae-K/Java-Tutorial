package codeUpPjt.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] tmpStrings = br.readLine().split(" ");
        Integer[] nums = new Integer[24];
        Arrays.fill(nums, 0);
        for (String tmp : tmpStrings) {
            int num = Integer.parseInt(tmp);
            nums[num] += 1;
        }
        for (int i = 1; i < 24; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
