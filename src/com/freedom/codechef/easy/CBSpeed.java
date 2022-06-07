package com.freedom.codechef.easy;

import java.util.Scanner;

public class CBSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int thresholdSpeed = scanner.nextInt();
        int currentSpeed = scanner.nextInt();
        if(thresholdSpeed >= currentSpeed) {
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }
}
