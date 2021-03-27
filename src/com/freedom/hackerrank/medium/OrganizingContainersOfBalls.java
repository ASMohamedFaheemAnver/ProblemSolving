package com.freedom.hackerrank.medium;

import java.util.Arrays;
import java.util.Scanner;

public class OrganizingContainersOfBalls {
    static String organizingContainers(int n, int[][] container) {
        String isItPossible = "Possible";
        int[] containerCapacity = new int[n];
        int[] totalBall = new int[n];

        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                containerCapacity[i] += container[i][j];
                totalBall[i] += container[j][i];
            }
        }

        Arrays.sort(containerCapacity);
        Arrays.sort(totalBall);
        for (int i = 0; i<n; i++){
            if (containerCapacity[i]!=totalBall[i]){
                isItPossible = "Impossible";
                break;
            }
        }

        return isItPossible;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i = 0; i<q; i++){
            int n = scanner.nextInt();
            int[][] matrix = new int[n][n];
            for (int j = 0; j<n; j++){
                for (int x = 0; x<n; x++){
                    matrix[j][x] = scanner.nextInt();
                }
            }
            System.out.println(organizingContainers(n, matrix));
        }
    }
}
