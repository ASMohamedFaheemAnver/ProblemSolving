package com.freedom.hackerrank.medium;

import java.util.Scanner;

public class NonDivisibleSubset {

    public static int nonDivisibleSubset(int k, int[] s) {
        int sum = 0;
        for (int i = 0; i<=k/2; i++){
            if(i==0 && s[i]>0){
                sum++;
            }else if(i!=0 && k%2==0 && i==k/2){
                sum++;
            }else if(i!=0) {
                sum += s[i] > s[k-i] ? s[i] : s[k-i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] s = new int[k];

        for (int i = 0; i<n; i++){
            s[scanner.nextInt()%k] += 1;
        }
        System.out.println(nonDivisibleSubset(k, s));
    }
}
