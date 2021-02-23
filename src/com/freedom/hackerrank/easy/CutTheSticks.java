package com.freedom.hackerrank.easy;

import java.util.Arrays;
import java.util.Scanner;

public class CutTheSticks {

    static int[] cutTheSticks(int[] arr) {
        int[] res = new int[arr.length];
        Arrays.sort(arr);
        res[0] = arr.length;
        int j = 1;
        for (int i = 0; i<arr.length-1; i++){
            if(arr[i]!=arr[i+1]){
                res[j++] = arr.length - (i+1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] res = cutTheSticks(arr);
        for (int i = 0; (i < res.length) && res[i]!=0; i++) {
            System.out.println(res[i]);
        }
    }
}
