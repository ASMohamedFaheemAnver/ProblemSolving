package com.freedom.codechef.medium;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FORG {
    // Time N^3 | Space 1
    static int getNumberOfSubstringsWithSpecialCharacter(String string, String specialCharacter){
        int numberOfMatches = 0;
        for (int i = 0; i<string.length(); i++){
            for (int j = i; j<string.length(); j++){
                if(string.substring(i, j+1).contains(specialCharacter)){
                    numberOfMatches++;
                }
            }
        }
        return numberOfMatches;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i<testCases; i++){
            bufferedReader.readLine();
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String string = stringTokenizer.nextToken();
            String specialCharacter = stringTokenizer.nextToken();
            System.out.println(getNumberOfSubstringsWithSpecialCharacter(string, specialCharacter));
        }
    }
}
