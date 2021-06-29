package codeUpPjt.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1076 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c = br.readLine().charAt(0), t = 'a';
        while (true) {
            System.out.print(t + " ");
            if (t == c) {
                break;
            }
            t++;
        }
    }
}
