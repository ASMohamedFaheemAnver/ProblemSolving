package com.freedom.hackerrank.easy;

import java.util.Scanner;

public class ModifiedKaprekarNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int q = scanner.nextInt();

        boolean isExist = false;
        for (long i = p; i <= q; i++) {
            long pow = i * i;
            int dev = Long.toString(pow).length() / 2;
            try {
                long sum = Long.parseLong(Long.toString(pow).substring(0, dev)) + Long.parseLong(Long.toString(pow).substring(dev));
                if (i == sum) {
                    isExist = true;
                    System.out.print(i + " ");
                }
            } catch (NumberFormatException e) {
                if (i == 1) {
                    System.out.print(i + " ");
                }
            }

        }
        if (!isExist) {
            System.out.println("INVALID RANGE");
        }
    }
}
