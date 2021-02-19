package com.freedom.hackerrank.easy;

import java.util.Scanner;

public class AppendAndDelete {
    static String appendAndDelete(String s, String t, int k) {
        int i;
        for (i = 0; i<s.length(); i++){
            try {
                if(s.charAt(i) != t.charAt(i))
                    break;
            }catch (IndexOutOfBoundsException e){
                i--;
                break;
            }
        }
        int count = s.length() + t.length() - 2*i;
        if((count==k) || ((s.length()+t.length())<=k)){
            return "Yes";
        }else if((count%2 == k%2) && k>count){
            return "Yes";
        }
        return "No";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int k = scanner.nextInt();
        System.out.println(appendAndDelete(s, t, k));
    }
}
