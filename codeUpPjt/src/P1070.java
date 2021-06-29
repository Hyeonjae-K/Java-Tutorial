package codeUpPjt.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1070 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int month = Integer.parseInt(br.readLine());
        if (month < 3 || month == 12) {
            System.out.print("winter");
        } else if (month < 6) {
            System.out.print("spring");
        } else if (month < 9) {
            System.out.print("summer");
        } else {
            System.out.print("fall");
        }
    }
}
