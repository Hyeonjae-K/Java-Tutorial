package codeUpPjt.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1049 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        int a = Integer.parseInt(nums[0]), b = Integer.parseInt(nums[1]);
        if (a > b) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}
