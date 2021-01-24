package com.freedom.easy;

import java.util.Scanner;

public class SalesByMatch {

    static int sockMerchant(int n, int[] ar) {
        int[] map = new int[100];
        int p = 0;
        for (int i = 0; i < n; i++) {
            if (map[ar[i] - 1] == 1) {
                p++;
                map[ar[i] - 1] = 0;
                continue;
            }
            map[ar[i] - 1]++;
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] arr = scanner.nextLine().split(" ");
        int[] arrI = new int[n];

        for (int i = 0; i < n; i++) {
            arrI[i] = Integer.parseInt(arr[i]);
        }

        int r = sockMerchant(n, arrI);
        System.out.println(r);
    }
}
