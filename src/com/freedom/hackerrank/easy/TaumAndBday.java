package com.freedom.hackerrank.easy;

import java.util.Scanner;

public class TaumAndBday {

    public static long taumBday(long b, long w, long bc, long wc, long z) {
        if((bc+z)<wc){
            return b*bc + (bc+z)*w;
        }else if((wc+z)<bc){
            return (wc+z)*b + wc*w;
        }
        return (bc*b) + (wc*w);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i<n; i++){
            long b = scanner.nextLong();
            long w = scanner.nextLong();
            long bc = scanner.nextLong();
            long wc = scanner.nextLong();
            long z = scanner.nextLong();
            System.out.println(taumBday(b, w, bc, wc, z));
        }
    }
}
