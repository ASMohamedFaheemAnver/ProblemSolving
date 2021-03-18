package com.freedom.hackerrank.medium;

import java.util.Scanner;

public class Queens2Attack {
    // Time c : O(n), Space c : O(n^2)
    // Current solution producing memory exception
    static int queensAttack(int n, int[][] obstacles, int rq, int cq) {
        int count = 0;
        for (int y = rq - 2, x = cq - 2; ((x >= 0) && (y >= 0)); x--, y--) {
            if (obstacles[y][x] != 0) {
                break;
            }
            count++;
        }

        for (int y = rq, x = cq; ((x < n) && (y < n)); x++, y++) {
            if (obstacles[y][x] != 0) {
                break;
            }
            count++;
        }

        for (int y = rq - 2; y >= 0; y--) {
            if (obstacles[y][cq - 1] != 0) {
                break;
            }
            count++;
        }

        for (int y = rq; y < n; y++) {
            if (obstacles[y][cq - 1] != 0) {
                break;
            }
            count++;
        }

        for (int x = cq - 2; x >= 0; x--) {
            if (obstacles[rq - 1][x] != 0) {
                break;
            }
            count++;
        }

        for (int x = cq; x < n; x++) {
            if (obstacles[rq - 1][x] != 0) {
                break;
            }
            count++;
        }

        for (int y = rq - 2, x = cq; ((x < n) && (y >= 0)); x++, y--) {
            if (obstacles[y][x] != 0) {
                break;
            }
            count++;
        }

        for (int y = rq, x = cq - 2; ((x >= 0) && (y < n)); x--, y++) {
            if (obstacles[y][x] != 0) {
                break;
            }
            count++;
        }

        return count;
    }

    // I think storing 2D obstacles is the issue
    // To do
    /*
        We can keep a running closest obstacle
        for each direction(8 total) with relation to
        our queen as we read in all the obstacles from stdin
        then we can just calculate the squares covered
        using the distance between two points for each
        of the closest obstacles.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        int rq = scanner.nextInt();
        int cq = scanner.nextInt();
        int[][] obstacles = new int[n][n];
        // Only for debugging purpose
        obstacles[rq - 1][cq - 1] = 2;
        for (int i = 0; i < k; i++) {
            obstacles[scanner.nextInt() - 1][scanner.nextInt() - 1] = 1;
        }
        System.out.println(queensAttack(n, obstacles, rq, cq));
    }
}
