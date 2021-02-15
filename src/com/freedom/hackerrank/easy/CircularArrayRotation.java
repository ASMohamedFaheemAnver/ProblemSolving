package com.freedom.hackerrank.easy;

import java.util.Scanner;

public class CircularArrayRotation {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] results = new int[queries.length];
        int[] ak = new int[a.length];

        for (int i = 0; i<a.length; i++){
            ak[(i + k)%a.length] = a[i];
        }

        for (int i = 0; i<queries.length; i++){
            results[i] = ak[queries[i]];
        }

        return results;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int q = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int[] que = new int[q];
        for (int i = 0; i < q; i++) {
            que[i] = scanner.nextInt();
        }

        int[] results = circularArrayRotation(a, k, que);
        for (int r : results) {
            System.out.println(r);
        }
    }
}
