package com.freedom.hackerrank.easy;

import java.util.Scanner;

public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        int valley = 0;
        int e = 0;
        boolean start = false;

        for (int i = 0; i<steps; i++){
            if(path.charAt(i) == 'U'){
                e++;
                if(e==0 && start){
                    valley++;
                    start = false;
                }
            }else {
                e--;
                if (e<0){
                    start = true;
                }
            }
        }
        return valley;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int steps = scanner.nextInt();
        scanner.nextLine();
        String path = scanner.nextLine();

        System.out.println(countingValleys(steps, path));
    }
}
