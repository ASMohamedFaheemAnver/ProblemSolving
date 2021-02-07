package com.freedom.hackerrank.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        final int[] max = {0};
        int map[] = new int[100];
        a.forEach(n -> {
            map[n-1]++;
        });

        a.forEach(n->{
            if((map[n-1] + map[n])> max[0]){
                max[0] = map[n-1] + map[n];
            }
        });

        return max[0];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<Integer> a = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(pickingNumbers(a));
    }
}
