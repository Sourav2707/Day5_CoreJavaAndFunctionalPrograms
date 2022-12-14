package com.core_java_programs;
import java.util.Scanner;
public class PowerOfTwo {
    public static void core(int n)

    {
        int limit = 31, num = 0;
        if (n <= limit)
        {
            while (num <= n)
            {
                double power = Math.pow(2, num);
                System.out.println(power);
                num++;
            }
        }
        else
        {
            System.out.println("Invalid input, limit is "+limit);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit less than 31 to display the power of 2: ");
        int limit = sc.nextInt();
        core(limit);
    }
}
