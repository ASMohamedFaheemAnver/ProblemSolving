package com.freedom.hackerrank.easy;

import java.util.Scanner;

public class BeautifulTriplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX = 20000;
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[] arr = new int[MAX];
        int max = 0;
        for (int i = 0; i < n; i++) {
            int index = scanner.nextInt();
            arr[index] += 1;
            if (max<index){
                max = index;
            }
        }
        int count = 0;
        for (int i = 0; i <= max-2*d; i++) {
            if (arr[i]>0 && arr[i+d]>0 && arr[i+2*d]>0){
                count += arr[i]*arr[i+d]*arr[i+2*d];
            }
        }
        System.out.println(count);
    }
}
