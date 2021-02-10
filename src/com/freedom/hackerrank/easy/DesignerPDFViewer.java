package com.freedom.hackerrank.easy;

import java.util.Scanner;

public class DesignerPDFViewer {
    static int designerPdfViewer(int[] h, String word) {
        int max = 0;
        for (int i = 0; i < word.length(); i++) {
            if (max < h[word.charAt(i)-97]){
                max = h[word.charAt(i)-97];
            }
        }
        return max * word.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] sHeight = scanner.nextLine().split(" ");
        String word = scanner.nextLine().trim();
        int[] height = new int[sHeight.length];
        for (int i = 0; i < sHeight.length; i++) {
            height[i] = Integer.parseInt(sHeight[i]);
        }
        System.out.println(designerPdfViewer(height, word));
    }
}
