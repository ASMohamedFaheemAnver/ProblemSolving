package com.freedom.hackerrank.easy;

import java.util.Scanner;

public class CatAndMouse {

    static String catAndMouse(int x, int y, int z) {
        String res;
        int xz = Math.abs(z - x);
        int yz = Math.abs(z - y);

        if(xz > yz){
            res = "Cat B";
        }else if(yz > xz){
            res = "Cat A";
        }else {
            res = "Mouse C";
        }


        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();

        for (int i = 0; i<q; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            System.out.println(catAndMouse(x, y, z));
        }
    }
}
