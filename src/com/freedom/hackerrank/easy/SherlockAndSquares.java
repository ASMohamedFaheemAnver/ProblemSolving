package com.freedom.hackerrank.easy;

import java.util.Scanner;

public class SherlockAndSquares {

    static int squares(int a, int b) {
        double rA = Math.pow(a, 0.5);
        if(rA == Math.floor(rA) ){
            rA--;
        }else {
            rA = Math.floor(rA);
        }

        double rB = Math.floor(Math.pow(b, 0.5));

        return (int)(rB - rA);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i = 0; i<q; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(squares(a, b));;
        }
    }
}
