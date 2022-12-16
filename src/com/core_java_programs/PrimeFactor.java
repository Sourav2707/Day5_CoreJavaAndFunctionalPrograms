package com.core_java_programs;
import java.util.Scanner;
public class PrimeFactor {
    public static void main(String args[]) {
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ((a > 0) && (b > 0)) {
            System.out.println("The quotient is " + a / b);
            System.out.println("The remainder is " + a % b);
        } else {
            System.out.println("Invalud input, negative integers are not allowed");
        }
    }
}
