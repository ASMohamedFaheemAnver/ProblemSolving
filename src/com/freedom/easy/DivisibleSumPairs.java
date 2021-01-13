package com.freedom.easy;

import java.util.Scanner;

public class DivisibleSumPairs {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int div = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (((ar[i] + ar[j]) % k) == 0) {
                    div++;
                }
            }
        }

        return div;
    }

    static int divisibleSumPairsOP(int n, int k, int[] ar) {
        int count = 0;

        int[] memo = new int[k];

        for (int i = 0; i < n - 1; i++) {
            int number = ar[i] % k;
            int complement = number == 0 ? k : number;
            memo[number] += 1;
            count += memo[k - complement];
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        String[] tSeq = scanner.nextLine().split(" ");

        int[] seq = new int[n];
        for (int i = 0; i < tSeq.length; i++) {
            seq[i] = Integer.parseInt(tSeq[i]);
        }

        System.out.println(divisibleSumPairsOP(n, k, seq));
    }
}
