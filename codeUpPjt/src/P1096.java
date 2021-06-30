package codeUpPjt.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1096 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer[][] map = new Integer[20][20];
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < 20; i++) {
            Arrays.fill(map[i], 0);
        }

        for (int i = 0; i < n; i++) {
            String[] nums = br.readLine().split(" ");
            int x = Integer.parseInt(nums[0]);
            int y = Integer.parseInt(nums[1]);
            map[x][y] = 1;
        }
        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
