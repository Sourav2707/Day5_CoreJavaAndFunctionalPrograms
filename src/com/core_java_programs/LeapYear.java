package com.core_java_programs;
import java.util.Random;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the year in 4 digits");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year >= 1000) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println("The year " + year + " is a leap year");
            } else
                System.out.println("The year " + year + " is not a leap year");
        }
        else
            System.out.println("The year should be 4 digits");
    }
}
