package com.freedom.easy;

import java.util.Scanner;

public class DayOfTheProgrammer {
    static String dayOfProgrammer(int year) {
        String dOTP = null;
        if(year == 1918){
            dOTP = "26.09." + year;
        }else if((year <= 1917 && year % 4 == 0) || (year >= 1919 && ((year % 4)== 0 & (year % 100) != 0) || (year%400)==0) ){
            dOTP = "12.09." + year;
        }else {
            dOTP = "13.09." + year;
        }

        return dOTP;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();

        System.out.println(dayOfProgrammer(y));
    }
}
