package com.freedom.hackerrank.easy;

import java.util.Scanner;

public class ACMICPCTeam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine().toCharArray();
        }
        int max = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n && j != i; j++) {
                int tempMax = 0;
                for (int k = 0; k < m; k++) {
                    if ((arr[i][k] != arr[j][k]) ||
                            (Character.getNumericValue(arr[i][k]) > 0 && Character.getNumericValue(arr[j][k]) > 0)) {
                        tempMax++;
                    }
                }
                if(max<tempMax){
                    max = tempMax;
                    count = 1;
                }else if (max==tempMax){
                    count++;
                }
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
