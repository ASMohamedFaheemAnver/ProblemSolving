package com.freedom.hackerrank.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BillDivision {

    static void bonAppetit(List<Integer> bill, int k, int b) {
        int total = 0;
        for (int i = 0; i<bill.size(); i++){
            total += bill.get(i);
        }
        total = total - bill.get(k);

        if(total/2 == b){
            System.out.println("Bon Appetit");
        }else {
            System.out.println(b - total/2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ni = scanner.nextLine().split(" ");
        int n = Integer.parseInt(ni[0]);
        int i = Integer.parseInt(ni[1]);
        List<Integer> bill = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int bc = scanner.nextInt();

        bonAppetit(bill, i, bc);
    }
}
