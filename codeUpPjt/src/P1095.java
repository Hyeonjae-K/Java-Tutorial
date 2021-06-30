package codeUpPjt.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] nums = br.readLine().split(" ");
        int min = 23;
        for (String num : nums) {
            int t = Integer.parseInt(num);
            if (min > t) {
                min = t;
            }
        }
        System.out.print(min);
    }
}
