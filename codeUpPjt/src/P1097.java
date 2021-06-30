package codeUpPjt.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1097 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] map = new String[19][19];
        int n;

        for (int i = 0; i < 19; i++) {
            map[i] = br.readLine().split(" ");
        }

        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] locs = br.readLine().split(" ");
            int y = Integer.parseInt(locs[0]) - 1;
            int x = Integer.parseInt(locs[1]) - 1;
            for (int j = 0; j < 19; j++) {
                if (Integer.parseInt(map[y][j]) == 0) {
                    map[y][j] = "1";
                } else {
                    map[y][j] = "0";
                }
            }
            for (int j = 0; j < 19; j++) {
                if (Integer.parseInt(map[j][x]) == 0) {
                    map[j][x] = "1";
                } else {
                    map[j][x] = "0";
                }
            }
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
