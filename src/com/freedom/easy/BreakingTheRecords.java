package com.freedom.easy;

import java.util.Scanner;

public class BreakingTheRecords {

    static int[] breakingRecords(int[] scores) {
        int[] record = new int[2];
        int max = scores[0];
        int min = scores[0];

        for (int i = 1; i<scores.length; i++){
            if (max < scores[i]) {
                record[0]++;
                max = scores[i];
            }else if(min > scores[i]){
                record[1]++;
                min = scores[i];
            }
        }

        return record;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ng = scanner.nextInt();
        scanner.nextLine();
        String tScores[];
        tScores = scanner.nextLine().split(" ");

        int[] scores = new int[ng];

        int i = 0;
        for (String x : tScores) {
            scores[i++] = Integer.parseInt(x);
        }

        int[] record = breakingRecords(scores);

        System.out.println(record[0] + " " + record[1]);
    }
}
