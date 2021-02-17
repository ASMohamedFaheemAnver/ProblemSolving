package com.freedom.hackerrank.easy;

import java.util.Scanner;

public class JumpingOnTheClouds {

    static int jumpingOnClouds(int[] c, int k) {
        int e = 100;
        int i = 0;
        do {
            i = (i+k)%c.length;
            if(c[i]==1){
                e -= 3;
            }else {
                e -= 1;
            }
        }while (i != 0);
        return e;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }

        System.out.println(jumpingOnClouds(c, k));
    }
}
