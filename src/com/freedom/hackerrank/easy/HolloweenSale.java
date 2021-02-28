package com.freedom.hackerrank.easy;

import java.util.Scanner;

public class HolloweenSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();

        boolean isFinished = false;

        int sum = 0;
        int count = 0;
        while (!isFinished){
            if(sum>=s){
                isFinished = true;
                continue;
            }
            sum += p;
            if (sum<s){
                count++;
            }else if (sum==s){
                count++;
                continue;
            }
            p = (p - d) >= m ? (p - d) : m;
        }
        System.out.println(count);
    }
}
