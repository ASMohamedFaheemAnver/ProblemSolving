package com.freedom.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SubArrayDivision {

    static int birthday(List<Integer> s, int d, int m) {
        int match = 0;

        for (int i = 0; i<=s.size() - m; i++){
            int sum = 0;
            for (int j = i; j< i + m; j++){
                sum += s.get(j);
                if(sum>d){
                    break;
                }
            }
            if(sum == d){
                match++;
            }
        }

        return match;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        scanner.nextLine();
        List<Integer> seq = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(birthday(seq, d, m));
    }
}
