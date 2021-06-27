package codeUpPjt.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1019 {
    public static int[] stringToInt(String[] S) {
        int[] A = new int[3];
        for (int i = 0; i < S.length; i++) {
            A[i] = Integer.parseInt(S[i]);
        }
        return A;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split("\\.");
        int[] date = stringToInt(line);
        System.out.printf("%04d.%02d.%02d", date[0], date[1], date[2]);
    }
}
