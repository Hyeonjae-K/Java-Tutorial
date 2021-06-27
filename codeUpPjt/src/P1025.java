package codeUpPjt.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        for (int i = 0; i < num.length(); i++) {
            System.out.printf("[%c", num.charAt(i));
            for (int j = 1; j < num.length() - i; j++) {
                System.out.print(0);
            }
            System.out.print("]\n");
        }
    }
}
