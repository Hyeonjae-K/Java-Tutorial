package codeUpPjt.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c = br.readLine().charAt(0);
        if (c == 'A') {
            System.out.print("best!!!");
        } else if (c == 'B') {
            System.out.print("good!!");
        } else if (c == 'C') {
            System.out.print("run!");
        } else if (c == 'D') {
            System.out.print("slowly~");
        } else {
            System.out.print("what?");
        }
    }
}
