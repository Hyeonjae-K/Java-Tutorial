package codeUpPjt.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1068 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());
        if (score >= 90) {
            System.out.print("A");
        } else if (score >= 70) {
            System.out.print("B");
        } else if (score >= 40) {
            System.out.print("C");
        } else {
            System.out.print("D");
        }
    }
}
