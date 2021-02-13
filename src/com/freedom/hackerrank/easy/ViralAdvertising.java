package com.freedom.hackerrank.easy;

import java.util.Scanner;

public class ViralAdvertising {
    static final int INIT = 5;

    static int viralAdvertising(int n) {
        int cumulativeLikes = 0;
        int nS = INIT;
        for (int i = 0; i<n; i++){
            cumulativeLikes += nS/2;
            nS = (nS/2) * 3;
        }
        return cumulativeLikes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        System.out.println(viralAdvertising(day));
    }
}
