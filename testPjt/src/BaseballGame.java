package testPjt.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
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
        ArrayList<int[]> inputs = new ArrayList<int[]>();
        ArrayList<int[]> records = new ArrayList<int[]>();

        for (int i = 0; i < 8; i++) {
            int[] record = new int[3];
            int[] input = parseInput((String) br.readLine());
            Arrays.fill(record, 0);
            inputs.add(input);

            for (int j = 0; j < 3; j++) {
                int t = input[j];
                if (num[j] == t) {
                    record[0]++;
                } else if (Arrays.stream(num).anyMatch(x -> x == t)) {
                    record[1]++;
                } else {
                    record[2]++;
                }
            }
            records.add(record);

            if (record[0] == 3) {
                System.out.println(Arrays.toString(num));
                break;
            }
            for (int j = 0; j < 3; j++) {
                System.out.print(record[j] + " ");
            }
            System.out.println();
        }
        System.out.println("Random number is " + Arrays.toString(num));

        for (int i = 0; i < inputs.size(); i++) {
            System.out.println(Arrays.toString(inputs.get(i)) + ": " + Arrays.toString(records.get(i)));
        }
    }
}
