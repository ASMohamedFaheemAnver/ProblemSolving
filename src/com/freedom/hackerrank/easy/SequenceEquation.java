package com.freedom.hackerrank.easy;

import java.util.Scanner;

public class SequenceEquation {
    static int[] permutationEquation(int[] p) {
        int[] res = new int[p.length];
        for (int i = 0; i<p.length; i++){
            res[i] = p[p[i] - 1];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] p = new int[n];

        for (int i = 0; i<n; i++){
            p[scanner.nextInt() - 1] = i + 1;
        }

        int[] res = permutationEquation(p);
        for (int num: res) {
            System.out.println(num);
        }
    }
}
