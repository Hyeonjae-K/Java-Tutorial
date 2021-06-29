package codeUpPjt.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1079 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] chars = br.readLine().split(" ");
        for (String t : chars) {
            System.out.println(t);
            if (t.equals("q")) {
                break;
            }
        }
    }
}
