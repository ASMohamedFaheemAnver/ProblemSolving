package com.freedom.codechef.medium;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FORG {
    // Time N^3 | Space 1
    static int getNumberOfSubstringsWithSpecialCharacter(String string, char specialCharacter){
        int numberOfMatches = 0;
        for (int i = 0; i<string.length(); i++){
            for (int j = i; j<string.length(); j++){
                if(string.substring(i, j+1).contains(String.valueOf(specialCharacter))){
                    numberOfMatches++;
                }
            }
        }
        return numberOfMatches;
    }

    static long getNumberOfSubstringsWithSpecialCharacterOptimized(String string, char specialCharacter, int length){
        long numberOfMatches = 0;
        for (int i = 0; i<length; i++){
            for (int j = i; j<length; j++){
                if(string.charAt(j) == specialCharacter){
                    numberOfMatches += (length-j);
                    break;
                }
            }
        }
        return numberOfMatches;
    }

    static int getNumberOfSubstringsWithSpecialCharacterAlternativeOptimized(String string, char specialCharacter, int length){
        int numberOfMatches = 0;
        int left = 0;
        for (int i = 0; i<length; i++){
            left++;
            if(string.charAt(i) == specialCharacter){
                numberOfMatches += left*(length-i);
                left = 0;
            }
        }
        return numberOfMatches;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i<testCases; i++){
            int length = Integer.parseInt(bufferedReader.readLine());
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String string = stringTokenizer.nextToken();
            char specialCharacter = stringTokenizer.nextToken().charAt(0);
            System.out.println(getNumberOfSubstringsWithSpecialCharacterOptimized(string, specialCharacter, length));
        }
    }
}
