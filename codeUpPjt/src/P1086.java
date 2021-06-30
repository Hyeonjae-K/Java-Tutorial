package codeUpPjt.src;

import java.io.*;

public class P1086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        float n = 1;
        for (String num : nums) {
            n *= Integer.parseInt(num);
        }
        n /= (8 * 1024 * 1024);
        System.out.printf("%.2f MB", n);
    }
}
