package codeUpPjt.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1027 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] date = br.readLine().split("\\.");
        System.out.printf("%02d-%02d-%04d", Integer.parseInt(date[2]), Integer.parseInt(date[1]),
                Integer.parseInt(date[0]));
    }
}
