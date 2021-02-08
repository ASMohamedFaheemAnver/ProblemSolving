package com.freedom.hackerrank.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ClimbingLeaderboard {
    // Time c : o^2, Space c : o^2
    public static List<Integer> mClimbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < player.size(); i++) {
            int height = 0;
            for (int j = 0; j <= ranked.size(); j++) {
                try {
                    if (!ranked.get(j).equals(ranked.get(j - 1))) {
                        height++;
                    }
                } catch (Exception e) {
                    height++;
                    if (ranked.size() == j) {
                        ranked.add(player.get(i));
                        res.add(height);
                        break;
                    }
                }
                if (ranked.get(j) <= player.get(i)) {
                    res.add(height);
                    ranked.add(j, player.get(i));
                    break;
                }
            }
        }
        return res;
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> res = new ArrayList<>();
        ranked = ranked.stream().distinct().collect(Collectors.toList());
        for (int i = 0; i<player.size(); i++){
            while (!ranked.isEmpty() && (player.get(i) >= ranked.get(ranked.size()-1))){
                ranked.remove(ranked.size()-1);
            }
            res.add(ranked.size()+1);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        List<Integer> ranked = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        scanner.nextLine();
        List<Integer> player = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> res = climbingLeaderboard(ranked, player);
        res.forEach(r -> {
            System.out.println(r);
        });
    }
}
