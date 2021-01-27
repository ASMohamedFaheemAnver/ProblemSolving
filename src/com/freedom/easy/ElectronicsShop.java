package com.freedom.easy;

import java.util.Scanner;

public class ElectronicsShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int mA = -1;
        int[] memo = new int[b];

        for (int i = 0; i < keyboards.length; i++) {
            try {
                memo[keyboards[i] - 1] = 1;
            } catch (Exception e) {
            }
        }

        for (int i = b - 1; i >= 0; i--) {
            if (memo[i] == 1) {
                for (int j = 0; j < drives.length; j++) {
                    try {
                        memo[i + drives[j]] = 2;
                    } catch (Exception e) {
                    }
                }
            }
        }

        for (int i = b - 1; i >= 0; i--) {
            if (memo[i] == 2) {
                mA = i + 1;
                break;
            }
        }

        return mA;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        scanner.nextLine();
        String[] sKeyboards = scanner.nextLine().split(" ");
        String[] sDrives = scanner.nextLine().split(" ");

        int[] keyboards = new int[n];
        int[] drives = new int[m];

        for (int i = 0; i < n; i++) {
            keyboards[i] = Integer.parseInt(sKeyboards[i]);
        }

        for (int i = 0; i < m; i++) {
            drives[i] = Integer.parseInt(sDrives[i]);
        }

        System.out.println(getMoneySpent(keyboards, drives, b));
    }
}
