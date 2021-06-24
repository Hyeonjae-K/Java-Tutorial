package testPjt.src;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;

        int a, b, c;
        a = in.read();
        b = in.read();
        c = in.read();
        System.out.print(a + " ");
        System.out.print(b + " ");
        System.out.print(c + " ");
        System.out.println();

        byte[] A = new byte[3];
        in.read(A);
        System.out.print((char) A[0] + " ");
        System.out.print((char) A[1] + " ");
        System.out.print((char) A[2] + " ");
        System.out.println();

        InputStreamReader reader = new InputStreamReader(in);
        char[] C = new char[3];
        reader.read(C);
        System.out.print(C[0] + " ");
        System.out.print(C[1] + " ");
        System.out.print(C[2] + " ");
        System.out.println();

        BufferedReader br = new BufferedReader(reader);
        String str = br.readLine();
        System.out.println(str);

        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());
    }
}
