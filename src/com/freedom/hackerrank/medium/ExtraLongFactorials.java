package com.freedom.hackerrank.medium;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {
    static BigInteger extraLongFactorials(BigInteger n) {
        if (n.equals(BigInteger.valueOf(0))) {
            return BigInteger.valueOf(1);
        }
        return n.multiply(extraLongFactorials(n.subtract(BigInteger.valueOf(1))));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(extraLongFactorials(new BigInteger(String.valueOf(n))));
    }
}
