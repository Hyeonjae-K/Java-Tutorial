package testPjt.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.io.InputStreamReader;

public class BaseballGame {
    public static int[] getRand() {
        Random rand = new Random();
        int num[] = new int[3];

        while (true) {
            num[0] = rand.nextInt(9) + 1;
            num[1] = rand.nextInt(10);
            num[2] = rand.nextInt(10);

            if (num[0] != num[1] && num[0] != num[2] && num[1] != num[2]) {
                break;
            }
        }

        return num;
    }

    public static int[] parseInput(String input) {
        int n = Integer.parseInt(input);
        int num[] = { n / 100, (n / 10) % 10, n % 10 };
        return num;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num[] = getRand();

        for (int i = 0; i < 8; i++) {
            int s = 0, b = 0, o = 0;
            int[] input = parseInput((String) br.readLine());

            for (int j = 0; j < 3; j++) {
                int t = input[j];
                if (num[j] == t) {
                    s++;
                } else if (Arrays.stream(num).anyMatch(x -> x == t)) {
                    b++;
                } else {
                    o++;
                }
            }

            if (s == 3) {
                System.out.println(Arrays.toString(num));
                break;
            }
            System.out.println(s + " " + b + " " + o);
        }
    }
}
