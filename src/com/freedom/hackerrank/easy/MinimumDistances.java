package com.freedom.hackerrank.easy;

import java.util.Scanner;

public class MinimumDistances {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX = 100000;
        int[] arr = new int[MAX];
        int n = scanner.nextInt();
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int index = scanner.nextInt();
            if (arr[index - 1] > 0 || arr[index - 1] < 0) {
                int tempDistance = (i - (arr[index - 1] < 0 ? 0 : arr[index - 1]));
                if (minDistance > tempDistance) {
                    minDistance = tempDistance;
                }
            } else {
                arr[index - 1] = i > 0 ? i : -1;
            }
        }
        System.out.println(minDistance != Integer.MAX_VALUE ? minDistance : -1);
    }
}
