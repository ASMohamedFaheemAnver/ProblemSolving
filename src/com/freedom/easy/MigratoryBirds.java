package com.freedom.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MigratoryBirds {

    static int migratoryBirds(List<Integer> arr) {
        int[] birdMap = new int[5];
        int max = 0;
        int maxO = 0;

        for (int i = 0; i<arr.size(); i++){
            birdMap[arr.get(i)-1]++;
            if(maxO < birdMap[arr.get(i)-1]){
                maxO = birdMap[arr.get(i)-1];
                max = arr.get(i);
            }else if(maxO == birdMap[arr.get(i)-1]){
                if(max > arr.get(i)){
                    max = arr.get(i);
                }
            }
        }

        return max;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        scanner.nextLine();
        List<Integer> arr = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(migratoryBirds(arr));
    }
}
