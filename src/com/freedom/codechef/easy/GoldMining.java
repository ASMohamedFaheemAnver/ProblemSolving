package com.freedom.codechef.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GoldMining {
    static double getIndividualMinedGold(double totalAvailableGold, double personOneNeededDay, double personTwoNeededDay){
        return (personTwoNeededDay/(personOneNeededDay+personTwoNeededDay))*totalAvailableGold;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i<testCases; i++){
            int numberMines = Integer.parseInt(bufferedReader.readLine());
            double chefMinedGold = 0;
            double chefuMinedGold = 0;
            for (int j = 0; j<numberMines; j++){
                StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                double totalAvailableGold = Double.parseDouble(stringTokenizer.nextToken());
                double chefNeededDaysToComplete = Double.parseDouble(stringTokenizer.nextToken());
                double chefuNeededDaysToComplete = Double.parseDouble(stringTokenizer.nextToken());
                chefMinedGold += getIndividualMinedGold(totalAvailableGold, chefNeededDaysToComplete, chefuNeededDaysToComplete);
                chefuMinedGold += getIndividualMinedGold(totalAvailableGold, chefuNeededDaysToComplete, chefNeededDaysToComplete);
            }
            System.out.printf("%f %f\n", chefMinedGold, chefuMinedGold);
        }
    }
}
