package com.freedom.hackerrank.easy;
import java.util.Scanner;

public class AngryProfessor {
    static String angryProfessor(int k, int[] a) {
        int exp = 0;
        for (int i = 0; i<a.length; i++){
            if(a[i] <= 0){
                exp++;
            }
        }
        return exp >= k ? "NO" : "YES";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i<t; i++){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            scanner.nextLine();
            String[] sA = scanner.nextLine().split(" ");
            int[] a = new int[n];
            for (int j = 0; j<n; j++){
                a[j] = Integer.parseInt(sA[j]);
            }
            System.out.println(angryProfessor(k, a));
        }
    }
}
