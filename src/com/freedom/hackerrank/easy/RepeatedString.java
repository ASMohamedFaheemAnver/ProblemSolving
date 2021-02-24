package com.freedom.hackerrank.easy;

import java.util.Scanner;

public class RepeatedString {
    static long repeatedString(String s, long n) {
        long iteration = (n/s.length());
        int remaining = (int) (n%s.length());
        int totalCharInOneIteration = 0;
        long totalAInIteration = 0;
        for (int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='a'){
                if(remaining>0 && i<=(remaining-1)){
                    totalAInIteration++;
                }
                totalCharInOneIteration++;
            }
        }
        totalAInIteration += (iteration*totalCharInOneIteration);
        return totalAInIteration;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        long n = scanner.nextLong();

        System.out.println(repeatedString(s, n));
    }
}
