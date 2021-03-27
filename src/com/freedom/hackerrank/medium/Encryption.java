package com.freedom.hackerrank.medium;

import java.util.Scanner;

public class Encryption {
    static String encryption(String s) {
        int length = s.length();
        String cipherText = "";
        int column = (int) Math.ceil(Math.pow(length, 0.5));

        for (int i = 0, j = 0; i<column; i++, j++){
            while (j<length){
                cipherText += s.charAt(j);
                j += column;
            }
            cipherText += " ";
            j = i;
        }
        return cipherText;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String plainText = scanner.nextLine();
        plainText = plainText.replaceAll("\\s+", "");
        System.out.println(encryption(plainText));
    }
}
