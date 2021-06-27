package codeUpPjt.src;

import java.util.Scanner;

public class P1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] timeStrings = sc.next().split(":");
        System.out.printf("%s:%s", timeStrings[0], timeStrings[1]);
        sc.close();
    }
}
