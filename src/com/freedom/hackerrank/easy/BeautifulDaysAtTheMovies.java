package com.freedom.hackerrank.easy;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {

    static int beautifulDays(int i, int j, int k) {
        int bD = 0;
        for (int ii = i; ii <= j; ii++) {
            StringBuilder sR = new StringBuilder(String.valueOf(ii));
            int r = Integer.parseInt(sR.reverse().toString());
            int rem = Math.abs(r - ii);
            if((rem%k)==0){
                bD++;
            }
        }
        return bD;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println(beautifulDays(i, j, k));
    }
}
