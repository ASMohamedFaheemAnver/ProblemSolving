package com.freedom.hackerrank.easy;
import java.util.Scanner;

public class FindDigits {
    static int findDigits(int n) {
        String sN = String.valueOf(n);
        int divisors = 0;
        for (int i = 0; i < sN.length(); i++) {
            try{
                if ((n % Integer.parseInt(String.valueOf(sN.charAt(i)))) == 0) {
                    divisors++;
                }
            }catch (ArithmeticException e){

            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.println(findDigits(scanner.nextInt()));
        }
    }
}
