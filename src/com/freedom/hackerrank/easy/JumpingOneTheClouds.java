package com.freedom.hackerrank.easy;

import java.util.Scanner;

public class JumpingOneTheClouds {
    static int jumpingOnClouds(int[] c) {
        int pointer = 0;
        int jump = 0;
        while (pointer != (c.length - 1)) {
            try {
                pointer += c[pointer + 2] != 1 ? 2 : 1;
            }catch (IndexOutOfBoundsException e){
                pointer++;
            }
            jump++;
        }
        return jump;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        System.out.println(jumpingOnClouds(c));
    }
}
