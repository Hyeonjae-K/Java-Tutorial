package codeUpPjt.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1055 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        if (Integer.parseInt(nums[0]) == 0 && Integer.parseInt(nums[1]) == 0) {
            System.out.print(0);
        } else {
            System.out.print(1);
        }
    }
}
