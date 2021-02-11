package com.freedom.hackerrank.easy;

import java.util.Scanner;

public class UtopianTree {
    static int[] uTopian = new int[60];
    static int utopianTree(int n) {
        return uTopian[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i<60; i++){
            if(i%2 == 0){
                try {
                    uTopian[i] += uTopian[i-1] + 1;
                }catch (Exception e){
                    uTopian[i] = 1;
                }
            }else {
                uTopian[i] = uTopian[i-1] * 2;
            }
        }

        int n = scanner.nextInt();
        for (int i = 0; i<n; i++){
            int t = scanner.nextInt();
            System.out.println(utopianTree(t));
        }
    }
}
