package com.freedom.codechef.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CBSpeed {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int thresholdSpeed = Integer.parseInt(stringTokenizer.nextToken());
        int currentSpeed = Integer.parseInt(stringTokenizer.nextToken());
        if(thresholdSpeed >= currentSpeed) {
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }
}
