package com.freedom.hackerrank.medium;

import java.util.Scanner;

public class MagicSquare {

    static int formingMagicSquare(int[][] sq) {

        int minCost = Integer.MAX_VALUE;

        int magicMat[][] = {
                {4, 9, 2, 3, 5, 7, 8, 1, 6},
                {4, 3, 8, 9, 5, 1, 2, 7, 6},
                {2, 9, 4, 7, 5, 3, 6, 1, 8},
                {2, 7, 6, 9, 5, 1, 4, 3, 8},
                {8, 1, 6, 3, 5, 7, 4, 9, 2},
                {8, 3, 4, 1, 5, 9, 6, 7, 2},
                {6, 7, 2, 1, 5, 9, 8, 3, 4},
                {6, 1, 8, 7, 5, 3, 2, 9, 4},
        };

        for (int i = 0; i < 8; i++) {
            int cost = Math.abs(sq[0][0] - magicMat[i][0]) +
                    Math.abs(sq[0][1] - magicMat[i][1]) +
                    Math.abs(sq[0][2] - magicMat[i][2]) +
                    Math.abs(sq[1][0] - magicMat[i][3]) +
                    Math.abs(sq[1][1] - magicMat[i][4]) +
                    Math.abs(sq[1][2] - magicMat[i][5]) +
                    Math.abs(sq[2][0] - magicMat[i][6]) +
                    Math.abs(sq[2][1] - magicMat[i][7]) +
                    Math.abs(sq[2][2] - magicMat[i][8]);
            if(minCost > cost){
                minCost = cost;
            }
        }

        return minCost;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[][] sq = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sq[i][j] = scanner.nextInt();
            }
        }

        System.out.println(formingMagicSquare(sq));
    }
}
