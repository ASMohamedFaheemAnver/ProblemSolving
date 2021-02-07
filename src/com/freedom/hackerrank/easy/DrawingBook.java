package com.freedom.hackerrank.easy;

import java.util.Scanner;

public class DrawingBook {

    static int pageCount(int n, int p) {
        int cn;

        int tP = (int) (Math.ceil(((float)n-1)/2) + 1);
        int pP = (int) (Math.ceil(((float)p-1)/2) + 1);

        if((pP - 1) > (tP - pP)){
            cn  = tP - pP;
        }else {
            cn = pP - 1;
        }
        return cn;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();

        System.out.println(pageCount(n, p));
    }
}
