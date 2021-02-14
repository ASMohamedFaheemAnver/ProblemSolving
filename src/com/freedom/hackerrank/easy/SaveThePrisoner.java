package com.freedom.hackerrank.easy;

import java.util.Scanner;

public class SaveThePrisoner {

    static int saveThePrisoner(int n, int m, int s) {
        return ((m + s - 2) % n) + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sq = scanner.nextInt();
        for (int i = 0; i < sq; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int s = scanner.nextInt();
            System.out.println(saveThePrisoner(n, m, s));
        }
    }
}
