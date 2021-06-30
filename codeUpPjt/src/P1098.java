package codeUpPjt.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1098 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer[][] map = new Integer[100][100];
        String[] size = br.readLine().split(" ");
        int n = Integer.parseInt(br.readLine());
        int w = Integer.parseInt(size[1]), h = Integer.parseInt(size[0]);

        for (int i = 0; i < h; i++) {
            Arrays.fill(map[i], 0);
        }

        for (int i = 0; i < n; i++) {
            String[] nums = br.readLine().split(" ");
            int l = Integer.parseInt(nums[0]);
            int d = Integer.parseInt(nums[1]);
            int y = Integer.parseInt(nums[2]) - 1;
            int x = Integer.parseInt(nums[3]) - 1;

            if (d == 0) {
                for (int j = x; j < x + l; j++) {
                    map[y][j] = 1;
                }
            } else {
                for (int j = y; j < y + l; j++) {
                    map[j][x] = 1;
                }
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
