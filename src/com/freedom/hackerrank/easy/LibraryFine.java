package com.freedom.hackerrank.easy;

import java.util.Scanner;

public class LibraryFine {

    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if ((y1 - y2) > 0) {
            return 10000;
        } else if ((y2 - y1) > 0) {
            return 0;
        } else if ((m1 - m2) > 0) {
            return (m1 - m2) * 500;
        } else if ((m2 - m1) > 0) {
            return 0;
        }
        return (d1 - d2) > 0 ? (d1 - d2) * 15 : 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int d2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.println(libraryFine(d1, m1, y1, d2, m2, y2));
    }
}
