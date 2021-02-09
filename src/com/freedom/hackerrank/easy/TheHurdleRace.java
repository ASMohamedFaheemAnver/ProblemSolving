package com.freedom.hackerrank.easy;

import java.util.Scanner;

public class TheHurdleRace {

    static int hurdleRace(int k, int[] height) {
        int max = 0;
        for (int i = 0; i<height.length; i++){
            if(max < height[i]){
                max = height[i];
            }
        }
        return (max - k) > 0 ? (max - k) : 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        String[] sHeight = scanner.nextLine().split(" ");
        int[] height = new int[n];
        for (int i = 0; i<n; i++){
            height[i] = Integer.parseInt(sHeight[i]);
        }
        System.out.println(hurdleRace(k, height));
    }
}
