package com.freedom.hackerrank.easy;

import java.util.Scanner;

public class EqualizeTheArray {
    static int equalizeArray(int[] arr, int n) {
        int max = -1;
        for (int i = 0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return n - max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[100];
        for (int i = 0; i<n; i++){
            arr[scanner.nextInt()-1] += 1;
        }
        System.out.println(equalizeArray(arr, n));
    }
}
